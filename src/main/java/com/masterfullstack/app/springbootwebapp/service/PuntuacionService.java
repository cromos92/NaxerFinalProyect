package com.masterfullstack.app.springbootwebapp.service;

import com.masterfullstack.app.springbootwebapp.models.entity.Puntuacion;
import com.masterfullstack.app.springbootwebapp.repository.PuntuacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<Puntuacion> findAll() {
        return this.puntuacionRepository.findAll();
    }
}
