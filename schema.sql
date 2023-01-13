 -- public.categoria definition

-- Drop table

-- DROP TABLE categoria;

CREATE TABLE categoria (
	id bigserial NOT NULL,
	fecha_last_update timestamp NULL,
	nombre varchar(255) NULL,
	CONSTRAINT categoria_pkey null
);
-- public.usuario definition

-- Drop table

-- DROP TABLE usuario;

CREATE TABLE usuario (
	id bigserial NOT NULL,
	email varchar(255) NULL,
	nombre varchar(255) NULL,
	"password" varchar(255) NULL,
	CONSTRAINT usuario_pkey PRIMARY KEY (id)
);
-- public.puntuacion definition

-- Drop table

-- DROP TABLE puntuacion;

CREATE TABLE puntuacion (
	id bigserial NOT NULL,
	comentario varchar(255) NULL,
	id_producto int8 NULL,
	nivel_calidad float8 NULL,
	nivel_diseno float8 NULL,
	nivel_precio float8 NULL,
	CONSTRAINT puntuacion_pkey PRIMARY KEY (id)
);
CREATE TABLE puntuacion2 (
	id bigserial NOT NULL,
	comentario varchar(255) NULL,
	id_producto int8 NULL,
	nivel_calidad float8 NULL,
	nivel_diseno float8 NULL,
	nivel_precio float8 NULL,
	CONSTRAINT puntuacion2_pkey PRIMARY KEY (id)
);