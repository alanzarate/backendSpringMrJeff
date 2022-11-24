package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.entity.MrOperationState;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface MrOperationStateDao {



    @Select("""
            SELECT mr_operation_state_id, state, for_operation, description_state, should_show\s
            FROM MR_OPERATION_STATE
            WHERE status = 1
            AND mr_operation_state_id = #{ operationId } ;
            """)
    MrOperationState getMrOperationStateById(Integer operationId);


    @Select("""
            SELECT mr_operation_state_id, state, for_operation, description_state, should_show\s
            FROM MR_OPERATION_STATE
            WHERE status = 1
            AND state = #{state}
            AND for_operation = #{operation}
            """)
    MrOperationState getMrOperationStateByParameters(String state, String operation);

}
