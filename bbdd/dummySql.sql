-- Active: 1669218483641@@198.211.100.120@5432@mrjeffv2
-- 
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
SET url = 'https://firebasestorage.googleapis.com/v0/b/mr-jeff-394e1.appspot.com/o/images%2F2%2F450_1000.jpg?alt=media&token=7c73fc11-8ca8-4893-b566-cd4607a44b41' 
WHERE mr_clothing_images_id = 4;

UPDATE mr_clothing_images
SET url = 'https://firebasestorage.googleapis.com/v0/b/mr-jeff-394e1.appspot.com/o/default.jpg?alt=media&token=afcbb91c-d969-4283-b90d-c2e9d3e76f77'
WHERE mr_clothing_images_id > 4;


SELECT
    mr_clothing_images.mr_clothing_images_id, mr_clothing_images.url,
    mr_clothing_order.mr_clothing_order_id, mr_clothing_order.price, mr_clothing_order.quantity,
    mr_service.mr_service_id,
    mr_service_detail.mr_service_detail_id, mr_service_detail.title,
    mr_clothing.mr_clothing_id, mr_clothing.title
FROM
    mr_clothing_order
INNER JOIN  mr_service ON
mr_service.mr_service_id = mr_clothing_order.mr_service_id
INNER JOIN mr_clothing ON
mr_service.mr_clothing_id = mr_clothing.mr_clothing_id
INNER JOIN mr_clothing_images ON
mr_clothing.mr_clothing_id = mr_clothing_images.mr_clothing_id
INNER JOIN mr_service_detail ON
mr_service.mr_service_detail_id = mr_service_detail.mr_service_detail_id
WHERE mr_clothing_images.principal_image = 1
AND mr_clothing.status = 1
AND mr_service_detail.status = 1
AND mr_service.status = 1
AND mr_clothing_order.status = 1
AND mr_clothing_order.mr_order_id = 1
ORDER BY mr_clothing_order.mr_clothing_order_id = 2;

SELECT * from mr_clothing_order;




SELECT mr_clothing_order.quantity, mr_clothing.title, mr_clothing_images.url, SUM(mr_clothing_order.price) as total
FROM mr_clothing_order
INNER JOIN mr_service ON
mr_service.mr_service_id = mr_clothing_order.mr_service_id
INNER JOIN mr_clothing ON
mr_service.mr_clothing_id = mr_clothing.mr_clothing_id
INNER JOIN mr_clothing_images ON
mr_clothing.mr_clothing_id = mr_clothing_images.mr_clothing_id
WHERE mr_clothing_images.principal_image = 1
AND mr_clothing.status = 1
AND mr_service.status = 1
AND mr_clothing_order.status = 1
AND mr_clothing_order.mr_order_id = 1
GROUP BY mr_clothing_order.quantity, mr_clothing.title, mr_clothing_images.url;


INSERT INTO mr_clothing_order 
(price, quantity, mr_service_id, mr_order_id, status, tx_date, tx_user, tx_host, created)
VALUES();

UPDATE mr_order
SET comment = $comment
WHERE mr_order_id = $mr_order_id;


INSERT INTO mr_delivery
(date_ope, mr_operation_state_id, mr_address_id, mr_user_id, mr_schedule_id, mr_order_id, code_gen, status, tx_date, tx_user, tx_host, created)
VALUES();

SELECT * from mr_role;

SELECT * from mr_order;

INSERT INTO MR_CLOTHING_ORDER
                        (PRICE, QUANTITY, MR_SERVICE_ID, MR_ORDER_ID, STATUS, TX_DATE, TX_USER, TX_HOST, CREATED)  
                VALUES
                        (58.0, 2, 1, 1, 1, now(), 'admin', 'localhost', now());

DELETE FROM mr_clothing_order WHERE mr_order_id = 1;


SELECT * FROM mr_clothing_order;