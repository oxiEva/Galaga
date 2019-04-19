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
public class Subraza extends Nave{
    private int idSubraza;
    private char subraza;

    public int getIdSubraza() {
        return idSubraza;
    }

    public void setIdSubraza(int idSubraza) {
        this.idSubraza = idSubraza;
    }

  
    @Override
    public char getSubraza() {
        return subraza;
    }

    @Override
    public void setSubraza(char subraza) {
        this.subraza = subraza;
    }
   
   
  
    
}
