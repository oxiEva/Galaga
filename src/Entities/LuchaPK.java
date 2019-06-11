/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author eva
 */
@Embeddable
public class LuchaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idLucha")
    private int idLucha;
    @Basic(optional = false)
    @Column(name = "idJugador")
    private int idJugador;

    public LuchaPK() {
    }

    public LuchaPK(int idLucha, int idJugador) {
        this.idLucha = idLucha;
        this.idJugador = idJugador;
    }

    public int getIdLucha() {
        return idLucha;
    }

    public void setIdLucha(int idLucha) {
        this.idLucha = idLucha;
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
        hash += (int) idLucha;
        hash += (int) idJugador;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LuchaPK)) {
            return false;
        }
        LuchaPK other = (LuchaPK) object;
        if (this.idLucha != other.idLucha) {
            return false;
        }
        if (this.idJugador != other.idJugador) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.LuchaPK[ idLucha=" + idLucha + ", idJugador=" + idJugador + " ]";
    }
    
}
