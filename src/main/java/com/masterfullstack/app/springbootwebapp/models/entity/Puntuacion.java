package com.masterfullstack.app.springbootwebapp.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

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



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double nivelPrecio;
    private Double nivelCalidad;
    private Double nivelDiseno;
    private String comentario;

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    private Long id_producto;
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }




  //  @ManyToOne
  //  @JoinColumn(name = "producto_id", insertable = false )
   // private Producto producto;
}
