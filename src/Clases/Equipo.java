/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author eva
 */
public class Equipo {
    
    private int id;
    private ArrayList[] jugadorArrayLists;
    private int nivel;
    private int experiencia;
    private int victorias;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList[] getJugadorArrayLists() {
        return jugadorArrayLists;
    }

    public void setJugadorArrayLists(ArrayList[] jugadorArrayLists) {
        this.jugadorArrayLists = jugadorArrayLists;
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
    
    
}
