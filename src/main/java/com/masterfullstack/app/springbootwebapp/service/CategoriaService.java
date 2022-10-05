package com.masterfullstack.app.springbootwebapp.service;

import com.masterfullstack.app.springbootwebapp.mapper.CategoriaInDTOtoCategoria;
import com.masterfullstack.app.springbootwebapp.models.entity.Categoria;
import com.masterfullstack.app.springbootwebapp.models.entity.Producto;
import com.masterfullstack.app.springbootwebapp.repository.CategoriaRepository;
import com.masterfullstack.app.springbootwebapp.service.dto.CategoriaDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;
    private final CategoriaInDTOtoCategoria mapper;

    public CategoriaService(CategoriaRepository categoriaRepository, CategoriaInDTOtoCategoria mapper) {
        this.categoriaRepository = categoriaRepository;
        this.mapper = mapper;
    }
    public Categoria crearCategoria(CategoriaDto categoriaDto){
        Categoria categoria = mapper.map(categoriaDto);
        return this.categoriaRepository.save(categoria);
    }
    public List<Categoria> getAllCategorias(){
        return this.categoriaRepository.findAll();
    }
    public Optional<Categoria> getCategoryByID(Long id){
        return this.categoriaRepository.findById(id);
    }
    public String DeleteById(Long id){
        Optional<Categoria> optionalCategoria = this.categoriaRepository.findById(id);
        if(optionalCategoria.isEmpty()){
            return "Categoria no Existe";
        }
        this.categoriaRepository.deleteById(id);
        return "Categoria Eliminada Correctamente";
    }
}
