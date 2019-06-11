/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eva
 */
@Entity
@Table(name = "Lucha")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lucha.findAll", query = "SELECT l FROM Lucha l")
    , @NamedQuery(name = "Lucha.findByIdLucha", query = "SELECT l FROM Lucha l WHERE l.luchaPK.idLucha = :idLucha")
    , @NamedQuery(name = "Lucha.findByIdJugador", query = "SELECT l FROM Lucha l WHERE l.luchaPK.idJugador = :idJugador")
    , @NamedQuery(name = "Lucha.findByIdEquipo", query = "SELECT l FROM Lucha l WHERE l.idEquipo = :idEquipo")})
public class Lucha implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LuchaPK luchaPK;
    @Column(name = "idEquipo")
    private Integer idEquipo;

    public Lucha() {
    }

    public Lucha(LuchaPK luchaPK) {
        this.luchaPK = luchaPK;
    }

    public Lucha(int idLucha, int idJugador) {
        this.luchaPK = new LuchaPK(idLucha, idJugador);
    }

    public LuchaPK getLuchaPK() {
        return luchaPK;
    }

    public void setLuchaPK(LuchaPK luchaPK) {
        this.luchaPK = luchaPK;
    }

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (luchaPK != null ? luchaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lucha)) {
            return false;
        }
        Lucha other = (Lucha) object;
        if ((this.luchaPK == null && other.luchaPK != null) || (this.luchaPK != null && !this.luchaPK.equals(other.luchaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Lucha[ luchaPK=" + luchaPK + " ]";
    }
    
}
