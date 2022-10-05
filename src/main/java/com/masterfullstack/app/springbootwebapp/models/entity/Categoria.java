package com.masterfullstack.app.springbootwebapp.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private LocalDateTime fechaLastUpdate;
    public LocalDateTime getFechaLastUpdate() {
        return fechaLastUpdate;
    }

    public void setFechaLastUpdate(LocalDateTime fechaLastUpdate) {
        this.fechaLastUpdate = fechaLastUpdate;
    }




}
