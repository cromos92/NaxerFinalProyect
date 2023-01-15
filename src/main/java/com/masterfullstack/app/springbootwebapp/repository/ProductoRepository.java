package com.masterfullstack.app.springbootwebapp.repository;

import com.masterfullstack.app.springbootwebapp.models.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {

    @Query(
            value = "SELECT *  FROM productos p   join categoria c on p.id_categoria=c.id",
            nativeQuery = true)
    List<Producto> findAllWithCategory();
}
