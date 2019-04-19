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
public class Usuario {
    
    private int id;
    private String nombre;
    private String contraseña;
    private String lema;
    private String rol;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    

    public String getLema() {
        return lema;
    }
    
    public void setLema(String lema){
        this.lema = lema; 
    }
    
    
    
    
}


/*class UsuarioCreator{
        public static void main(String[] args) {
            Usuario usuario = new Usuario();
        }
    }*/