package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.entity.MrOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
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

}
