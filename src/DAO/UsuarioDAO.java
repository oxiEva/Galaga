/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;

import Clases.*;

public class UsuarioDAO {
    
    private Connection con = null;
    private String sql = null;
    private PreparedStatement stmt = null;
    
    Utilidad utilidad = null;
    
    /**
     * Añadir usaurio 
     * @param usuario 
     */
    public void add(Usuario usuario){
        utilidad = new Utilidad();
        con = utilidad.conectarMySQL();
        sql = "INSERT INTO Usuario" 
            + "(id, nombre,email, contraseña, idRol,lema, fechaCreacion)"
            + " VALUES (null,?,?,?,?,?,?)";

        try{
            con.setAutoCommit(false);
            
            stmt = con.prepareStatement(sql);

            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getContraseña());
            stmt.setInt(4, usuario.getIdRol());
            stmt.setString(5, usuario.getLema());
            stmt.setTimestamp(6, usuario.getFechaCreacion());
       
            
            stmt.executeUpdate(sql);
            con.commit();

        }catch(SQLException se){
            try{
                con.rollback();
            } catch (SQLException seroll){
            } 
        }
        
    }
    
     /**
     * Obtener usuario por id
     * @param id of the player
     * @return
     */
    public Usuario get(int id) {
        utilidad = new Utilidad();
        con = utilidad.conectarMySQL();
        sql = "SELECT * FROM Usuario "
            + "WHERE id = ?";
       Usuario usuario = null;

        try{
            con.setAutoCommit(false);

            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery(sql);
            con.commit();
            usuario = (Usuario)rs.getObject(1);
            

        } catch(SQLException se){
            try{
                con.rollback();
            } catch (SQLException seroll){
            } 
        }
        return  usuario;
    }


    /**
     * Obtener todos los usuarios
     * @return a list of all the weapons
     */
    public ArrayList<Object> getAll() {
        utilidad = new Utilidad();
        con = utilidad.conectarMySQL();
        sql = "SELECT * FROM Usuario";
        ArrayList<Object> usuarios = new ArrayList<Object>();
        try{
            con.setAutoCommit(false);

            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            while (rs.next()) {
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    usuarios.add(i -1, rs.getObject(i)) ;
                }
            }

            con.commit();
            
        } catch(SQLException se){
            try{
                con.rollback();
            } catch (SQLException seroll){
            } 
        }
        return usuarios;
    }

    /**
     * Borrar usuario sabiendo su id
     * @param id 
     */
    public void delete(int id) {
        utilidad = new Utilidad();
        con = utilidad.conectarMySQL();
        sql = "DELETE * FROM Usuario "
            + "WHERE id = ?";
        try{
            con.setAutoCommit(false);

            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate(sql);
            con.commit();
        } catch(SQLException se){
            try{
                con.rollback();
            } catch (SQLException seroll){
            } 
        }
    }


    /**
     * Modificar datos de un usuario
     * @param id 
     * @param newPlayer new status of the player to update
     */
    public void update(int id, Usuario newPlayer) {
        utilidad = new Utilidad();
        con = utilidad.conectarMySQL();
        sql = "UPDATE Usuario SET " 
            +" nombre=?, email = ?, contraseña = ?, idRol = ?, lema = ?, fechaCreacion = ?"
            +"WHERE id = ?";

        try{
            con.setAutoCommit(false);

            stmt = con.prepareStatement(sql);
            stmt.setString(2, newPlayer.getNombre());
            stmt.setString(3, newPlayer.getEmail());
            stmt.setString(4, newPlayer.getContraseña());
            stmt.setInt(5, newPlayer.getIdRol());
            stmt.setString(6, newPlayer.getLema());
            stmt.setTimestamp(7, newPlayer.getFechaCreacion());
            stmt.setInt(8, id);
            stmt.executeUpdate(sql);
            con.commit();
        }catch(SQLException se){
            try{
                con.rollback();
            } catch (SQLException seroll){
            } 
        }
    }
    
}
