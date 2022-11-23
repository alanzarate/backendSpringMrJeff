package bo.ucb.edu.backendSpringMrJeff.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import bo.ucb.edu.backendSpringMrJeff.dto.ClothingDto;
import bo.ucb.edu.backendSpringMrJeff.dto.ImageDto;
import bo.ucb.edu.backendSpringMrJeff.dto.MrClothingCard;
import bo.ucb.edu.backendSpringMrJeff.dto.ServiceDto;

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
        List<MrClothingCard> getClothingsbyCategory(Integer category);

        @Select("""
        SELECT 
            mr_clothing.mr_clothing_id as id, mr_clothing.title, mr_clothing.description
            ,mr_clothing.price
        FROM mr_clothing
        WHERE mr_clothing.status = 1
        AND mr_clothing.mr_clothing_id = #{id};
                """)
        ClothingDto getClothingById(Integer id);

        @Select("""
        SELECT 
            mr_clothing_images.mr_clothing_images_id as imageId, mr_clothing_images.url as image
        FROM mr_clothing_images
        WHERE mr_clothing_images.status = 1
        AND mr_clothing_images.mr_clothing_id = #{id};
                """)
        List<ImageDto> getImagesOfClothing(Integer id);

        @Select("""
        SELECT
            mr_service.mr_service_id as serviceId, mr_service.price, mr_service.cat_ser_status as catStatus,
            mr_service.principal_service as principalService,
            mr_size.size,
            mr_service_detail.title as detTitle, mr_service_detail.description as detDescription
        FROM mr_service
        INNER JOIN mr_service_detail 
            ON mr_service.mr_service_detail_id = mr_service_detail.mr_service_detail_id
        INNER JOIN mr_size
            ON mr_service.mr_size_id = mr_size.mr_size_id
        WHERE mr_service.status = 1
        AND mr_size.status = 1
        AND mr_service_detail.status = 1
        AND mr_service.mr_clothing_id = #{id};
                """)
        List<ServiceDto> getServicesOfClothing(Integer id);


}
