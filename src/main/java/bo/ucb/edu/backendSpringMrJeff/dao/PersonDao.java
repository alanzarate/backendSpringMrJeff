package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.dto.MrPersonDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface PersonDao
{
    @Select("""
            SELECT
            	per.mr_person_id
            FROM 
            	mr_person per 
            WHERE 
            	per.first_name = #{firstName}
            AND per.last_name = #{lastName}
            AND per.num_phone = #{numPhone}
            AND per.gender_person = #{genderPerson}
            AND per.status =1
            """)
    Integer findIdPersonByPerson(MrPersonDto mrPersonDto);

    @Insert("""
            INSERT INTO mr_person (first_name, last_name, num_phone, gender_person, cat_per_status, status, tx_date, tx_user, tx_host, created)
            VALUES (#{firstName}, #{lastName}, #{numPhone}, #{genderPerson}, 'active', 1, now(), 'anonymous', 'localhost', now());
            """)
    void createPerson(MrPersonDto mrPersonDto);

}
