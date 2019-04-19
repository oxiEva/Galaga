package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eva
 */
public class Raza extends Nave{
    private int idRaza;
    private char raza;

    
    public int getIdRaza() {
        return idRaza;
    }
    
    public void setIdRaza(int idRaza) {
        this.idRaza = idRaza;
    }

    @Override
    public char getRaza() {
        return raza;
    }
    
    @Override
    public void setRaza(char raza) {
        this.raza = raza;
    }   
    
}
