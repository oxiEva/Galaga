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
public class Arma extends Nave{
    
    private int idArma;
    private int ataque;
    private char nombreArma;

    public int getIdArma() {
        return idArma;
    }

    public void setIdArma(int idArma) {
        this.idArma = idArma;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public char getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma(char nombreArma) {
        this.nombreArma = nombreArma;
    }

  
    
}
