package com.masterfullstack.app.springbootwebapp.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPuntuacion() {
        return idPuntuacion;
    }

    public void setIdPuntuacion(Long idPuntuacion) {
        this.idPuntuacion = idPuntuacion;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }



    private Long idPuntuacion;
    private Long idUser;
    private String urlImage;
    private String nombre;
    private Double precio;

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    private LocalDateTime fechaCreacion;

    private static final long serialVersionUID=1L;
    /**@ManyToOne(targetEntity = Categoria.class,cascade = CascadeType.ALL)
    @JoinColumn(name="c_fk",referencedColumnName = "id")
    private List<Producto> categorias;**/
}
