package bo.ucb.edu.backendSpringMrJeff.dao;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import bo.ucb.edu.backendSpringMrJeff.dto.CategoryClothDto;

@Component
public interface MrCategoryClothDao {
    @Select("""
            SELECT
            	mr_category_cloth_id as categoryClothId, category
            FROM
            	MR_CATEGORY_CLOTH
            WHERE
            	status = 1;
            """)
    List<CategoryClothDto> findAllCategoryCloth();
}

    

