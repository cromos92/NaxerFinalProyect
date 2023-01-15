--ingresar registro de pruebas categorias
insert into categoria(fecha_last_update,nombre) values ('2023-01-13','Computadores')
insert into categoria(fecha_last_update,nombre) values ('2023-01-13','Celulares')
insert into categoria(fecha_last_update,nombre) values ('2023-01-13','Audifonos')
insert into categoria(fecha_last_update,nombre) values ('2023-01-13','Zapatillas')
--ingresar registros de prueba productos
insert into productos(nombre,precio,descripcion,id_categoria,fecha_creacion,url_Image)values ('Lenovo 2 en 1 D330 N4020',199990,'Disco duro HDD: 128GBProfundidad: 24 Unidad óptica: No Tamaño de la pantalla: 10.1 pulgadas Memoria RAM: 4GB',1,'2023-01-01','https://falabella.scene7.com/is/image/Falabella/15877017_1?wid=1500&hei=1500&qlt=70')
insert into productos(nombre,precio,descripcion,id_categoria,fecha_creacion,url_Image)values ('Lenovo 2 en 1 D330 N4020',999990,'Profundidad: 22.59 Unidad óptica: No Tamaño de la pantalla: 14 pulgadas Memoria RAM: 8GB Procesador: AMD RYZEN R5',1,'2023-01-01','https://falabella.scene7.com/is/image/Falabella/16375635_1?wid=1500&hei=1500&qlt=70')
insert into productos(nombre,precio,descripcion,id_categoria,fecha_creacion,url_Image)values ('Apple iPhone 14 Plus 128 GB',1049990,'Velocidad del procesador: No aplica Tipo de pantalla: TOUCH Tipo: Smartphones Tamaño de la pantalla: 6.7 pulgadas Sistema operativo: IOS',2,'2023-01-01','https://falabella.scene7.com/is/image/Falabella/16563287_1?wid=1500&hei=1500&qlt=70')
insert into productos(nombre,precio,descripcion,id_categoria,fecha_creacion,url_Image)values ('Samsung Galaxy S22 ultra 5G 256gb verde',929990,'Capacidad de almacenamiento	250 GB Tamaño de la pantalla 68 Tipo de celular	Desbloqueado Tamaño de SIM	Nano SIM Conexión a internet	Sí Descarga aplicaciones	Sí Conectividad	Bluetooth | USB-C Memoria RAM	12GB',2,'2023-01-01','https://falabella.scene7.com/is/image/Falabella/gsc_112684130_363269_1?wid=1500&hei=1500&qlt=70')

-- insertar resgistros de prueba puntuacion
insert into puntuacion(nivel_precio,nivel_calidad,nivel_diseno,comentario,id_producto) values (2,3,2,'producto buena calidad y muy dudadero',1)
insert into puntuacion(nivel_precio,nivel_calidad,nivel_diseno,comentario,id_producto) values (1,2,5,'producto buena calidad y muy dudadero',1)
insert into puntuacion(nivel_precio,nivel_calidad,nivel_diseno,comentario,id_producto) values (3,5,4,'producto buena calidad y muy dudadero',1)
insert into puntuacion(nivel_precio,nivel_calidad,nivel_diseno,comentario,id_producto) values (5,2,1,'producto buena calidad y muy dudadero',2)
insert into puntuacion(nivel_precio,nivel_calidad,nivel_diseno,comentario,id_producto) values (3,2,3,'producto buena calidad y muy dudadero',2)
insert into puntuacion(nivel_precio,nivel_calidad,nivel_diseno,comentario,id_producto) values (2,1,3,'producto buena calidad y muy dudadero',3)
insert into puntuacion(nivel_precio,nivel_calidad,nivel_diseno,comentario,id_producto) values (1,2,4,'producto buena calidad y muy dudadero',3)
insert into puntuacion(nivel_precio,nivel_calidad,nivel_diseno,comentario,id_producto) values (3,1,1,'producto buena calidad y muy dudadero',3)
insert into puntuacion(nivel_precio,nivel_calidad,nivel_diseno,comentario,id_producto) values (1,4,2,'producto buena calidad y muy dudadero',4)
insert into puntuacion(nivel_precio,nivel_calidad,nivel_diseno,comentario,id_producto) values (2,1,3,'producto buena calidad y muy dudadero',4)
insert into puntuacion(nivel_precio,nivel_calidad,nivel_diseno,comentario,id_producto) values (4,5,3,'producto buena calidad y muy dudadero',4)
insert into puntuacion(nivel_precio,nivel_calidad,nivel_diseno,comentario,id_producto) values (5,1,2,'producto buena calidad y muy dudadero',4)


