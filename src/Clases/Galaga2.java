/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Javier
 */
public class Galaga2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creando el Marco        
        JFrame frame = new JFrame("Frame");       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.setSize(600, 400);
        frame.setTitle("Galaga");
        
        //imagen para la aplicación
        Image im = Toolkit.getDefaultToolkit().getImage("img/nave.png");
        frame.setIconImage(im);
        frame.setVisible(true);

        // Creando MenuBar y agregando componentes   
        JMenuBar mb = new JMenuBar();       
        JMenu m1 = new JMenu("Juego");       
        JMenu m2 = new JMenu("Opciones");       
        JMenu m3 = new JMenu("Ayuda");        
        mb.add(m1);       
        mb.add(m2);       
        mb.add(m3);
        
        //submenus
        JMenuItem m11 = new JMenuItem("Nuevo Juego");       
        JMenuItem m22 = new JMenuItem("Puntuaciones");       
        JMenuItem m33 = new JMenuItem("Salir");       
        m1.add(m11);       
        m1.add(m22);        
        m1.add(m33); 
        JMenuItem m211 = new JMenuItem("Pantalla Completa");       
        JMenuItem m222 = new JMenuItem("Seleccionar Jugador");       
        JMenuItem m233 = new JMenuItem("Controles");       
        m2.add(m211);       
        m2.add(m222);        
        m2.add(m233); 
         
        // Creando el panel en la parte inferior y agregando componentes       
        JPanel panel = new JPanel(); // el panel no está visible en la salida      
         
        // Área de texto en el centro    
        JTextArea ta = new JTextArea();        
 
        // Agregar componentes al marco.      
        frame.getContentPane().add(BorderLayout.SOUTH, panel);       
        frame.getContentPane().add(BorderLayout.NORTH, mb);       
        
        //visulizacion por pantalla
        frame.setVisible(true);   
        
    }
    
}
