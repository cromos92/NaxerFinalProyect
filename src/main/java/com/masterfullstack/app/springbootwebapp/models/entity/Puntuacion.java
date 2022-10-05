package com.masterfullstack.app.springbootwebapp.models.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "puntuacion")
public class Puntuacion implements Serializable {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getNivelPrecio() {
        return nivelPrecio;
    }

    public void setNivelPrecio(Double nivelPrecio) {
        this.nivelPrecio = nivelPrecio;
    }

    public Double getNivelCalidad() {
        return nivelCalidad;
    }

    public void setNivelCalidad(Double nivelCalidad) {
        this.nivelCalidad = nivelCalidad;
    }

    public Double getNivelDiseno() {
        return nivelDiseno;
    }

    public void setNivelDiseno(Double nivelDiseno) {
        this.nivelDiseno = nivelDiseno;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double nivelPrecio;
    private Double nivelCalidad;
    private Double nivelDiseno;
    @ManyToOne( )
    @JoinColumn(name = "idProducto", referencedColumnName = "id")
    Producto producto;
}
