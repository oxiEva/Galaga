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
public class Jugador extends Usuario{
    
    private String nombre;
    private ArrayList[] naveArrayLists;
    private ArrayList[] equipoArrayLists;
    private int puntuacion;
    private int experiencia;
    private int victorias;


    
    
    public ArrayList[] getNaveArrayLists() {
        return naveArrayLists;
    }

    public void setNaveArrayLists(ArrayList[] naveArrayLists) {
        this.naveArrayLists = naveArrayLists;
    }

    public ArrayList[] getEquipoArrayLists() {
        return equipoArrayLists;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setEquipoArrayLists(ArrayList[] equipoArrayLists) {
        this.equipoArrayLists = equipoArrayLists;
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
