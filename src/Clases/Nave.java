package Clases;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eva
 */
public abstract class Nave {

    private int id;
    private char nombre;
    private char raza;
    private char subraza;
    private char medioNatural;
    private char imagen;
    private int ataque;
    private int defensa;
    private ArrayList[] habEspArrayLists;
    private boolean disponibilidad;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    /**
     *
     * @return
     */
    public char getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public char getRaza() {
        return raza;
    }

    /**
     *
     * @param raza
     */
    public void setRaza(char raza) {
        this.raza = raza;
    }

    /**
     *
     * @return
     */
    public char getSubraza() {
        return subraza;
    }

    /**
     *
     * @param subraza
     */
    public void setSubraza(char subraza) {
        this.subraza = subraza;
    }

    /**
     *
     * @return
     */
    public char getMedioNatural() {
        return medioNatural;
    }

    /**
     *
     * @param medioNatural
     */
    public void setMedioNatural(char medioNatural) {
        this.medioNatural = medioNatural;
    }

    /**
     *
     * @return
     */
    public char getImagen() {
        return imagen;
    }

    /**
     *
     * @param imagen
     */
    public void setImagen(char imagen) {
        this.imagen = imagen;
    }

    /**
     *
     * @return
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     *
     * @param ataque
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     *
     * @return
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     *
     * @param defensa
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public ArrayList[] getHabEspArrayLists() {
        return habEspArrayLists;
    }

    public void setHabEspArrayLists(ArrayList[] habEspArrayLists) {
        this.habEspArrayLists = habEspArrayLists;
    }

    /**
     *
     * @return
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     *
     * @param disponibilidad
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
    
}
