-- tabla
INSERT INTO MR_SERVICE_DETAIL 
(title, description, status, tx_date, tx_user, tx_host, created) VALUES 
('Planchado', 'Planchar cualquier la prenda', 1, now(), 'admin', '192.168.10.10', now());
INSERT INTO MR_SERVICE_DETAIL 
(title, description, status, tx_date, tx_user, tx_host, created) VALUES 
('Lavado', 'Lavar cualquier prenda', 1, now(), 'admin', '192.168.10.10', now());
INSERT INTO MR_SERVICE_DETAIL
(title, description, status, tx_date, tx_user, tx_host, created) VALUES 
('Lavado seco', 'Lavar sin sumergir en agua', 1, now(), 'admin', '192.168.10.10', now());
INSERT INTO MR_SERVICE_DETAIL 
(title, description, status, tx_date, tx_user, tx_host, created) VALUES 
('Teñir', 'Devuelve el color a las prendas tiñiendolas de su color', 1, now(), 'admin', '192.168.10.10', now());
INSERT INTO MR_SERVICE_DETAIL 
(title, description, status, tx_date, tx_user, tx_host, created) VALUES 
('Secado', 'Dejar a la prenda sin minimo de humedad', 1, now(), 'admin', '192.168.10.10', now());

-- size

-- for audith    
-- ,status, tx_date, tx_user, tx_host, created  
-- ,1, now(), 'admin', '192.168.10.10', now()

INSERT INTO MR_SIZE (size, status, tx_date, tx_user, tx_host, created) VALUES ('SIN TALLA', 1, now(), 'admin', '192.168.10.10', now());
INSERT INTO MR_SIZE (size, status, tx_date, tx_user, tx_host, created) VALUES ('ESTÁNDAR', 1, now(), 'admin', '192.168.10.10', now());
INSERT INTO MR_SIZE (size, status, tx_date, tx_user, tx_host, created) VALUES ('XS', 1, now(), 'admin', '192.168.10.10', now());
INSERT INTO MR_SIZE (size, status, tx_date, tx_user, tx_host, created) VALUES ('XL', 1, now(), 'admin', '192.168.10.10', now());
INSERT INTO MR_SIZE (size, status, tx_date, tx_user, tx_host, created) VALUES ('XXL', 1, now(), 'admin', '192.168.10.10', now());
INSERT INTO MR_SIZE (size, status, tx_date, tx_user, tx_host, created) VALUES ('XXXL', 1, now(), 'admin', '192.168.10.10', now());

-- categort

INSERT INTO MR_CATEGORY_CLOTH (category, status, tx_date, tx_user, tx_host, created) VALUES ('Prendas',1, now(), 'admin', '192.168.10.10', now());
INSERT INTO MR_CATEGORY_CLOTH (category, status, tx_date, tx_user, tx_host, created) VALUES ('Hogar',1, now(), 'admin', '192.168.10.10', now());
INSERT INTO MR_CATEGORY_CLOTH (category, status, tx_date, tx_user, tx_host, created) VALUES ('Especial',1, now(), 'admin', '192.168.10.10', now());
INSERT INTO MR_CATEGORY_CLOTH (category, status, tx_date, tx_user, tx_host, created) VALUES ('Bolsa',1, now(), 'admin', '192.168.10.10', now());


