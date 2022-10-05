package com.masterfullstack.app.springbootwebapp.repository;

import com.masterfullstack.app.springbootwebapp.models.entity.Puntuacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PuntuacionRepository extends JpaRepository<Puntuacion,Long> {
}
