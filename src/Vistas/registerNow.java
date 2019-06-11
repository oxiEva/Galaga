/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author eva
 */


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.event.*;
import java.util.*;
import java.awt.GridLayout;
@SuppressWarnings("serial")



public class registerNow extends javax.swing.JFrame  implements ActionListener{     
JLabel title, idLabel, nameLabel, genderLabel, addressLabel, contactLabel;               
JTextField idField, nameField, genderField, addressField, contactField;             
JButton registerButton, exitButton;               
JRadioButton male, female;           
ButtonGroup bg;              
JPanel panel;                             
JTable table;                
String gender = "";                
// Returns a column class of Object               
DefaultTableModel model;               
JScrollPane scrollpane;               
Object[][] data;               
// Defining Constructor               
registerNow() {                               
setSize(700, 360);                               
setLayout(null);                              
  //Defining Labels                               
title = new JLabel("Registration Form");                                
title.setBounds(60, 7, 200, 30);
  idLabel = new JLabel("ID");
 idLabel.setBounds(30, 50, 60, 30);                                
nameLabel = new JLabel("Name");                                
nameLabel.setBounds(30, 85, 60, 30);
  genderLabel =new JLabel("Gender");                               
genderLabel.setBounds(30, 120, 60, 30);                                
addressLabel = new JLabel("Address");                                
addressLabel.setBounds(30, 155, 60, 30);                                
contactLabel = new JLabel("Contact");                               
contactLabel.setBounds(30, 190, 60, 30);                               
// Defining ID field                                
idField = new JTextField();                                
idField.setBounds(95, 50, 100, 30);                               
idField.addKeyListener(new KeyAdapter() {                                                
public void keyTyped(KeyEvent e) {                                                                 
char c = e.getKeyChar();                                                              
if(!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) ||                                                             
(c == KeyEvent.VK_DELETE))) {                                                                               
e.consume();                                                               

}                                               
}                               

});                               
// Defining Name field                                
nameField = new JTextField();                                
nameField.setBounds(95, 85, 100, 30);

  // Defining Gender Buttons
 male = new JRadioButton("Male");                          
male.setBounds(95, 120, 60, 30);                             
male.addActionListener(new ActionListener() {

  public void actionPerformed(ActionEvent e) {
     gender= "Male";
  }

   });

    female = new  JRadioButton("Female");
 female.setBounds(155,120, 70, 30);                       

female.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
      gender ="Female";
            }

         });
 bg = new ButtonGroup();
       bg.add(male);
      bg.add(female);
     addressField = new JTextField();
    addressField.setBounds(95, 155, 100, 30);
 contactField = new JTextField();  
contactField.setBounds(95, 190, 100, 30);         
contactField.addKeyListener(new KeyAdapter() {
     public void keyTyped(KeyEvent e) {
   char c = e.getKeyChar();                          
if(!((c >= '0') && (c <= '9') || (c ==KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                                          
e.consume();

         }

       }

             });

    //Defining Exit Button
     exitButton = new JButton("Exit");                          
exitButton.setBounds(25, 230, 80, 30);                         
exitButton.addActionListener(this);
    //Defining Register Button
   registerButton = new JButton("Register");      
registerButton.setBounds(110, 230, 100, 30);                      
registerButton.addActionListener(this);
    // fixing all Label,TextField,Button 
       add(title);
       add(idLabel);
      add(nameLabel);
     add(genderLabel);
     add(addressLabel);
      add(contactLabel);
       add(idField);
       add(nameField);
        add(male);
        add(female);
       add(addressField);
      add(contactField);
     add(exitButton);
    add(registerButton);
      //Defining Panel
     panel =new JPanel();
     panel.setLayout(new GridLayout());
     panel.setBounds(250,10, 400, 300);                         
panel.setBorder(BorderFactory.createDashedBorder(Color.blue));
    add(panel);
    
   // Defining Column Names on model 
         model.addColumn("ID");                         
        model.addColumn("Name");                         
        model.addColumn("Gender");                        
        model.addColumn("Address");
         model.addColumn("Contact"); 
 

 

         
 
 
        public static void main(String[] args) { 
           new registerNow(); 

      }

     
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

