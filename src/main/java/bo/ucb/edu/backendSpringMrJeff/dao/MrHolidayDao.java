package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.entity.MrHoliday;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface MrHolidayDao {

    @Select("""
            SELECT date_holiday, detail, status
            FROM MR_HOLIDAYS
            WHERE status = 1
            AND date_holiday >= now()
            AND date_holiday < now() +  interval '1 month';
            """)
    List<MrHoliday> getHolidaysInOneMonth();

    @Select("""
            SELECT date_holiday
            FROM MR_HOLIDAYS
            WHERE status = 1
            AND date_holiday >= now()
            AND date_holiday < now() +  interval '1 month';
            """)
    List<String> getHolidaysInOneMonthStrings();
}
