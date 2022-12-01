package bo.ucb.edu.backendSpringMrJeff.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface MrUserGroupDao
{
    @Select("""
            INSERT INTO mr_user_group (mr_user_id, mr_group_id, status, tx_date, tx_user, tx_host, created)
            VALUES (#{userId}, 3, 1, now(), 'admin', 'localhost', now());
            """)
    void createUserGroup(Integer userId);
}
