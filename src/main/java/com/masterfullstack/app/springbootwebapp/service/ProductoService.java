package com.masterfullstack.app.springbootwebapp.service;

import com.masterfullstack.app.springbootwebapp.mapper.ProductoInDTOtoProducto;
import com.masterfullstack.app.springbootwebapp.models.entity.Producto;
import com.masterfullstack.app.springbootwebapp.repository.ProductoRepository;
import com.masterfullstack.app.springbootwebapp.service.dto.ProductoDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;
    private final ProductoInDTOtoProducto mapper;
    public ProductoService(ProductoRepository productoRepository, ProductoInDTOtoProducto mapper) {
        this.productoRepository = productoRepository;
        this.mapper = mapper;
    }
    public Producto crearProducto(ProductoDto productoInDto) {
        Producto producto = mapper.map(productoInDto);
        return this.productoRepository.save(producto);
    }
 public List<Producto> findAll(){
        return this.productoRepository.findAll();
 }
 public List<Producto>findAllWithCategory(){

     return this.productoRepository.findAllWithCategory();
 }
 public Boolean eliminarProductoPorID(Long id){
     this.productoRepository.deleteById(id);
     return true ;
 }
public Optional<Producto> getProductoPorID(Long id){
        return this.productoRepository.findById(id);
}
public String deleteById(Long id){
        Optional<Producto> optionalProducto = this.productoRepository.findById(id);
        if(optionalProducto.isEmpty()){
            return "Producto no Existe";
        }
    this.productoRepository.deleteById(id);
        return "Producto Eliminado Correctamente";
}
}