--  clothing 
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Abrigo', 'El abrigo cuenta con mucha tela y de materiales gruesos', 58,  'active', 1,1, now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Vestido', 'Vestido simple, no formal y de cualquier talla', 80,  'active', 1,1, now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Corbata', 'Corbata de cualquier tamaño sin accesorios', 11,  'active', 1,1, now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Saco', 'Saco no formal en cualquier talla', 43,   'active', 1,1, now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Tenis', 'Par de tenis', 35,   'active', 1,1, now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Camisa/Blusa', 'Camisa o blusa de tela delgada', 23,  'active', 1,1, now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Pantalon', 'Pantalones casuales', 35,   'active', 1,1, now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Falda', 'Falda simple sin accesorios', 28,   'active', 1,1, now(), 'admin', '191.168.100.10', now());
--hasta aqui es 8
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Bolsa de lavanderia', 'Bolsa de lavanderia, la bolsa debe cerrarse completamente', 61,   'active', 4,1, now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Bolsa XS', 'Bolsa de lavanderia, la bolsa debe cerrarse completamente', 39,   'active', 4,1, now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Bolsa XL', 'Bolsa de lavanderia, la bolsa debe cerrarse completamente', 95,   'active', 4,1, now(), 'admin', '191.168.100.10', now());
--categoria de hogar 11
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Cubrecama', 'Cubrecama de una sola pieza', 57,   'active', 2,1, now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Juego de toallas', 'limite 2 toallas', 27,  'active', 2,1, now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Edredón simple', 'Edredón que no involucra la sobre sábana y de un material simple', 60,   'active', 2,1, now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Edredón simple grueso', 'Edredón de una material grueso', 70,  'active', 2,1, now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Edredón Queen', 'Edredón de un material simple de talla queen 160cm x 190cm aproximadamente', 80,   'active', 2,1, now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Cortina', 'Cortina de un material simple sin accesorios 200cm x 300cm aproximadamente', 65,   'active', 2,1, now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Edredón King', 'Edredón de medida King de 210cm x 195cm aproximadamente', 90,   'active', 2,1, now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Juego de Sábanas', 'Juego de sábana y su sobresabana', 45,  'active', 2, 1,now(), 'admin', '191.168.100.10', now());
-- especial 19
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Tuxedo', 'Juego de pantalos, saco y chaleco', 100,   'active', 3, 1,now(), 'admin', '191.168.100.10', now());
INSERT INTO MR_CLOTHING 
(title, description, price, cat_clot_status, mr_category_cloth_id, status, tx_date, tx_user, tx_host, created) VALUES
('Vestido formal', 'Vestido con detalles delicados y de tratamiento especial', 60,   'active', 3, 1,now(), 'admin', '191.168.100.10', now());

--clohing image
 
