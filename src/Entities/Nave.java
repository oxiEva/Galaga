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
@Table(name = "Nave")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nave.findAll", query = "SELECT n FROM Nave n")
    , @NamedQuery(name = "Nave.findByIdNave", query = "SELECT n FROM Nave n WHERE n.idNave = :idNave")
    , @NamedQuery(name = "Nave.findByNombre", query = "SELECT n FROM Nave n WHERE n.nombre = :nombre")
    , @NamedQuery(name = "Nave.findByRaza", query = "SELECT n FROM Nave n WHERE n.raza = :raza")
    , @NamedQuery(name = "Nave.findBySubraza", query = "SELECT n FROM Nave n WHERE n.subraza = :subraza")
    , @NamedQuery(name = "Nave.findByMedioNatural", query = "SELECT n FROM Nave n WHERE n.medioNatural = :medioNatural")
    , @NamedQuery(name = "Nave.findByImagen", query = "SELECT n FROM Nave n WHERE n.imagen = :imagen")
    , @NamedQuery(name = "Nave.findByAtaque", query = "SELECT n FROM Nave n WHERE n.ataque = :ataque")
    , @NamedQuery(name = "Nave.findByDefensa", query = "SELECT n FROM Nave n WHERE n.defensa = :defensa")
    , @NamedQuery(name = "Nave.findByDisponibilidad", query = "SELECT n FROM Nave n WHERE n.disponibilidad = :disponibilidad")
    , @NamedQuery(name = "Nave.findByHabilidadEspecial", query = "SELECT n FROM Nave n WHERE n.habilidadEspecial = :habilidadEspecial")})
public class Nave implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idNave")
    private Integer idNave;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "raza")
    private String raza;
    @Basic(optional = false)
    @Column(name = "subraza")
    private String subraza;
    @Basic(optional = false)
    @Column(name = "medioNatural")
    private String medioNatural;
    @Column(name = "imagen")
    private String imagen;
    @Basic(optional = false)
    @Column(name = "ataque")
    private int ataque;
    @Basic(optional = false)
    @Column(name = "defensa")
    private int defensa;
    @Basic(optional = false)
    @Column(name = "disponibilidad")
    private boolean disponibilidad;
    @Column(name = "habilidadEspecial")
    private Integer habilidadEspecial;

    public Nave() {
    }

    public Nave(Integer idNave) {
        this.idNave = idNave;
    }

    public Nave(Integer idNave, String nombre, String raza, String subraza, String medioNatural, int ataque, int defensa, boolean disponibilidad) {
        this.idNave = idNave;
        this.nombre = nombre;
        this.raza = raza;
        this.subraza = subraza;
        this.medioNatural = medioNatural;
        this.ataque = ataque;
        this.defensa = defensa;
        this.disponibilidad = disponibilidad;
    }

    public Integer getIdNave() {
        return idNave;
    }

    public void setIdNave(Integer idNave) {
        this.idNave = idNave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSubraza() {
        return subraza;
    }

    public void setSubraza(String subraza) {
        this.subraza = subraza;
    }

    public String getMedioNatural() {
        return medioNatural;
    }

    public void setMedioNatural(String medioNatural) {
        this.medioNatural = medioNatural;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Integer getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(Integer habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNave != null ? idNave.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nave)) {
            return false;
        }
        Nave other = (Nave) object;
        if ((this.idNave == null && other.idNave != null) || (this.idNave != null && !this.idNave.equals(other.idNave))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Nave[ idNave=" + idNave + " ]";
    }
    
}
