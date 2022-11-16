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

 
-- mr_branch

-- posible values of cat_branch_status { active: 'sucursal activa', inactive:'sucursal inactiva o cerrada'}

INSERT INTO MR_BRANCH 
(branch_name, latitude, longitude, address_link, cat_branch_status, atention_ratio_m, status, tx_date, tx_user, tx_host, created)
VALUES
('Sucursal 1', -16.49694705410829, -68.13771509571562, 'https://goo.gl/maps/2H4EERoHNgASXWRSA', 'active',  2400, 1, now(), 'admin', '192.168.100.10', now() ),
('Sucursal 2', -16.51816488980569, -68.11650642246619, 'https://goo.gl/maps/wUPDPF9cnGY6qcCU6', 'active',  3080, 1, now(), 'admin', '192.168.100.10', now() ),
('Sucursal 3', -16.53799325926849, -68.07673670081171, 'https://goo.gl/maps/GrUPzkx3hLCXensY8', 'active',  2280 , 1, now(), 'admin', '192.168.100.10', now() ),
('Sucursal 4', -16.536928498571722, -68.04413414619556, 'https://goo.gl/maps/UP3JaBznPREBQzvL6', 'active',  2320 , 1, now(), 'admin', '192.168.100.10', now() );

-- 

-- posigble values of cat_per_status { active: 'persona activa', inactive: 'persona inactiva'}

