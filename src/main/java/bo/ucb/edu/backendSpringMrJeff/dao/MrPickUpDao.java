package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.entity.MrPickUp;
import bo.ucb.edu.backendSpringMrJeff.entity.model.PickUpDetailsModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MrPickUpDao {

    @Insert("""
            INSERT INTO MR_PICKUP
            (DATE_OPE, MR_OPERATION_STATE_ID, MR_ADDRESS_ID, MR_USER_ID, MR_SCHEDULE_ID,
            MR_ORDER_ID, CODE_GEN, TIMESTAMP_PLANED, STATUS, TX_DATE,
            TX_USER, TX_HOST ,CREATED )
            VALUES ( #{ dateOpe } , 13, #{ mrAddressId } , 0 , #{ mrScheduleId },
            	    #{ mrOrderId }  , #{ codeGen } , #{ timePlaned } ,  1, now(),
            	    'admin', 'localhost', now() );
            """)
    void createNewPickUp(MrPickUp mrPickUp);

    @Select("""
            SELECT
                mp.mr_pickup_id, mp.date_ope, mp.mr_operation_state_id, ma.latitude, mos.description_state,
                mos.for_operation, ma.longitude, ms.time_start, ms.time_end, mper.first_name,
                mper.last_name
            FROM 
                MR_PICKUP mp
            JOIN MR_ORDER mo ON mo.mr_order_id = mp.mr_order_id
            JOIN MR_ADDRESS ma ON mp.mr_address_id  =ma.mr_address_id
            JOIN MR_OPERATION_STATE mos ON mos.mr_operation_state_id  = mp.mr_operation_state_id
            JOIN MR_SCHEDULE ms ON ms.mr_schedule_id = mp.mr_schedule_id
            JOIN MR_USER mu ON mu.mr_user_id  = mo.mr_user_id
            JOIN MR_PERSON mper ON mper.mr_person_id = mu.mr_person_id
            WHERE	mp.status = 1
            AND 	mo.status =1
            AND 	ma.status =1
            AND 	mos.status = 1
            AND     ms.status = 1
            AND     mu.status = 1
            AND     mper.status =1
            AND     mos.state = 'requestedPickUp'
            AND     mos.for_operation = 'pickup'
            AND     mp.timestamp_planed > now()
            ORDER BY  mp.timestamp_planed ;
                        
            """)
    List<PickUpDetailsModel> getPickUpAvailableForService();


    @Select("""
            SELECT
                mp.mr_pickup_id, mp.date_ope, mp.mr_operation_state_id, ma.latitude, mos.description_state,
                mos.for_operation, ma.longitude, ms.time_start, ms.time_end, mper.first_name,
            mper.last_name
            FROM MR_PICKUP mp 
            JOIN MR_ORDER mo ON mo.mr_order_id = mp.mr_order_id
            JOIN MR_ADDRESS ma ON mp.mr_address_id  =ma.mr_address_id
            JOIN MR_OPERATION_STATE mos ON mos.mr_operation_state_id  = mp.mr_operation_state_id
            JOIN MR_SCHEDULE ms ON ms.mr_schedule_id = mp.mr_schedule_id
            JOIN MR_USER mu ON mu.mr_user_id  = mo.mr_user_id
            JOIN MR_PERSON mper ON mper.mr_person_id = mu.mr_person_id
            WHERE	mp.status = 1
            AND 	mo.status =1
            AND 	ma.status =1
            AND 	mos.status = 1
            AND ms.status = 1
            AND mu.status = 1
            AND mper.status =1
            AND mp.mr_user_id = #{ userId }
            AND mp.mr_operation_state_id IN (
            	SELECT
            		mr_operation_state_id
            	FROM
            		MR_OPERATION_STATE
            	WHERE
            		state <> 'completedPickUp'
            	AND state <> 'canceledPickUp'
            	AND for_operation = 'pickup'
            )
            AND mp.timestamp_planed > now()
            ORDER BY  mp.timestamp_planed ;
                        
                        
            """)
    List<PickUpDetailsModel> getPickUpUserInvolved(Integer userId);

}
