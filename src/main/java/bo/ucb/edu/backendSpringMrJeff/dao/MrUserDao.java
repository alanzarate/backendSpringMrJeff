package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.entity.MrUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface MrUserDao {
    // falta por hacer el select
    @Select("""
            SELECT
                                 	mr_user_id as user_id, username, secret, status, email,
                                 	cat_user_status, mr_person_id, status, tx_date, tx_user,
                                 	tx_host
                                 FROM
                                 	mr_user
                                 WHERE
                                 	mr_user_id = #{ userId }
                                 AND
                                 	status = 1;
            """)
    MrUser findByPrimaryKey(Integer userId);

    @Select("""
            select secret
            from 
                mr_user
            WHERE
                username = #{username} 
                AND status = 1 
            """)
    String findByUsernameAndPassword(String username);
    @Insert("""
            INSERT INTO 
                MR_USER (username, secret, email, cat_user_status, 
                        mr_person_id, status, tx_date, tx_user,
                        tx_host, created)
                VALUES
                    (#{ mrUser.username }, #{ mrUser.secret }, #{ mrUser.email }, 'active', 
                    #{ mrPersonId }, 1, now(), 'anonymous', 
                    'localhost', now());
                    
            """)
    void createUserWithPersonId(MrUser mrUser, Integer mrPersonId);

    @Select("""
           mr_user_id, username, secret, status, email,
                                 	cat_user_status, mr_person_id, status, tx_date, tx_user,
                                 	tx_host
                                 FROM
                                 	mr_user
                                 WHERE
                                 	username = #{ username }
                                 AND
                                 	status = 1;
            """)
    MrUser findByUsername(String username);
}
