-- Active: 1669183736363@@198.211.100.120@5432@mrjeff
-- User: mrjeff
-- Date: 2017-07-19 15:02:16
-- Host:
-- Port: 5432
-- Database: mrjeff
--Obtener los datos de la tabla Mr_Clothing para mostrar en fronted
SELECT 
    mr_clothing.mr_clothing_id, mr_clothing.title, mr_clothing.description
    ,mr_clothing.price
FROM mr_clothing
WHERE mr_clothing.mr_clothing_id = 1;

SELECT 
    mr_clothing_images.mr_clothing_images_id, mr_clothing_images.url
FROM mr_clothing_images
WHERE mr_clothing_images.status = 1
AND mr_clothing_images.mr_clothing_id = 1;

SELECT
    mr_service.mr_service_id as serviceId, mr_service.price, mr_service.cat_ser_status,
    mr_service.principal_service,
    mr_size.size,
    mr_service_detail.title, mr_service_detail.description
FROM mr_service
INNER JOIN mr_service_detail 
    ON mr_service.mr_service_detail_id = mr_service_detail.mr_service_detail_id
INNER JOIN mr_size
    ON mr_service.mr_size_id = mr_size.mr_size_id
WHERE mr_service.status = 1
AND mr_size.status = 1
AND mr_service_detail.status = 1
AND mr_service.mr_clothing_id = 1;



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
        AND mr_category_cloth.mr_category_cloth_id = 1;

SELECT * FROM mr_clothing_images;

SELECT* FROM mr_clothing;

UPDATE mr_clothing_images 
SET url = 'https://firebasestorage.googleapis.com/v0/b/mr-jeff-394e1.appspot.com/o/images%2F1%2F1_23_11_2022.jpg?alt=media&token=56b9b292-7f13-419b-9461-6f2bfeedc1b3' 
WHERE mr_clothing_images_id = 1;

UPDATE mr_clothing_images 
SET url = 'https://firebasestorage.googleapis.com/v0/b/mr-jeff-394e1.appspot.com/o/images%2F1%2F1.2_1669214264.jpg?alt=media&token=bb8a26e9-ec31-4852-bb43-6067c0245632' 
WHERE mr_clothing_images_id = 2;

UPDATE mr_clothing_images 
SET url = 'https://firebasestorage.googleapis.com/v0/b/mr-jeff-394e1.appspot.com/o/images%2F2%2FVestido-cruzado---Azul-marino---H-M-PE.webp?alt=media&token=50f245a9-6a64-4d0d-8441-05c75365c7ef' 
WHERE mr_clothing_images_id = 3;

UPDATE mr_clothing_images 
SET url = 'https://firebasestorage.googleapis.com/v0/b/mr-jeff-394e1.appspot.com/o/images%2F2%2FVestido-cruzado---Azul-marino---H-M-PE.webp?alt=media&token=50f245a9-6a64-4d0d-8441-05c75365c7ef' 
WHERE mr_clothing_images_id = 4;

UPDATE mr_clothing_images
SET url = ''
WHERE mr_clothing_images_id = 5;