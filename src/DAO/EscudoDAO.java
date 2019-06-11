/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Escudo;
import Clases.Utilidad;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
/**
 *
 * @author eva
 */
public class EscudoDAO {


    private Connection con = null;
    private String sql = null;
    private PreparedStatement stmt = null;
     Utilidad utilidad = null;
    
    /**
     * Añadir Escudo
     * @param escudo
     */
    public void add(Escudo escudo){
        
        utilidad = new Utilidad();
        con = utilidad.conectarMySQL();
        sql = "INSERT INTO Escudo" 
            + "(idEscudo, defensa,nombreEscudo)"
            + " VALUES (null,?,?)";

        try{
            con.setAutoCommit(false);
            
            stmt = con.prepareStatement(sql);
            

            stmt.setInt(1, escudo.getDefensa());
            stmt.setString(2,escudo.getNombreEscudo());
       
            
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
     * Obtener Nave por id
     * @param id 
     * @return
     */
    public Escudo get(int id) {
        utilidad = new Utilidad();
        con = utilidad.conectarMySQL();
        sql = "SELECT * FROM Escudo "
            + "WHERE idEscudo = ?";
       Escudo usuario = null;

        try{
            con.setAutoCommit(false);

            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery(sql);
            con.commit();
            usuario = (Escudo)rs.getObject(1);
            

        } catch(SQLException se){
            try{
                con.rollback();
            } catch (SQLException seroll){
            } 
        }
        return  usuario;
    }


    /**
     * Obtener todos los escudos
     * @return a list of all the weapons
     */
    public ArrayList<Object> getAll() {
        utilidad = new Utilidad();
        con = utilidad.conectarMySQL();
        sql = "SELECT * FROM Escudo ";
        ArrayList<Object> escudos = new ArrayList<Object>();
        try{
            con.setAutoCommit(false);

            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            while (rs.next()) {
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    escudos.add(i -1, rs.getObject(i)) ;
                }
            }

            con.commit();
            
        } catch(SQLException se){
            try{
                con.rollback();
            } catch (SQLException seroll){
            } 
        }
        return escudos;
    }

    /**
     * Borrar escudo sabiendo su id
     * @param id 
     */
    public void delete(int id) {
        utilidad = new Utilidad();
        con = utilidad.conectarMySQL();
        sql = "DELETE * FROM Escudo  "
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




}
