package com.masterfullstack.app.springbootwebapp.service.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class CategoriaDto {

    private String nombre;
    private LocalDateTime fechaLastUpdate;
}
