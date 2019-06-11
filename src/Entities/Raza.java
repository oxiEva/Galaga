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
@Table(name = "Raza")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Raza.findAll", query = "SELECT r FROM Raza r")
    , @NamedQuery(name = "Raza.findByIdRaza", query = "SELECT r FROM Raza r WHERE r.idRaza = :idRaza")
    , @NamedQuery(name = "Raza.findByRaza", query = "SELECT r FROM Raza r WHERE r.raza = :raza")})
public class Raza implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idRaza")
    private Integer idRaza;
    @Basic(optional = false)
    @Column(name = "raza")
    private String raza;

    public Raza() {
    }

    public Raza(Integer idRaza) {
        this.idRaza = idRaza;
    }

    public Raza(Integer idRaza, String raza) {
        this.idRaza = idRaza;
        this.raza = raza;
    }

    public Integer getIdRaza() {
        return idRaza;
    }

    public void setIdRaza(Integer idRaza) {
        this.idRaza = idRaza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRaza != null ? idRaza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Raza)) {
            return false;
        }
        Raza other = (Raza) object;
        if ((this.idRaza == null && other.idRaza != null) || (this.idRaza != null && !this.idRaza.equals(other.idRaza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Raza[ idRaza=" + idRaza + " ]";
    }
    
}
