

 -- public.categoria definition

-- Drop table

-- DROP TABLE categoria;
DROP TABLE IF EXISTS categoria;

CREATE TABLE categoria (
	id bigserial NOT NULL,
	fecha_last_update timestamp NULL,
	nombre varchar(255) NULL,
    PRIMARY KEY(id)
);
-- si existe tabla producto
DROP TABLE IF EXISTS productos;
CREATE TABLE productos (
	id bigserial NOT NULL,
	url_Image varchar(500) NULL,
	nombre varchar(255) NULL,
	precio int NULL,
	descripcion varchar(500) NULL,
		id_categoria Integer NULL,
	fecha_creacion timestamp NULL,
    PRIMARY KEY(id)
);
DROP table  if EXISTS puntuacion;
CREATE TABLE puntuacion(
id bigserial NOT NULL,
nivel_precio int NULL,
nivel_calidad int NULL,
nivel_diseno int NULL,
	comentario varchar(250) NULL,
	id_producto int NULL
)

