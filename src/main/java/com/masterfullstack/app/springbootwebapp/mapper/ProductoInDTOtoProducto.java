package com.masterfullstack.app.springbootwebapp.mapper;

import com.masterfullstack.app.springbootwebapp.models.entity.Producto;
import com.masterfullstack.app.springbootwebapp.service.dto.ProductoDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ProductoInDTOtoProducto implements IMapper<ProductoDto, Producto> {
    @Override
    public Producto map(ProductoDto in){
        Producto producto = new Producto();

        producto.setUrlImage(in.getUrlImage());
        producto.setDescripcion(in.getDescripcion());
        producto.setNombre(in.getNombre());
        producto.setPrecio(in.getPrecio());
        producto.setFechaCreacion(LocalDateTime.now());

        return producto;
    }
}
