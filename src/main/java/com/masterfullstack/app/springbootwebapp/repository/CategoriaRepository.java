package com.masterfullstack.app.springbootwebapp.repository;

import com.masterfullstack.app.springbootwebapp.models.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
