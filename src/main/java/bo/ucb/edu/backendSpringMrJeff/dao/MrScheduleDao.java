package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.entity.MrSchedule;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MrScheduleDao {

    @Select("""
            SELECT
            	mr_schedule_id, time_start, time_end, detail, status
            FROM
            	MR_SCHEDULE
            WHERE
            	status = 1;
                        
            """)
    List<MrSchedule> getSchedule();
}
