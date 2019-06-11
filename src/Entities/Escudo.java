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
@Table(name = "Escudo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Escudo.findAll", query = "SELECT e FROM Escudo e")
    , @NamedQuery(name = "Escudo.findByIdEscudo", query = "SELECT e FROM Escudo e WHERE e.idEscudo = :idEscudo")
    , @NamedQuery(name = "Escudo.findByDefensa", query = "SELECT e FROM Escudo e WHERE e.defensa = :defensa")
    , @NamedQuery(name = "Escudo.findByNombreEscudo", query = "SELECT e FROM Escudo e WHERE e.nombreEscudo = :nombreEscudo")})
public class Escudo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idEscudo")
    private Integer idEscudo;
    @Basic(optional = false)
    @Column(name = "defensa")
    private int defensa;
    @Basic(optional = false)
    @Column(name = "nombreEscudo")
    private String nombreEscudo;

    public Escudo() {
    }

    public Escudo(Integer idEscudo) {
        this.idEscudo = idEscudo;
    }

    public Escudo(Integer idEscudo, int defensa, String nombreEscudo) {
        this.idEscudo = idEscudo;
        this.defensa = defensa;
        this.nombreEscudo = nombreEscudo;
    }

    public Integer getIdEscudo() {
        return idEscudo;
    }

    public void setIdEscudo(Integer idEscudo) {
        this.idEscudo = idEscudo;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getNombreEscudo() {
        return nombreEscudo;
    }

    public void setNombreEscudo(String nombreEscudo) {
        this.nombreEscudo = nombreEscudo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEscudo != null ? idEscudo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Escudo)) {
            return false;
        }
        Escudo other = (Escudo) object;
        if ((this.idEscudo == null && other.idEscudo != null) || (this.idEscudo != null && !this.idEscudo.equals(other.idEscudo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Escudo[ idEscudo=" + idEscudo + " ]";
    }
    
}
