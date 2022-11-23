package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.entity.model.DeliverDetailModel;
import bo.ucb.edu.backendSpringMrJeff.entity.model.PickUpDetailsModel;
import org.apache.ibatis.annotations.Select;
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
}
