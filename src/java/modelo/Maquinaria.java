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
@Table(name = "maquinaria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Maquinaria.findAll", query = "SELECT m FROM Maquinaria m")
    , @NamedQuery(name = "Maquinaria.findByIdMaquinaria", query = "SELECT m FROM Maquinaria m WHERE m.idMaquinaria = :idMaquinaria")
    , @NamedQuery(name = "Maquinaria.findByNombre", query = "SELECT m FROM Maquinaria m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Maquinaria.findByTipoMaquinaria", query = "SELECT m FROM Maquinaria m WHERE m.tipoMaquinaria = :tipoMaquinaria")
    , @NamedQuery(name = "Maquinaria.findByMarca", query = "SELECT m FROM Maquinaria m WHERE m.marca = :marca")
    , @NamedQuery(name = "Maquinaria.findByPrecioDia", query = "SELECT m FROM Maquinaria m WHERE m.precioDia = :precioDia")
    , @NamedQuery(name = "Maquinaria.findByExistencia", query = "SELECT m FROM Maquinaria m WHERE m.existencia = :existencia")
    , @NamedQuery(name = "Maquinaria.findByEstado", query = "SELECT m FROM Maquinaria m WHERE m.estado = :estado")
    , @NamedQuery(name = "Maquinaria.findByIdproyecto", query = "SELECT m FROM Maquinaria m WHERE m.idproyecto = :idproyecto")})
public class Maquinaria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMaquinaria")
    private Integer idMaquinaria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 49)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipoMaquinaria")
    private String tipoMaquinaria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioDia")
    private double precioDia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "existencia")
    private int existencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idproyecto")
    private int idproyecto;

    public Maquinaria() {
    }

    public Maquinaria(Integer idMaquinaria) {
        this.idMaquinaria = idMaquinaria;
    }

    public Maquinaria(Integer idMaquinaria, String nombre, String tipoMaquinaria, String marca, double precioDia, int existencia, String estado, int idproyecto) {
        this.idMaquinaria = idMaquinaria;
        this.nombre = nombre;
        this.tipoMaquinaria = tipoMaquinaria;
        this.marca = marca;
        this.precioDia = precioDia;
        this.existencia = existencia;
        this.estado = estado;
        this.idproyecto = idproyecto;
    }

    public Integer getIdMaquinaria() {
        return idMaquinaria;
    }

    public void setIdMaquinaria(Integer idMaquinaria) {
        this.idMaquinaria = idMaquinaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoMaquinaria() {
        return tipoMaquinaria;
    }

    public void setTipoMaquinaria(String tipoMaquinaria) {
        this.tipoMaquinaria = tipoMaquinaria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        hash += (idMaquinaria != null ? idMaquinaria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Maquinaria)) {
            return false;
        }
        Maquinaria other = (Maquinaria) object;
        if ((this.idMaquinaria == null && other.idMaquinaria != null) || (this.idMaquinaria != null && !this.idMaquinaria.equals(other.idMaquinaria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Maquinaria[ idMaquinaria=" + idMaquinaria + " ]";
    }
    
}
