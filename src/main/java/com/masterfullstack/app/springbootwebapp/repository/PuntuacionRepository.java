package com.masterfullstack.app.springbootwebapp.repository;

import com.masterfullstack.app.springbootwebapp.models.entity.Puntuacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public interface PuntuacionRepository extends JpaRepository<Puntuacion,Long> {

    @Query(
            value = "SELECT *  FROM puntuacion p where p.id_producto = :#{#id} ",
            nativeQuery = true)
    List<Puntuacion> findPuntuacionWithIdProducto(@Param("id") Long id);

    @Query(
            value = "SELECT  avg( p.nivel_calidad) as promedioCalidad,\n" +
                    "avg( p.nivel_precio) as promedioPrecio,\n" +
                    "avg( p.nivel_diseno) as promedioDiseno\n" +
                    "from  puntuacion as p WHERE p.id_producto=?1",nativeQuery = true
    )
    List<String> findPuntuacionPromedioPorID(Long id);


    @Modifying
    @Query(
          value = "DELETE FROM puntuacion punt WHERE punt.id_producto = ?1",nativeQuery = true
    )
   void deletePuntuacionesPorIdProducto( Long id);

}

