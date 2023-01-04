package com.masterfullstack.app.springbootwebapp.controllers;

import com.masterfullstack.app.springbootwebapp.models.entity.Categoria;
import com.masterfullstack.app.springbootwebapp.service.CategoriaService;
import com.masterfullstack.app.springbootwebapp.service.dto.CategoriaDto;
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

    @PostMapping()
    public Categoria crearCategoria(@RequestBody CategoriaDto categoriaDto) {
        return this.categoriaService.crearCategoria(categoriaDto);
    }

    @GetMapping()
    public List<Categoria> GetAllCategorys() {
        return this.categoriaService.getAllCategorias();
    }

    @GetMapping("/{id}")
    public Optional<Categoria> GetCategoryByID(@PathVariable Long id) {
        return this.categoriaService.getCategoryByID(id);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id) {
        return this.categoriaService.DeleteById(id);
    }

}
