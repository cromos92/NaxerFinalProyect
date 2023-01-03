package com.masterfullstack.app.springbootwebapp.controllers;

import com.masterfullstack.app.springbootwebapp.models.entity.Producto;
import com.masterfullstack.app.springbootwebapp.service.ProductoService;
import com.masterfullstack.app.springbootwebapp.service.dto.ProductoDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/products")
public class ProductoController {

    private  final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping()
    public List<Producto> getAllProducts(){
        return this.productoService.findAll();
    }
    @GetMapping("/categorys")
    public List<Producto> getAllProductoWithCategory(){
        return this.productoService.findAllWithCategory();
    }
    @GetMapping("/{id}")
    public Optional<Producto> getProductByID(@PathVariable Long id){
        return this.productoService.getProductoPorID(id);
    }
    @PostMapping()
    public Producto createProduct(@RequestBody ProductoDto productoInDto){

        return this.productoService.crearProducto(productoInDto);
    }
    @DeleteMapping("/{id}")
    public String deleteByID(Long id){
        return this.productoService.deleteById(id);
    }

}
