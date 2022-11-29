package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.dto.ClothingOrderDto;
import bo.ucb.edu.backendSpringMrJeff.dto.NewClothingsOrder;
import bo.ucb.edu.backendSpringMrJeff.entity.MrOrder;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Component
public interface MrOrderDao {


        @Insert("""
                INSERT INTO MR_ORDER
                (COMMENT, MR_COUPONS_ID, MR_USER_ID, MR_OPERATION_STATE_ID, MR_PAYMENT_METHOD_ID,
                PAY_CASH, MR_INVOICE_ID, STATUS, TX_DATE, TX_USER,
                TX_HOST, CREATED )
                VALUES (' ', null , #{ mrUserId }, 1 , null
                                ,-1 , null , 1, now(), 'admin',
                                'localhost', now()  );
                
                """)
        void createNewOrder(MrOrder mrOrder);

        @Select("""
                SELECT currval('mr_order_mr_order_id_seq');
                """)
        Integer viewLastOrderCreated();


        @Insert("""
                INSERT INTO MR_CLOTHING_ORDER
                        (PRICE, QUANTITY, MR_SERVICE_ID, MR_ORDER_ID, STATUS, TX_DATE, TX_USER, TX_HOST, CREATED)  
                VALUES
                        (#{price}, #{quantity}, #{idClothing}, #{idOrder}, 1, now(), 'admin', 'localhost', now());
                """)
        void addClothingToOrder(NewClothingsOrder newClothingsOrder);


        @Update("""
            UPDATE
                MR_ORDER
            SET
                MR_OPERATION_STATE_ID = #{stateId} 
            WHERE 
                MR_ORDER_ID = #{ orderId } ;
            """)
        void updateValueOfOperationState(Integer stateId,  Integer orderId);


        @Select("""
                SELECT mr_clothing_order.quantity, mr_clothing.title, mr_clothing_images.url, SUM(mr_clothing_order.price) as total
                FROM mr_clothing_order
                INNER JOIN mr_service ON
                mr_service.mr_service_id = mr_clothing_order.mr_service_id
                INNER JOIN mr_clothing ON
                mr_service.mr_clothing_id = mr_clothing.mr_clothing_id
                INNER JOIN mr_clothing_images ON
                mr_clothing.mr_clothing_id = mr_clothing_images.mr_clothing_id
                WHERE mr_clothing_images.principal_image = 1
                AND mr_clothing.status = 1
                AND mr_service.status = 1
                AND mr_clothing_order.status = 1
                AND mr_clothing_order.mr_order_id = 1
                GROUP BY mr_clothing_order.quantity, mr_clothing.title, mr_clothing_images.url;       
                        """)
        List<ClothingOrderDto> getClothingOrder(Integer id);
        


}
