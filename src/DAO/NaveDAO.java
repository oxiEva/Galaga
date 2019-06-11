/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Nave;
import Clases.HabilidadEspecial;
import Clases.Utilidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author eva
 */
public class NaveDAO {
    
    private Connection con = null;
    private String sql = null;
    private PreparedStatement stmt = null;
    
    Utilidad utilidad = null;
    
    /**
     * Añadir Nave
     * @param Nave 
     */
    public void add(Nave Nave){
        utilidad = new Utilidad();
        con = utilidad.conectarMySQL();
        sql = "INSERT INTO Nave" 
            + "(id, nombre, raza, subraza, medioNatural, imagen, ataque, defensa, disponibilidad, habilidadEspecial)"
            + " VALUES (null,?,?,?,?,?,?,?, ?)";

        try{
            con.setAutoCommit(false);
            
            stmt = con.prepareStatement(sql);

            stmt.setString(1, Nave.getNombre());
            stmt.setString(2, Nave.getRaza());
            stmt.setString(3, Nave.getSubraza());
            stmt.setString(4, Nave.getMedioNatural());
            stmt.setString(5, Nave.getImagen());
            stmt.setInt(6, Nave.getAtaque());
            stmt.setInt(7, Nave.getDefensa());
            stmt.setBoolean(8, true);
            
       
            
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
    public Nave get(int id) {
        utilidad = new Utilidad();
        con = utilidad.conectarMySQL();
        sql = "SELECT * FROM Nave "
            + "WHERE id = ?";
       Nave Nave = null;

        try{
            con.setAutoCommit(false);

            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery(sql);
            con.commit();
            Nave = (Nave)rs.getObject(1);
            

        } catch(SQLException se){
            try{
                con.rollback();
            } catch (SQLException seroll){
            } 
        }
        return  Nave;
    }


    /**
     * Obtener todas las Naves
     * @return a list of all the weapons
     */
    public ArrayList<Object> getAll() {
        utilidad = new Utilidad();
        con = utilidad.conectarMySQL();
        sql = "SELECT * FROM Nave";
        ArrayList<Object> Naves = new ArrayList<Object>();
        try{
            con.setAutoCommit(false);

            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            while (rs.next()) {
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    Naves.add(i -1, rs.getObject(i)) ;
                }
            }

            con.commit();
            
        } catch(SQLException se){
            try{
                con.rollback();
            } catch (SQLException seroll){
            } 
        }
        return Naves;
    }

    /**
     * Borrar Nave sabiendo su id
     * @param id 
     */
    public void delete(int id) {
        utilidad = new Utilidad();
        con = utilidad.conectarMySQL();
        sql = "DELETE * FROM Nave "
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
