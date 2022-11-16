package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.entity.MrUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface MrUserDao {
    // falta por hacer el select
    @Select("""
            select user_id, username, secret, status, tx_username,
                tx_host, tx_date
            from 
                mr_user
            WHERE
                user_id = #{userId}
                AND status = true
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
}
