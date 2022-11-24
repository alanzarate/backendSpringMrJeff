package bo.ucb.edu.backendSpringMrJeff.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MrGroupDao {

    @Select("""
            SELECT mg.cat_group
            FROM MR_GROUP mg, MR_USER mu, MR_USER_GROUP mug
            WHERE mg.mr_group_id = mug.mr_group_id
            AND mu.mr_user_id = mug.mr_user_id
            AND mu.username = #{username}
            """)
    List<String> getGroupByUserName(String username);
}
