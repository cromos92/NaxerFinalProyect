package com.masterfullstack.app.springbootwebapp.service.dto;

import com.masterfullstack.app.springbootwebapp.models.entity.Producto;
import lombok.Data;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ProductoDto {

    private String urlImage;
    private String descripcion;
    private String nombre;
    private Double precio;
    private Integer idCategoria;
    private LocalDateTime fechaCreacion;

    @Query(" SELECT descripcion ,c.nombre  FROM productos p   join categoria c on p.id_categoria=c.id")
    List<Producto> getAllProductsWithCategory() {
        return null;
    }
}
