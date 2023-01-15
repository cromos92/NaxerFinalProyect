package com.masterfullstack.app.springbootwebapp.controllers;

import com.masterfullstack.app.springbootwebapp.models.entity.Puntuacion;
import com.masterfullstack.app.springbootwebapp.service.PuntuacionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RequestMapping("/puntuacion")
public class PuntuacionController {
    private  final PuntuacionService puntuacionService;

    public PuntuacionController(PuntuacionService puntuacionService) {
        this.puntuacionService = puntuacionService;
    }
    @GetMapping( )
    public  List<Puntuacion> ObtenerTodasLasPuntuaciones( ){
        return this.puntuacionService.findAll();
    }
    @GetMapping("/puntuaciones/{id}")
    public  List<Puntuacion> ObtenerPuntuacionesPorIdProducto(@PathVariable Long id){

        return this.puntuacionService.findPuntuacionWithIdProducto(id);
    }
    @GetMapping("/puntuacion/{id}")
    public Optional<Puntuacion> obtenerPuntuacionPorID(@PathVariable Long id){

        return this.puntuacionService.obtenerPuntuacionPorID(id);
    }
    @GetMapping("/promedio/{id}")
    public  List<String> ObtenerPuntuacionPromediosPorID(@PathVariable Long id){

        return this.puntuacionService.findPuntuacionPromedioPorID(id);
    }
    @PostMapping()
    public Puntuacion CrearPuntuacion(@RequestBody Puntuacion puntuacion){
        System.out.println(puntuacion);
        return this.puntuacionService.crearPuntuacion(puntuacion);
    }
    @DeleteMapping("/deletePorID/{id}")
    public void EliminarPuntuacionesPorID(@PathVariable long id){
        this.puntuacionService.deletePuntuacionPorID(    id);

    }
    @DeleteMapping("/deletePuntuacionPorIdProd/{id}" )

    public void EliminarPuntuacionesProductosPorIdProductos(@PathVariable long id){

     this.puntuacionService.eliminarPuntuacionesPorIdProducto(id);

    }





}
