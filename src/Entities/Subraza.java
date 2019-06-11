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
@Table(name = "Subraza")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subraza.findAll", query = "SELECT s FROM Subraza s")
    , @NamedQuery(name = "Subraza.findByIdSubraza", query = "SELECT s FROM Subraza s WHERE s.idSubraza = :idSubraza")
    , @NamedQuery(name = "Subraza.findByRaza", query = "SELECT s FROM Subraza s WHERE s.raza = :raza")})
public class Subraza implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idSubraza")
    private Integer idSubraza;
    @Basic(optional = false)
    @Column(name = "raza")
    private String raza;

    public Subraza() {
    }

    public Subraza(Integer idSubraza) {
        this.idSubraza = idSubraza;
    }

    public Subraza(Integer idSubraza, String raza) {
        this.idSubraza = idSubraza;
        this.raza = raza;
    }

    public Integer getIdSubraza() {
        return idSubraza;
    }

    public void setIdSubraza(Integer idSubraza) {
        this.idSubraza = idSubraza;
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
        hash += (idSubraza != null ? idSubraza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subraza)) {
            return false;
        }
        Subraza other = (Subraza) object;
        if ((this.idSubraza == null && other.idSubraza != null) || (this.idSubraza != null && !this.idSubraza.equals(other.idSubraza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Subraza[ idSubraza=" + idSubraza + " ]";
    }
    
}
