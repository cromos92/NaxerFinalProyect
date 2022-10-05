package com.masterfullstack.app.springbootwebapp.mapper;

import com.masterfullstack.app.springbootwebapp.models.entity.Categoria;
import com.masterfullstack.app.springbootwebapp.models.entity.Producto;
import com.masterfullstack.app.springbootwebapp.service.dto.CategoriaDto;
import com.masterfullstack.app.springbootwebapp.service.dto.ProductoDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

 @Component
public class CategoriaInDTOtoCategoria implements IMapper<CategoriaDto, Categoria> {


    @Override
    public Categoria map(CategoriaDto in){
        Categoria categoria = new Categoria();
        categoria.setNombre(in.getNombre());
        categoria.setFechaLastUpdate(LocalDateTime.now());
      return categoria;
    }
}
