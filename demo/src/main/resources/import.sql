/* Populate tables */
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(1,'Andres', 'Guzman', 'profesor@andres.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(2,'John', 'Doe', 'john@john.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(4 ,'Pablo', 'Guzman', 'pablo@pablo.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(5 ,'Juan', 'Guzman', 'juan@juan.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(6 ,'Alexis', 'Doe', 'alexis@alexis.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(7 ,'Jonathan', 'Guzman', 'jonathan@jonathan.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(8 ,'Carmen', 'Doe', 'carmen@carmen.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(9 ,'Paulina', 'Guzman', 'paulina@paulina.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(10 ,'John', 'Doe', 'john@john.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(11 ,'Guillermo', 'Guzman', 'guillermo@guillermo.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(12 ,'Jose', 'Doe', 'jose@jose.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(13 ,'Jesus', 'Guzman', 'jesus@jesus.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(14 ,'Alejandro', 'Doe', 'alejandro@alejandro.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(15 ,'Elizabeth', 'Doe', 'elizabeth@elizabeth.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(16 ,'Lizbeth', 'Guzman', 'lizbeth@lizbeth.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(17 ,'Manuel', 'Doe', 'manuel@manuel.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(18 ,'Joel', 'Guzman', 'joel@joel.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(19 ,'Hector', 'Doe', 'john@hector.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(20 ,'Lucia', 'Guzman', 'lucia@lucia.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(21 ,'Maria', 'Doe', 'maria@maria.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(22 ,'Jaqueline', 'Guzman', 'jaqueline@jaqueline.com', '2017-08-28');
INSERT INTO cliente (id,nombre,apellido,email, create_at) VALUES(23 ,'Edson', 'Doe', 'edson@edson.com', '2017-08-28');



-- Populate tabla productos
INSERT INTO producto (nombre, precio, create_at) VALUES('Panasonic Pantalla LCD', 259990, NOW());
INSERT INTO producto (nombre, precio, create_at) VALUES('Sony Camara digital DSC-W320B', 123409, NOW());
INSERT INTO producto (nombre, precio, create_at) VALUES('Apple iPod shuffle', 1499990, NOW());
INSERT INTO producto (nombre, precio, create_at) VALUES('Sony Notebook Z110', 37990, NOW());
INSERT INTO producto (nombre, precio, create_at) VALUES('Hewlett Packard Multifuncional F2280', 69990, NOW());
INSERT INTO producto (nombre, precio, create_at) VALUES('Biachi Bicicleta Aro 26', 6990, NOW());
INSERT INTO producto (nombre, precio, create_at) VALUES('Mica Comoda 5 Cajones', 299990, NOW());

-- Populate tabla facturas
INSERT INTO factura (descripcion, observacion, cliente_id, create_at) VALUES('Factura equipos de oficina', null, 1, NOW());
INSERT INTO factura_item (cantidad, factura_id, producto_id) VALUES(1,1,1);
INSERT INTO factura_item (cantidad, factura_id, producto_id) VALUES(2,1,4);
INSERT INTO factura_item (cantidad, factura_id, producto_id) VALUES(1,1,5);
INSERT INTO factura_item (cantidad, factura_id, producto_id) VALUES(1,1,7);

INSERT INTO factura (descripcion, observacion, cliente_id, create_at) VALUES('Factura Bicicleta', 'Alguna nota importante', 1, NOW());
INSERT INTO factura_item (cantidad, factura_id, producto_id) VALUES(3,2,6);



