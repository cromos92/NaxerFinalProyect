package com.masterfullstack.app.springbootwebapp.repository;

import com.masterfullstack.app.springbootwebapp.models.entity.Puntuacion;
import com.masterfullstack.app.springbootwebapp.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("SELECT u.email  FROM User u WHERE u.email = ?1")
    String findUserEmailByEmail(String email);

    @Query("SELECT u.password   FROM User u WHERE u.email = ?1")
    String findUserPasswordByEmail(String email );

}
