package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.entity.MrPerson;
import org.apache.ibatis.annotations.Insert;
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

    @Insert("""
            INSERT INTO MR_PERSON
            (first_name, last_name, num_phone, gender_person, cat_per_status, status, tx_date, tx_user, tx_host, created)
            VALUES
            ( #{ firstName } , #{ lastName } , #{ numPhone } , #{ genderPerson } , 'active', 1, now(), 'admin',
            'localhost', now() );
            """)
    void createNewPerson(MrPerson mrPerson);

    @Select("""
                SELECT currval('mr_person_mr_person_id_seq');
                """)
    Integer viewLastPersonCreated();
}
