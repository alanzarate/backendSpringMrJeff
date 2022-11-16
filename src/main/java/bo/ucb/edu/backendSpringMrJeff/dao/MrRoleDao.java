package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.entity.MrRole;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface MrRoleDao {
    @Select("""
                SELECT role.mr_role_id as role_id ,role.detail, role.cat_role as name,  role.status, role.tx_date, role.tx_user, role.tx_host, role.created
                        FROM mr_role role
                                 JOIN mr_group_role group_role ON group_role.mr_role_id = role.mr_role_id
                                 JOIN mr_user_group user_group ON user_group.mr_group_id = group_role.mr_group_id
                                 JOIN mr_user usr ON usr.mr_user_id = user_group.mr_user_id
                        WHERE usr.username = #{username}
                          AND role.status = 1
                          AND group_role.status = 1
                          AND user_group.status = 1
                          AND usr.status = 1
            """)
    public List<MrRole> findRolesByUsername(String username);
}
