package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.entity.MrPickUp;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

@Component
public interface MrPickUpDao {

    @Insert("""
            INSERT INTO MR_PICKUP
            (DATE_OPE, MR_OPERATION_STATE_ID, MR_ADDRESS_ID, MR_USER_ID, MR_SCHEDULE_ID,
            MR_ORDER_ID, CODE_GEN, STATUS, TX_DATE, TX_USER,
            TX_HOST ,CREATED )
            VALUES ( #{ dateOpe } , 13, #{ mrAddressId } , 0 , #{ mrScheduleId },
            	    #{ mrOrderId }  , #{ codeGen } , 1, now(), 'admin',
                   'localhost', now() );
            """)
    void createNewPickUp(MrPickUp mrPickUp);
}
