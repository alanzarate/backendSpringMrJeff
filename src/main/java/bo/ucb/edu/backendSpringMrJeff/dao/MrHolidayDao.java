package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.entity.MrHoliday;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface MrHolidayDao {

    @Select("""
            SELECT mr_holidays_id, date_holiday, detail, status, tx_date, tx_user,
            	   tx_host, created
            FROM MR_HOLIDAYS
            WHERE
            	date_holiday >= now()
            AND date_holiday < now() + '1 month'
            AND status = 1;
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