INSERT INTO MR_CLOTHING_IMAGES 
(url, mr_clothing_id, principal_image, status, tx_date, tx_user, tx_host, created ) VALUES 
('url 11_main', 1, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 12', 1, 0,1, now(), 'admin', '191.168.100.10', now()),
('url 21_main', 2, 1,1, now(), 'admin', '191.168.100.10', now()),
('url 22', 2, 0,1, now(), 'admin', '191.168.100.10', now()), 
('url 31_main', 3, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 41_main', 4, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 51_main', 5, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 61_main', 6, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 71_main', 7, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 81_main', 8, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 91_main', 9, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 92', 9, 0,1, now(), 'admin', '191.168.100.10', now()), 
('url 101_main', 10, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 102', 10, 0,1, now(), 'admin', '191.168.100.10', now()), 
('url 111_main', 11, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 112', 11, 0,1, now(), 'admin', '191.168.100.10', now()), 
('url 121_main', 12, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 122', 12, 0,1, now(), 'admin', '191.168.100.10', now()), 
('url 131_main', 13, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 132', 13, 0,1, now(), 'admin', '191.168.100.10', now()), 
('url 141_main', 14, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 142', 14, 0,1, now(), 'admin', '191.168.100.10', now()), 
('url 151_main', 15, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 152', 15, 0,1, now(), 'admin', '191.168.100.10', now()), 
('url 161_main', 16, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 162', 16, 0,1, now(), 'admin', '191.168.100.10', now()), 
('url 171_main', 17, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 172', 17, 0,1, now(), 'admin', '191.168.100.10', now()), 
('url 181_main', 18, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 182', 18, 0,1, now(), 'admin', '191.168.100.10', now()), 
('url 191_main', 19, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 192', 19, 0,1, now(), 'admin', '191.168.100.10', now()), 
('url 201_main', 20, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 202', 20, 0,1, now(), 'admin', '191.168.100.10', now()), 
('url 211_main', 21, 1,1, now(), 'admin', '191.168.100.10', now()), 
('url 212', 21, 0,1, now(), 'admin', '191.168.100.10', now());

-- mr service 


INSERT INTO MR_SERVICE 
(price, cat_ser_status, mr_service_detail_id, mr_clothing_id, principal_service, mr_size_id, status, tx_date, tx_user, tx_host, created )
VALUES
(58, 'active',  2, 1, 1, 2  , 1 , now(), 'admin', '192.168.100.10', now() ), 
(25, 'active',  1, 1, 0, 2  , 1 , now(), 'admin', '192.168.100.10', now() ), 
(80, 'active',  2, 2, 1, 2  , 1 , now(), 'admin', '192.168.100.10', now() ), 
(30, 'active',  1, 2, 0, 2  , 1 , now(), 'admin', '192.168.100.10', now() ), 
(25, 'active',  4, 2, 0, 2  , 1 , now(), 'admin', '192.168.100.10', now() ), 
(11, 'active',  2, 3, 1, 2  , 1 , now(), 'admin', '192.168.100.10', now() ), 
(5, 'active',  1, 3, 0, 2  , 1 , now(), 'admin', '192.168.100.10', now() ), 
(43, 'active',  3, 4, 1, 2  , 1 , now(), 'admin', '192.168.100.10', now() ), 
(53, 'active',  2, 4, 0, 2  , 1 , now(), 'admin', '192.168.100.10', now() ), 
(35, 'active',  2, 5, 1, 2  , 1 , now(), 'admin', '192.168.100.10', now() ), 
(23, 'active',  2, 6, 1, 2  , 1 , now(), 'admin', '192.168.100.10', now() ), 
(15, 'active',  1, 6, 0, 2  , 1 , now(), 'admin', '192.168.100.10', now() ), 
(35, 'active',  2, 7, 1, 2  , 1 , now(), 'admin', '192.168.100.10', now() ),
(25, 'active',  1, 7, 0, 2  , 1 , now(), 'admin', '192.168.100.10', now() ),
(37, 'active',  3, 7, 0, 2  , 1 , now(), 'admin', '192.168.100.10', now() ),
(32, 'active',  4, 7, 0, 2  , 1 , now(), 'admin', '192.168.100.10', now() ),
(28, 'active',  2, 8, 1, 2  , 1 , now(), 'admin', '192.168.100.10', now() ),
(20, 'active',  1, 8, 0, 2  , 1 , now(), 'admin', '192.168.100.10', now() ),
-- hasta aqui los productos con id 8
(61, 'active',  2, 9, 1, 1  , 1 , now(), 'admin', '192.168.100.10', now() ),
(25, 'active',  2, 10, 1, 3 , 1 , now(), 'admin', '192.168.100.10', now() ),
(14, 'active',  1, 10, 0, 3 , 1 , now(), 'admin', '192.168.100.10', now() ),
(65, 'active',  2, 11, 1, 4 , 1 , now(), 'admin', '192.168.100.10', now() ),
(30, 'active',  1, 11, 0, 4 , 1 , now(), 'admin', '192.168.100.10', now() ),
--hogar
(57, 'active',  2, 12, 1, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(30, 'active',  1, 12, 0, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(45, 'active',  4, 12, 0, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(27, 'active',  2, 13, 1, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(60, 'active',  2, 14, 1, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(30, 'active',  1, 14, 0, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(70, 'active',  2, 15, 1, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(80, 'active',  2, 16, 1, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(65, 'active',  2, 17, 1, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(75, 'active',  3, 17, 0, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(35, 'active',  4, 17, 0, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(90, 'active',  2, 18, 1, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(45, 'active',  2, 19, 1, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(20, 'active',  1, 19, 0, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
--especial
(100, 'active',  3, 20, 1, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(70, 'active',  2, 20, 0, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(30, 'active',  1, 20, 0, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(20, 'active',  1, 21, 0, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(40, 'active',  2, 21, 0, 2 , 1 , now(), 'admin', '192.168.100.10', now() ),
(60, 'active',  3, 21, 1, 2 , 1 , now(), 'admin', '192.168.100.10', now() );

-- mr_clothin_order



-- tablas involucradas

-- mr_service_detail
-- mr_size
-- MR_CATEGORY_CLOTH
-- MR_CLOTHING
--MR_CLOTHING_IMAGES
--MR_SERVICE
 

 -- es decir solamente estan las tablas de operacioens de la ropa y los servicios que se dan 

 


