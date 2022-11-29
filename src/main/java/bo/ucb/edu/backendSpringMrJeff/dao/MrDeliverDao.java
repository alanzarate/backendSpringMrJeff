package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.dto.BodyClothingOrderDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrDeliver;
import bo.ucb.edu.backendSpringMrJeff.entity.MrPickUp;
import bo.ucb.edu.backendSpringMrJeff.entity.model.DeliverDetailModel;
import bo.ucb.edu.backendSpringMrJeff.entity.model.PickUpDetailsModel;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MrDeliverDao {


    @Select("""
            SELECT
                md.mr_deliver_id, md.date_ope, md.mr_operation_state_id, ma.latitude, mos.description_state,
                mos.for_operation, ma.longitude, ms.time_start, ms.time_end, mper.first_name,
                mper.last_name
            FROM MR_DELIVER md
            JOIN MR_ORDER mo ON mo.mr_order_id = md.mr_order_id
            JOIN MR_ADDRESS ma ON md.mr_address_id  = ma.mr_address_id
            JOIN MR_OPERATION_STATE mos ON mos.mr_operation_state_id  = md.mr_operation_state_id
            JOIN MR_SCHEDULE ms ON ms.mr_schedule_id = md.mr_schedule_id
            JOIN MR_USER mu ON mu.mr_user_id  = mo.mr_user_id
            JOIN MR_PERSON mper ON mper.mr_person_id = mu.mr_person_id
            WHERE	md.status = 1
            AND 	mo.status =1
            AND 	ma.status =1
            AND 	mos.status = 1
            AND ms.status = 1
            AND mu.status = 1
            AND mper.status =1
            AND mos.state = 'requestedDeliver'
            AND mos.for_operation = 'delivery'
            AND md.timestamp_planed > now()
            ORDER BY  md.timestamp_planed ;
                        
            """)
    List<DeliverDetailModel> getDeliverAvailableForService();


    @Select("""
            SELECT
                md.mr_deliver_id, md.date_ope, md.mr_operation_state_id, ma.latitude, mos.description_state,
                mos.for_operation, ma.longitude, ms.time_start, ms.time_end, mper.first_name,
                mper.last_name
            FROM MR_DELIVER md
            JOIN MR_ORDER mo ON mo.mr_order_id = md.mr_order_id
            JOIN MR_ADDRESS ma ON md.mr_address_id  = ma.mr_address_id
            JOIN MR_OPERATION_STATE mos ON mos.mr_operation_state_id  = md.mr_operation_state_id
            JOIN MR_SCHEDULE ms ON ms.mr_schedule_id = md.mr_schedule_id
            JOIN MR_USER mu ON mu.mr_user_id  = mo.mr_user_id
            JOIN MR_PERSON mper ON mper.mr_person_id = mu.mr_person_id
            WHERE	md.status = 1
            AND 	mo.status =1
            AND 	ma.status =1
            AND 	mos.status = 1
            AND ms.status = 1
            AND mu.status = 1
            AND mper.status =1
            AND md.mr_user_id = #{ userId }
            AND md.mr_operation_state_id IN (
            	SELECT
            		mr_operation_state_id
            	FROM
            		MR_OPERATION_STATE
            	WHERE
            		state <> 'completeDeliver'
            	AND state <> 'canceledDeliver'
            	AND for_operation = 'delivery'
            )
            AND md.timestamp_planed > now()
             ORDER BY  md.timestamp_planed ;
                        
                        
            """)
    List<DeliverDetailModel> getDeliveriesUserInvolved(Integer userId);


    @Select("""
            SELECT MR_DELIVER_ID, DATE_OPE, MR_OPERATION_STATE_ID, MR_ADDRESS_ID, MR_USER_ID, MR_SCHEDULE_ID,
                        MR_ORDER_ID, CODE_GEN, TIMESTAMP_PLANED, STATUS, TX_DATE,
                        TX_USER, TX_HOST ,CREATED FROM MR_DELIVER
                       WHERE STATUS = 1
            		   AND mr_deliver_id= #{ deliverId } ;
            """)
    MrDeliver getDeliverById(Integer deliverId);


    @Update("""
            UPDATE
                MR_DELIVER 
            SET 
                MR_OPERATION_STATE_ID = #{stateId}, 
                MR_USER_ID = #{ userId } 
            WHERE 
                MR_DELIVER_ID = #{ deliverId } ;
            """)
    void updateValueOfState(Integer stateId, Integer userId, Integer deliverId);

    @Insert("""
        INSERT INTO mr_delivery
        (date_ope, mr_operation_state_id, mr_address_id, mr_user_id, mr_schedule_id, mr_order_id, code_gen, status, tx_date, tx_user, tx_host, created)
        VALUES(now(), #{mrOperationStateId}, #{mrAddressId}, #{mrUserId}, #{mrScheduleId}, #{mrOrderId}, #{codeGen}, #{status}, #{txDate}, #{txUser}, #{txHost}, #{created});
            """)
    public void createDelivery(BodyClothingOrderDto bodyClothingOrderDto);
}
