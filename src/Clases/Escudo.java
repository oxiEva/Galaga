/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author eva
 */
public class Escudo extends Nave{
    
    private int idEscudo;
    private int defensa;
    private char nombreEscudo;

    public int getIdEscudo() {
        return idEscudo;
    }

    public void setIdEscudo(int idEscudo) {
        this.idEscudo = idEscudo;
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public char getNombreEscudo() {
        return nombreEscudo;
    }
    
    public void setNombreEscudo(char nombreEscudo) {
        this.nombreEscudo = nombreEscudo;
    }
       
   
    
}
