package com.masterfullstack.app.springbootwebapp.repository;

import com.masterfullstack.app.springbootwebapp.models.entity.Puntuacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PuntuacionRepository extends JpaRepository<Puntuacion,Long> {

    @Query(
            value = "SELECT *  FROM puntuacion p where p.id_producto = :#{#id} ",
            nativeQuery = true)
    List<Puntuacion> findPuntuacionWithIdProducto(@Param("id") Long id);
}
