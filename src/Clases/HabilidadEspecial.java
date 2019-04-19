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
public class HabilidadEspecial extends Nave{
    private int idHabEsp;
    private char nombreHabEsp;
    private ArrayList[] razaArrayLists;

    public int getIdHabEsp() {
        return idHabEsp;
    }

    public void setIdHabEsp(int idHabEsp) {
        this.idHabEsp = idHabEsp;
    }

    public char getNombreHabEsp() {
        return nombreHabEsp;
    }

    public void setNombreHabEsp(char nombreHabEsp) {
        this.nombreHabEsp = nombreHabEsp;
    }

    public ArrayList[] getRazaArrayLists() {
        return razaArrayLists;
    }

    public void setRazaArrayLists(ArrayList[] razaArrayLists) {
        this.razaArrayLists = razaArrayLists;
    }
    
    
    
}
