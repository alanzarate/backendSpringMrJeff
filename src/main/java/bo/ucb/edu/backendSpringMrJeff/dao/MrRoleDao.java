package bo.ucb.edu.backendSpringMrJeff.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class MrRoleDao {
//    @Select("""
//        SELECT role.role_id, role.name, role.description, role.status, role.tx_username, role.tx_host, role.tx_date
//        FROM mr_role role
//                 JOIN mr_group_role group_role ON group_role.role_id = role.role_id
//                 JOIN mr_user_group user_group ON user_group.group_id = group_role.group_id
//                 JOIN mr_user usr ON usr.user_id = user_group.user_id
//        WHERE usr.username = #{username}
//          AND role.status = true
//          AND group_role.status = true
//          AND user_group.status = true
//          AND usr.status = true
//        """)
//    public List<MrRole> findRolesByUsername(String username);
}
