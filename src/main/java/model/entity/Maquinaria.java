package model.entity;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Created by ronnie on 4/10/16.
 */

@XmlRootElement
public class Maquinaria {

    @XmlTransient
    private Integer id;
    private Integer idTipo;
    private Integer idProveedor;
    private String nombre;
    private String estado;
    private Integer idManipulador;
    private Integer idObra;

    public Maquinaria() {
    }

    public Maquinaria(Integer id, Integer idTipo, Integer idProveedor, String nombre, String estado, Integer idManipulador, Integer idObra) {
        this.id = id;
        this.idTipo = idTipo;
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.estado = estado;
        this.idManipulador = idManipulador;
        this.idObra = idObra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdManipulador() {
        return idManipulador;
    }

    public void setIdManipulador(Integer idManipulador) {
        this.idManipulador = idManipulador;
    }

    public Integer getIdObra() {
        return idObra;
    }

    public void setIdObra(Integer idObra) {
        this.idObra = idObra;
    }
}