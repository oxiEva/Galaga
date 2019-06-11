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
@Table(name = "HabilidadEspecial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HabilidadEspecial.findAll", query = "SELECT h FROM HabilidadEspecial h")
    , @NamedQuery(name = "HabilidadEspecial.findByIdHabilidadEspecial", query = "SELECT h FROM HabilidadEspecial h WHERE h.idHabilidadEspecial = :idHabilidadEspecial")
    , @NamedQuery(name = "HabilidadEspecial.findByNombreHabEsp", query = "SELECT h FROM HabilidadEspecial h WHERE h.nombreHabEsp = :nombreHabEsp")
    , @NamedQuery(name = "HabilidadEspecial.findByIdRaza", query = "SELECT h FROM HabilidadEspecial h WHERE h.idRaza = :idRaza")})
public class HabilidadEspecial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idHabilidadEspecial")
    private Integer idHabilidadEspecial;
    @Basic(optional = false)
    @Column(name = "nombreHabEsp")
    private String nombreHabEsp;
    @Basic(optional = false)
    @Column(name = "idRaza")
    private int idRaza;

    public HabilidadEspecial() {
    }

    public HabilidadEspecial(Integer idHabilidadEspecial) {
        this.idHabilidadEspecial = idHabilidadEspecial;
    }

    public HabilidadEspecial(Integer idHabilidadEspecial, String nombreHabEsp, int idRaza) {
        this.idHabilidadEspecial = idHabilidadEspecial;
        this.nombreHabEsp = nombreHabEsp;
        this.idRaza = idRaza;
    }

    public Integer getIdHabilidadEspecial() {
        return idHabilidadEspecial;
    }

    public void setIdHabilidadEspecial(Integer idHabilidadEspecial) {
        this.idHabilidadEspecial = idHabilidadEspecial;
    }

    public String getNombreHabEsp() {
        return nombreHabEsp;
    }

    public void setNombreHabEsp(String nombreHabEsp) {
        this.nombreHabEsp = nombreHabEsp;
    }

    public int getIdRaza() {
        return idRaza;
    }

    public void setIdRaza(int idRaza) {
        this.idRaza = idRaza;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHabilidadEspecial != null ? idHabilidadEspecial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HabilidadEspecial)) {
            return false;
        }
        HabilidadEspecial other = (HabilidadEspecial) object;
        if ((this.idHabilidadEspecial == null && other.idHabilidadEspecial != null) || (this.idHabilidadEspecial != null && !this.idHabilidadEspecial.equals(other.idHabilidadEspecial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.HabilidadEspecial[ idHabilidadEspecial=" + idHabilidadEspecial + " ]";
    }
    
}
