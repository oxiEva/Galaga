/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eva
 */
@Entity
@Table(name = "Equipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipo.findAll", query = "SELECT e FROM Equipo e")
    , @NamedQuery(name = "Equipo.findByIdEquipo", query = "SELECT e FROM Equipo e WHERE e.idEquipo = :idEquipo")
    , @NamedQuery(name = "Equipo.findByNivel", query = "SELECT e FROM Equipo e WHERE e.nivel = :nivel")
    , @NamedQuery(name = "Equipo.findByExperiencia", query = "SELECT e FROM Equipo e WHERE e.experiencia = :experiencia")
    , @NamedQuery(name = "Equipo.findByVictorias", query = "SELECT e FROM Equipo e WHERE e.victorias = :victorias")
    , @NamedQuery(name = "Equipo.findByIdJugador", query = "SELECT e FROM Equipo e WHERE e.idJugador = :idJugador")})
public class Equipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idEquipo")
    private Integer idEquipo;
    @Basic(optional = false)
    @Column(name = "nivel")
    private int nivel;
    @Basic(optional = false)
    @Column(name = "experiencia")
    private int experiencia;
    @Basic(optional = false)
    @Column(name = "victorias")
    private int victorias;
    @Basic(optional = false)
    @Column(name = "idJugador")
    private int idJugador;

    public Equipo() {
    }

    public Equipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Equipo(Integer idEquipo, int nivel, int experiencia, int victorias, int idJugador) {
        this.idEquipo = idEquipo;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.victorias = victorias;
        this.idJugador = idJugador;
    }

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipo != null ? idEquipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipo)) {
            return false;
        }
        Equipo other = (Equipo) object;
        if ((this.idEquipo == null && other.idEquipo != null) || (this.idEquipo != null && !this.idEquipo.equals(other.idEquipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Equipo[ idEquipo=" + idEquipo + " ]";
    }
    
}
