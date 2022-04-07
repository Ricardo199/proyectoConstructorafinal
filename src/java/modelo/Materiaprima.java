/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ricardo Burgos
 */
@Entity
@Table(name = "materiaprima")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materiaprima.findAll", query = "SELECT m FROM Materiaprima m")
    , @NamedQuery(name = "Materiaprima.findByIdmateriaPrima", query = "SELECT m FROM Materiaprima m WHERE m.idmateriaPrima = :idmateriaPrima")
    , @NamedQuery(name = "Materiaprima.findByNombre", query = "SELECT m FROM Materiaprima m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Materiaprima.findByPrecioUnidad", query = "SELECT m FROM Materiaprima m WHERE m.precioUnidad = :precioUnidad")
    , @NamedQuery(name = "Materiaprima.findByExistencia", query = "SELECT m FROM Materiaprima m WHERE m.existencia = :existencia")
    , @NamedQuery(name = "Materiaprima.findByIdproyecto", query = "SELECT m FROM Materiaprima m WHERE m.idproyecto = :idproyecto")})
public class Materiaprima implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmateriaPrima")
    private Integer idmateriaPrima;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioUnidad")
    private double precioUnidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "existencia")
    private double existencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idproyecto")
    private int idproyecto;

    public Materiaprima() {
    }

    public Materiaprima(Integer idmateriaPrima) {
        this.idmateriaPrima = idmateriaPrima;
    }

    public Materiaprima(Integer idmateriaPrima, String nombre, double precioUnidad, double existencia, int idproyecto) {
        this.idmateriaPrima = idmateriaPrima;
        this.nombre = nombre;
        this.precioUnidad = precioUnidad;
        this.existencia = existencia;
        this.idproyecto = idproyecto;
    }

    public Integer getIdmateriaPrima() {
        return idmateriaPrima;
    }

    public void setIdmateriaPrima(Integer idmateriaPrima) {
        this.idmateriaPrima = idmateriaPrima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public double getExistencia() {
        return existencia;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }

    public int getIdproyecto() {
        return idproyecto;
    }

    public void setIdproyecto(int idproyecto) {
        this.idproyecto = idproyecto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmateriaPrima != null ? idmateriaPrima.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materiaprima)) {
            return false;
        }
        Materiaprima other = (Materiaprima) object;
        if ((this.idmateriaPrima == null && other.idmateriaPrima != null) || (this.idmateriaPrima != null && !this.idmateriaPrima.equals(other.idmateriaPrima))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Materiaprima[ idmateriaPrima=" + idmateriaPrima + " ]";
    }
    
}