INSERT INTO MR_PERSON
(first_name, last_name, num_phone, gender_person, cat_per_status, status, tx_date, tx_user, tx_host, created)
VALUES
('Alan Wiler', 'Zarate Chino', '73749331', 1, 'active', 1, now(), 'admin', '192.168.100.10', now() ),
('Emerson Daniel', 'Chipana Luna', '78945464', 1,'active', 1, now(), 'admin', '192.168.100.10', now() ),
('Nikolai Oscar', 'Lopez Jordan', '67895521', 1, 'active', 1, now(), 'admin', '192.168.100.10', now() ),
('Ali Kelsey','Tyler Madden','62376335',1,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Jackson Gabriel','Walter Pearson','68366437',1,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Murphy Herman','Pierce Deleon','75723211',1,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Colton Patience','Chen Witt','77668435',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Amber Omar','Guerra Puckett','76247425',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Nash Jenna','Blevins Becker','79376886',1,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Nayda Kieran','Colon Mendez','63357196',1,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Angelica Mira','Haynes Davenport','65474601',1,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Whitney Cole','Barry Marquez','77235874',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Isaiah Ulysses','Carpenter Ewing','69022242',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Gil Elaine','Gray Stone','72376230',1,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Minerva Davis','Cole Moran','73789433',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Amity Amelia','Sellers Sykes','68721943',1,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Xavier Fallon','Conrad Francis','78137753',1,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Callum Eagan','Buck Richards','76933506',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Griffith Rahim','Noble Kaufman','62513287',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Reuben Willa','Bowen Pitts','67168595',1,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Nadine Noah','Paul Hensley','64319152',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Tobias Mechelle','Hughes Franco','69515635',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Robert Stone','Romero Mckay','75324221',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Lucas Amena','Jenkins Horn','74731865',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Amber Kimberly','Reese Mcpherson','69321363',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),

  ('Illana Kenyon','Koch Emerson','69024319',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Channing Len','Clayton Slater','77286796',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Merritt Dahlia','Dale Ball','66171462',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Ira Charles','Oneil Pratt','67646469',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Brady Imelda','Workman Wong','64132127',1,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Zephania Kato','Goff Snyder','62884153',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Lillian Anika','Anthony Gray','74167124',1,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Martha Dylan','Lynch Horne','68137574',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Lavinia Gary','Oliver Keller','75454426',1,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Haviva Rhiannon','Ellis James','67324442',1,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Lunea Malachi','Jefferson Savage','72893482',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Raphael Kylan','Langley Pratt','77851542',1,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Britanni Heidi','Oneal Stanton','65567881',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Lev Carol','Riddle Nunez','75696512',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Ashton Hyatt','Simpson Mack','73291441',0,'active', 1, now(), 'admin', '192.168.100.10', now() ),
  ('Chester Tatiana','Frost Colon','73338838',0,'active', 1, now(), 'admin', '192.168.100.10', now() );



-- para los users

person_id = 1: {"username":"alan123","password":"zarate123","email":"alan.zarate@ucb.edu.bo"},
person_id = 2: {"username":"emerson123","password":"chipana123","email":"emerson.chipana@ucb.edu.bo"},
person_id = 3:{"username":"nikolai123","password":"lopez123","email":"nikolai.lopez@ucb.edu.bo"},
person_id = 4:{"username":"rbull3","password":"cisjNKgwO","email":"gskeen3@addtoany.com"},
person_id = 5:{"username":"bphinnis4","password":"cKhQ1S4r","email":"hgosse4@amazonaws.com"},
person_id = 6:{"username":"tcoles5","password":"IIn557","email":"lruusa5@salon.com"},
person_id = 7:{"username":"gkirrens6","password":"B5aX0mAb3Tw0","email":"tcrosier6@ehow.com"},
person_id = 8:{"username":"spulver7","password":"5TJ0H7mF","email":"hfirmager7@livejournal.com"},
person_id = 9:{"username":"mondrusek8","password":"Mc6aC2","email":"ctrett8@umich.edu"},
person_id = 10:{"username":"bstickings9","password":"yHpU4md8v","email":"pmorhall9@slate.com"},
person_id = 11:{"username":"hgoodshipa","password":"qcXvnm","email":"mgilluma@eventbrite.com"},
person_id = 12:{"username":"clumberb","password":"bqnilTg7tNZ","email":"scornerb@tripadvisor.com"},
person_id = 13:{"username":"bkedwellc","password":"6aovb6","email":"pcontic@joomla.org"},
person_id = 14:{"username":"tmoond","password":"ZT2h96sFJC5M","email":"sfarnfieldd@princeton.edu"},
person_id = 15:{"username":"apreiste","password":"bZ7yPm3Uc","email":"bmudlee@nifty.com"},
person_id = 16:{"username":"mfersonf","password":"Qsb6NYOLkPQ","email":"obaskerfieldf@upenn.edu"},
person_id = 17:{"username":"rwardallg","password":"62fFJkvv9OhQ","email":"spogosiang@google.pl"},
person_id = 18:{"username":"apeadenh","password":"hSWGLd9ZeWO","email":"jsivilh@oakley.com"},
person_id = 19:{"username":"btoffanoi","password":"hL2XRy7dF","email":"manchori@taobao.com"},
person_id = 20:{"username":"agorglerj","password":"Sw1MAg","email":"ncropperj@mapquest.com"},
person_id = 21:{"username":"eschildk","password":"XM3RcEuQ0U1","email":"mvallentink@indiegogo.com"},
person_id = 22:{"username":"mbuckthoughtl","password":"nnRcizPomP6N","email":"dhoulaghanl@instagram.com"},
person_id = 23:{"username":"tcranneym","password":"VknCqoKjY","email":"kpendrem@mozilla.org"},
person_id = 24:{"username":"sroonn","password":"mlYlpS","email":"kclaragen@slate.com"},
person_id = 25:{"username":"gshouteo","password":"aDmr06YFHL","email":"sjannascho@people.com.cn"}


  -- los couriers  user_id { 4 ,8 ,9 ,10 ,15, 22}

INSERT INTO MR_BRANCH_USER
(mr_user_id, mr_branch_id,  status, tx_date, tx_user, tx_host, created)
VALUES
(4, 1,  1, now(), 'admin', '192.168.100.10', now() ),
(8, 1,  1, now(), 'admin', '192.168.100.10', now() ),
(9, 2,  1, now(), 'admin', '192.168.100.10', now() ),
(10, 2,  1, now(), 'admin', '192.168.100.10', now() ),
(15, 3,  1, now(), 'admin', '192.168.100.10', now() ),
(22, 4,  1, now(), 'admin', '192.168.100.10', now() );

INSERT INTO MR_ROLE
(detail, cat_role, status, tx_date, tx_user, tx_host, created)
VALUES
('Can create a new user', 'createNewUser',  1, now(), 'admin', '192.168.100.10', now() ),  -- simple user, admin
('Can delete an exitent user', 'deleteUser',  1, now(), 'admin', '192.168.100.10', now() ),  -- admin
('Can view pickups', 'viewPickUp',  1, now(), 'admin', '192.168.100.10', now() ), --courier
('Can view the deliveries', 'viewDelivery',  1, now(), 'admin', '192.168.100.10', now() ), --couriere
('Can view work status', 'viewWorkStatus',  1, now(), 'admin', '192.168.100.10', now() ), -- simple user
('Can create pickups', 'createPickUp',  1, now(), 'admin', '192.168.100.10', now() ), -- simple user
('Can accept a pickup', 'acceptPickUp',  1, now(), 'admin', '192.168.100.10', now() ), -- courier
('Can cancel a pickup', 'cancelPickUp',  1, now(), 'admin', '192.168.100.10', now() ), -- simple user
('Can create a delivery', 'createDelivery',  1, now(), 'admin', '192.168.100.10', now() ), -- simple user
('Can cancel a delivery', 'cancelDelivery',  1, now(), 'admin', '192.168.100.10', now() ), -- simple user
('Can accept a delivery', 'acceptDelivery',  1, now(), 'admin', '192.168.100.10', now() ), -- courier


INSERT INTO MR_GROUP 
(detail, cat_group, status , tx_date, tx_user, tx_host, created)
VALUES
('Admin can do lots of things', 'admin',1, now(), 'admin', '192.168.100.10', now() ), 
('A courier is a person who can pick up and deliver', 'courier', 1, now(), 'admin', '192.168.100.10', now() ), 
('Simle user, anybody', 'user', 1, now(), 'admin', '192.168.100.10', now() );

INSERT INTO MR_GROUP_ROLE
(mr_group_id, mr_role_id, status , tx_date, tx_user, tx_host, created)
VALUES
(1, 1 , 1, now(), 'admin', '192.168.100.10', now() ), 
(1, 2, 1, now(), 'admin', '192.168.100.10', now() ), 
(1, 3, 1, now(), 'admin', '192.168.100.10', now() ), 
-- admin are also simple users
(3, 1 , 1, now(), 'admin', '192.168.100.10', now() ), 
(3, 2, 1, now(), 'admin', '192.168.100.10', now() ), 
(3, 3, 1, now(), 'admin', '192.168.100.10', now() ), 

(2, 4, 1, now(), 'admin', '192.168.100.10', now() ), 
(2, 7, 1, now(), 'admin', '192.168.100.10', now() ), 
(2, 11, 1, now(), 'admin', '192.168.100.10', now() ), 
(3, 1, 1, now(), 'admin', '192.168.100.10', now() ), 
(3, 5, 1, now(), 'admin', '192.168.100.10', now() ), 
(3, 6, 1, now(), 'admin', '192.168.100.10', now() ), 
(3, 8, 1, now(), 'admin', '192.168.100.10', now() ), 
(3, 9, 1, now(), 'admin', '192.168.100.10', now() ), 
(3, 10, 1, now(), 'admin', '192.168.100.10', now() );



  -- los couriers  user_id { 4 ,8 ,9 ,10 ,15, 22}
INSERT INTO MR_USER_GROUP
(mr_user_id, mr_group_id, status , tx_date, tx_user, tx_host, created)
VALUES
(1, 1 , 1, now(), 'admin', '192.168.100.10', now() ), 
(2, 1, 1, now(), 'admin', '192.168.100.10', now() ), 
(3, 1, 1, now(), 'admin', '192.168.100.10', now() ), 
(4, 2, 1, now(), 'admin', '192.168.100.10', now() ), 
(5, 3, 1, now(), 'admin', '192.168.100.10', now() ), 
(6, 3, 1, now(), 'admin', '192.168.100.10', now() ), 
(7, 3, 1, now(), 'admin', '192.168.100.10', now() ), 
(8, 2, 1, now(), 'admin', '192.168.100.10', now() ), 
(9, 2, 1, now(), 'admin', '192.168.100.10', now() ), 
(10 2, 1, now(), 'admin', '192.168.100.10', now() ), 
(11, 3, 1, now(), 'admin', '192.168.100.10', now() ), 
(12, 3, 1, now(), 'admin', '192.168.100.10', now() ),
(13, 3 , 1, now(), 'admin', '192.168.100.10', now() ), 
(14, 3, 1, now(), 'admin', '192.168.100.10', now() ), 
(15, 2, 1, now(), 'admin', '192.168.100.10', now() ), 
(16, 3, 1, now(), 'admin', '192.168.100.10', now() ), 
(17, 3, 1, now(), 'admin', '192.168.100.10', now() ), 
(18, 3, 1, now(), 'admin', '192.168.100.10', now() ), 
(19, 3, 1, now(), 'admin', '192.168.100.10', now() ), 
(20, 3, 1, now(), 'admin', '192.168.100.10', now() ), 
(21, 3, 1, now(), 'admin', '192.168.100.10', now() ), 
(22, 2, 1, now(), 'admin', '192.168.100.10', now() ), 
(23, 3, 1, now(), 'admin', '192.168.100.10', now() ), 
(24, 3, 1, now(), 'admin', '192.168.100.10', now() ),
(25, 3 , 1, now(), 'admin', '192.168.100.10', now() );

