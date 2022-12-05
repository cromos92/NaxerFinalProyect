
CREATE TABLE categoria (
	id bigserial NOT NULL,
	fecha_last_update timestamp NULL,
	nombre varchar(255) NULL,
	CONSTRAINT categoria_pkey PRIMARY KEY (id)
);
CREATE TABLE categoria2 (
	id bigserial NOT NULL,
	fecha_last_update timestamp NULL,
	nombre varchar(255) NULL,
	CONSTRAINT categoria_pkey PRIMARY KEY (id)
);
CREATE TABLE productos (
	id bigserial NOT NULL,
	fecha_creacion timestamp NULL,
	id_puntuacion int8 NULL,
	id_user int8 NULL,
	nombre varchar(255) NULL,
	precio float8 NULL,
	url_image varchar(255) NULL,
	CONSTRAINT productos_pkey PRIMARY KEY (id)
);
CREATE TABLE puntuacion (
	id bigserial NOT NULL,
	nivel_calidad float8 NULL,
	nivel_diseno float8 NULL,
	nivel_precio float8 NULL,
	id_producto int8 NULL,
	CONSTRAINT puntuacion_pkey PRIMARY KEY (id)
);


-- public.puntuacion foreign keys

ALTER TABLE public.puntuacion ADD CONSTRAINT fkivvgi4fyi3rx81dvdncwvc1ke FOREIGN KEY (id_producto) REFERENCES productos(id);