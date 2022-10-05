package com.masterfullstack.app.springbootwebapp.service.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ProductoDto {
    private Long idPuntuacion;
    private Long idUser;
    private String urlImage;
    private String nombre;
    private Double precio;
    private LocalDateTime fechaCreacion;
}
