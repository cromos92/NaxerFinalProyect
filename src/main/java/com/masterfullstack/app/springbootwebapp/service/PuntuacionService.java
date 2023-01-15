package com.masterfullstack.app.springbootwebapp.service;

import com.masterfullstack.app.springbootwebapp.models.entity.Puntuacion;
import com.masterfullstack.app.springbootwebapp.repository.PuntuacionRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PuntuacionService {
    private final PuntuacionRepository puntuacionRepository;

    public PuntuacionService(PuntuacionRepository puntuacionRepository) {
        this.puntuacionRepository = puntuacionRepository;
    }
    public Puntuacion crearPuntuacion(Puntuacion puntuacion) {

        return this.puntuacionRepository.save(puntuacion);
    }
    public List<Puntuacion> findPuntuacionWithIdProducto(long id){

        return this.puntuacionRepository.findPuntuacionWithIdProducto(id);
    }
    public List<String> findPuntuacionPromedioPorID(long id){
        return this.puntuacionRepository.findPuntuacionPromedioPorID(id);
    }
    public List<Puntuacion> findAll() {
        return this.puntuacionRepository.findAll();
    }

    public Optional<Puntuacion> obtenerPuntuacionPorID(long id) {
        return this.puntuacionRepository.findById( id);
    }
    public Boolean deletePuntuacionPorID(long id){
        this.puntuacionRepository.deleteById(id);
        return true;
    }

    public Long eliminarPuntuacionesPorIdProducto(long id) {
        this.puntuacionRepository.deletePuntuacionesPorIdProducto(id);
        return id;
    }
}
