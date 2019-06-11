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
@Table(name = "Arma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arma.findAll", query = "SELECT a FROM Arma a")
    , @NamedQuery(name = "Arma.findByIdArma", query = "SELECT a FROM Arma a WHERE a.idArma = :idArma")
    , @NamedQuery(name = "Arma.findByAtaque", query = "SELECT a FROM Arma a WHERE a.ataque = :ataque")
    , @NamedQuery(name = "Arma.findByNombreArma", query = "SELECT a FROM Arma a WHERE a.nombreArma = :nombreArma")})
public class Arma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idArma")
    private Integer idArma;
    @Basic(optional = false)
    @Column(name = "ataque")
    private int ataque;
    @Basic(optional = false)
    @Column(name = "nombreArma")
    private String nombreArma;

    public Arma() {
    }

    public Arma(Integer idArma) {
        this.idArma = idArma;
    }

    public Arma(Integer idArma, int ataque, String nombreArma) {
        this.idArma = idArma;
        this.ataque = ataque;
        this.nombreArma = nombreArma;
    }

    public Integer getIdArma() {
        return idArma;
    }

    public void setIdArma(Integer idArma) {
        this.idArma = idArma;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArma != null ? idArma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arma)) {
            return false;
        }
        Arma other = (Arma) object;
        if ((this.idArma == null && other.idArma != null) || (this.idArma != null && !this.idArma.equals(other.idArma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Arma[ idArma=" + idArma + " ]";
    }
    
}
