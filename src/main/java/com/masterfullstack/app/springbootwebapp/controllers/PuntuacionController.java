package com.masterfullstack.app.springbootwebapp.controllers;

import com.masterfullstack.app.springbootwebapp.models.entity.Puntuacion;
import com.masterfullstack.app.springbootwebapp.service.PuntuacionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/puntuacion")
public class PuntuacionController {
    private  final PuntuacionService puntuacionService;

    public PuntuacionController(PuntuacionService puntuacionService) {
        this.puntuacionService = puntuacionService;
    }
    @GetMapping( )
    public  List<Puntuacion> getAllPuntuacion( ){
        return this.puntuacionService.findAll();
    }
    @GetMapping("/{id}")
    public  List<Puntuacion> getAllPuntuacionPorID(@PathVariable Long id){
        return this.puntuacionService.findPuntuacionWithIdProducto(id);
    }
    @GetMapping("/promedio/{id}")
    public  List<String> getPuntuacionPromedioPorID(@PathVariable Long id){

        return this.puntuacionService.findPuntuacionPromedioPorID(id);
    }
    @PostMapping()
    public Puntuacion crearPuntuacion(@RequestBody Puntuacion puntuacion){
        System.out.println(puntuacion);
        return this.puntuacionService.crearPuntuacion(puntuacion);
    }

}
