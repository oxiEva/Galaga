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
public class Lucha {
    private int idLucha;
    private ArrayList[] jugadorArrayLists;
    private ArrayList [] equipoArrayLists;
    private ArrayList [] puntuacionArrayLists;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int getIdLucha() {
        return idLucha;
    }

    public void setIdLucha(int idLucha) {
        this.idLucha = idLucha;
    }

    public ArrayList[] getJugadorArrayLists() {
        return jugadorArrayLists;
    }

    public void setJugadorArrayLists(ArrayList[] jugadorArrayLists) {
        this.jugadorArrayLists = jugadorArrayLists;
    }

    public ArrayList[] getEquipoArrayLists() {
        return equipoArrayLists;
    }

    public void setEquipoArrayLists(ArrayList[] equipoArrayLists) {
        this.equipoArrayLists = equipoArrayLists;
    }

    public ArrayList[] getPuntuacionArrayLists() {
        return puntuacionArrayLists;
    }

    public void setPuntuacionArrayLists(ArrayList[] puntuacionArrayLists) {
        this.puntuacionArrayLists = puntuacionArrayLists;
    }
    
}
