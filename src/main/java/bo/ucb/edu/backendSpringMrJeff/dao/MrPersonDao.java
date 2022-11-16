package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.entity.MrPerson;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface MrPersonDao {

    @Select(
            """
                            SELECT
                            	per.mr_person_id,  per.first_name,  per.last_name, per.num_phone, per.gender_person,
                            	per.cat_per_status
                            FROM
                            	mr_person per
                            JOIN mr_user mu ON mu.mr_person_id = per.mr_person_id
                            WHERE
                            	username = #{ username }
                            AND per.status =1
                            AND mu.status = 1
                            	        
                    """
    )
    public MrPerson findPersonByUsername(String username);
}
