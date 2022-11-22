package bo.ucb.edu.backendSpringMrJeff.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import bo.ucb.edu.backendSpringMrJeff.entity.MrClothingCard;

@Component
public interface MrClothingDao {

    @Select("""
        SELECT
            mr_clothing.mr_clothing_id as clothingId, mr_clothing.title as title, mr_clothing.price as price, mr_clothing_images.url as img,
            mr_service_detail.title as service
        FROM
            mr_clothing_images
        INNER JOIN mr_clothing ON
            mr_clothing_images.mr_clothing_id = mr_clothing.mr_clothing_id
        INNER JOIN mr_category_cloth ON
            mr_clothing.mr_category_cloth_id = mr_category_cloth.mr_category_cloth_id
        INNER JOIN mr_service ON
            mr_service.mr_clothing_id = mr_clothing.mr_clothing_id
        INNER JOIN mr_service_detail ON
            mr_service.mr_service_detail_id = mr_service_detail.mr_service_detail_id
        WHERE mr_clothing_images.principal_image = 1
        AND mr_clothing.status = 1
        AND mr_clothing_images.status = 1
        AND mr_service.status = 1
        AND mr_service_detail.status = 1
        AND mr_service.principal_service = 1
        AND mr_category_cloth.mr_category_cloth_id = #{category};
            """)
        List<MrClothingCard> getProductsbyCategory(Integer category);

}
