package com.masterfullstack.app.springbootwebapp.controllers;

import com.masterfullstack.app.springbootwebapp.models.entity.Categoria;
import com.masterfullstack.app.springbootwebapp.service.CategoriaService;
import com.masterfullstack.app.springbootwebapp.service.dto.CategoriaDto;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RequestMapping("/categorys")
public class CategoriaController {
    private final CategoriaService categoriaService;


    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping()
    public List<Categoria> ObtenerTodasLasCategorias() {
        return this.categoriaService.getAllCategorias();
    }

    @GetMapping("/{id}")
    public Optional<Categoria> ObtenerCategoriaPorID(@PathVariable Long id) {
        return this.categoriaService.getCategoryByID(id);
    }
    @PostMapping()
    public Categoria CrearCategoria(@RequestBody CategoriaDto categoriaDto) {
        return this.categoriaService.crearCategoria(categoriaDto);
    }


    @DeleteMapping("/{id}")
    public String EliminarCategoriaPorID(@PathVariable Long id) {
        return this.categoriaService.DeleteById(id);
    }

}
