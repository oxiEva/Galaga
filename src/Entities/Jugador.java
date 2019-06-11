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
@Table(name = "Jugador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jugador.findAll", query = "SELECT j FROM Jugador j")
    , @NamedQuery(name = "Jugador.findByIdJugador", query = "SELECT j FROM Jugador j WHERE j.idJugador = :idJugador")
    , @NamedQuery(name = "Jugador.findByIdNave", query = "SELECT j FROM Jugador j WHERE j.idNave = :idNave")
    , @NamedQuery(name = "Jugador.findByIdEquipo", query = "SELECT j FROM Jugador j WHERE j.idEquipo = :idEquipo")
    , @NamedQuery(name = "Jugador.findByPuntuacion", query = "SELECT j FROM Jugador j WHERE j.puntuacion = :puntuacion")
    , @NamedQuery(name = "Jugador.findByExperiencia", query = "SELECT j FROM Jugador j WHERE j.experiencia = :experiencia")
    , @NamedQuery(name = "Jugador.findByIdUsuario", query = "SELECT j FROM Jugador j WHERE j.idUsuario = :idUsuario")})
public class Jugador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idJugador")
    private Integer idJugador;
    @Basic(optional = false)
    @Column(name = "idNave")
    private int idNave;
    @Basic(optional = false)
    @Column(name = "idEquipo")
    private int idEquipo;
    @Basic(optional = false)
    @Column(name = "puntuacion")
    private int puntuacion;
    @Basic(optional = false)
    @Column(name = "experiencia")
    private int experiencia;
    @Basic(optional = false)
    @Column(name = "idUsuario")
    private int idUsuario;

    public Jugador() {
    }

    public Jugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    public Jugador(Integer idJugador, int idNave, int idEquipo, int puntuacion, int experiencia, int idUsuario) {
        this.idJugador = idJugador;
        this.idNave = idNave;
        this.idEquipo = idEquipo;
        this.puntuacion = puntuacion;
        this.experiencia = experiencia;
        this.idUsuario = idUsuario;
    }

    public Integer getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    public int getIdNave() {
        return idNave;
    }

    public void setIdNave(int idNave) {
        this.idNave = idNave;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJugador != null ? idJugador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugador)) {
            return false;
        }
        Jugador other = (Jugador) object;
        if ((this.idJugador == null && other.idJugador != null) || (this.idJugador != null && !this.idJugador.equals(other.idJugador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Jugador[ idJugador=" + idJugador + " ]";
    }
    
}
