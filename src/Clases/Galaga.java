/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author eva
 */
public class Galaga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena;
        int enter;
        char lletra;
        
        cadena = JOptionPane.showInputDialog("Digues un text: ");
        enter = Integer.parseInt(JOptionPane.showInputDialog("Digues un nº: "));
        lletra = JOptionPane.showInputDialog("Digues un lletra: ").charAt(0);
        
        
        JOptionPane.showMessageDialog(null, "La cadenas es: " + cadena);
        JOptionPane.showMessageDialog(null, "El numero es: " + enter);
        JOptionPane.showMessageDialog(null, "La lletra es: " +lletra);
        
    }
    
}
