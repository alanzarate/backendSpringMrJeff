package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.entity.MrBranch;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface MrBranchDao {

    @Select("""
            SELECT
            	mb.mr_branch_id, mb.branch_name, mb.latitude, mb.longitude, mb.address_link,
            	mb.cat_branch_status, mb.atention_ratio_m
            FROM
            	mr_branch mb
            WHERE
            	mb.status = 1;
            """)
    List<MrBranch> getListOfBranches();
}
