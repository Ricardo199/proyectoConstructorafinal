/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ricardo Burgos
 */
@Entity
@Table(name = "proyecto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyecto.findAll", query = "SELECT p FROM Proyecto p")
    , @NamedQuery(name = "Proyecto.findByIdProyecto", query = "SELECT p FROM Proyecto p WHERE p.idProyecto = :idProyecto")
    , @NamedQuery(name = "Proyecto.findByFechaInicio", query = "SELECT p FROM Proyecto p WHERE p.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Proyecto.findByFechaFinal", query = "SELECT p FROM Proyecto p WHERE p.fechaFinal = :fechaFinal")
    , @NamedQuery(name = "Proyecto.findByDireccion", query = "SELECT p FROM Proyecto p WHERE p.direccion = :direccion")
    , @NamedQuery(name = "Proyecto.findByPoercetajeGanancia", query = "SELECT p FROM Proyecto p WHERE p.poercetajeGanancia = :poercetajeGanancia")
    , @NamedQuery(name = "Proyecto.findByMontoEmpleados", query = "SELECT p FROM Proyecto p WHERE p.montoEmpleados = :montoEmpleados")
    , @NamedQuery(name = "Proyecto.findByMontoMaquinaria", query = "SELECT p FROM Proyecto p WHERE p.montoMaquinaria = :montoMaquinaria")
    , @NamedQuery(name = "Proyecto.findByMontoMateriaPrima", query = "SELECT p FROM Proyecto p WHERE p.montoMateriaPrima = :montoMateriaPrima")
    , @NamedQuery(name = "Proyecto.findByMontoToltal", query = "SELECT p FROM Proyecto p WHERE p.montoToltal = :montoToltal")
    , @NamedQuery(name = "Proyecto.findByPorcentajeAvanse", query = "SELECT p FROM Proyecto p WHERE p.porcentajeAvanse = :porcentajeAvanse")
    , @NamedQuery(name = "Proyecto.findByEstadoActual", query = "SELECT p FROM Proyecto p WHERE p.estadoActual = :estadoActual")
    , @NamedQuery(name = "Proyecto.findByClienteIdcliente", query = "SELECT p FROM Proyecto p WHERE p.clienteIdcliente = :clienteIdcliente")})
public class Proyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_proyecto")
    private Integer idProyecto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaFinal")
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "poercetajeGanancia")
    private double poercetajeGanancia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "montoEmpleados")
    private double montoEmpleados;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontoMaquinaria")
    private double montoMaquinaria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "montoMateriaPrima")
    private double montoMateriaPrima;
    @Basic(optional = false)
    @NotNull
    @Column(name = "montoToltal")
    private double montoToltal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "porcentajeAvanse")
    private int porcentajeAvanse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "estadoActual")
    private String estadoActual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cliente_idcliente")
    private int clienteIdcliente;

    public Proyecto() {
    }

    public Proyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public Proyecto(Integer idProyecto, Date fechaInicio, Date fechaFinal, String direccion, double poercetajeGanancia, double montoEmpleados, double montoMaquinaria, double montoMateriaPrima, double montoToltal, int porcentajeAvanse, String estadoActual, int clienteIdcliente) {
        this.idProyecto = idProyecto;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.direccion = direccion;
        this.poercetajeGanancia = poercetajeGanancia;
        this.montoEmpleados = montoEmpleados;
        this.montoMaquinaria = montoMaquinaria;
        this.montoMateriaPrima = montoMateriaPrima;
        this.montoToltal = montoToltal;
        this.porcentajeAvanse = porcentajeAvanse;
        this.estadoActual = estadoActual;
        this.clienteIdcliente = clienteIdcliente;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPoercetajeGanancia() {
        return poercetajeGanancia;
    }

    public void setPoercetajeGanancia(double poercetajeGanancia) {
        this.poercetajeGanancia = poercetajeGanancia;
    }

    public double getMontoEmpleados() {
        return montoEmpleados;
    }

    public void setMontoEmpleados(double montoEmpleados) {
        this.montoEmpleados = montoEmpleados;
    }

    public double getMontoMaquinaria() {
        return montoMaquinaria;
    }

    public void setMontoMaquinaria(double montoMaquinaria) {
        this.montoMaquinaria = montoMaquinaria;
    }

    public double getMontoMateriaPrima() {
        return montoMateriaPrima;
    }

    public void setMontoMateriaPrima(double montoMateriaPrima) {
        this.montoMateriaPrima = montoMateriaPrima;
    }

    public double getMontoToltal() {
        return montoToltal;
    }

    public void setMontoToltal(double montoToltal) {
        this.montoToltal = montoToltal;
    }

    public int getPorcentajeAvanse() {
        return porcentajeAvanse;
    }

    public void setPorcentajeAvanse(int porcentajeAvanse) {
        this.porcentajeAvanse = porcentajeAvanse;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public int getClienteIdcliente() {
        return clienteIdcliente;
    }

    public void setClienteIdcliente(int clienteIdcliente) {
        this.clienteIdcliente = clienteIdcliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProyecto != null ? idProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyecto)) {
            return false;
        }
        Proyecto other = (Proyecto) object;
        if ((this.idProyecto == null && other.idProyecto != null) || (this.idProyecto != null && !this.idProyecto.equals(other.idProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Proyecto[ idProyecto=" + idProyecto + " ]";
    }
    
}
