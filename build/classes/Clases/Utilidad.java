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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Utilidad {

    public Utilidad() {
    }
    
     // Librería de MySQL
    public String driver = "com.mysql.jdbc.Driver";

    // Nombre de la base de datos
    public String database = "galaga";

    // Host
    public String hostname = "localhost";

    // Puerto
    public String port = "3306";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

    // Nombre de usuario
    public String username = "root";

    // Clave de usuario
    public String password = "";
    
    
    public Connection conectarMySQL() {
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            
            throw new RuntimeException(e);
            
            
        }

        return conn;
    }
    
    public ArrayList<String> getArma() throws SQLException{
        ArrayList<String> armas = new ArrayList<String>();
        Statement stmt;
        
        Connection con = this.conectarMySQL();
        String query = "SELECT nombreArma FROM Arma;";
        
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            armas.add(rs.getString("nombreArma"));
        }
        return armas;
            
    }
        
    public ArrayList<String> getEquipo() throws SQLException{
        ArrayList<String> equipo = new ArrayList<String>();
        Statement stmt;
        
        Connection con = this.conectarMySQL();
        
        String query = "SELECT nivel, experiencia, victorias FROM Equipo Where idJugador=@idjugador;";
        
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            equipo.add(rs.getString("nivel"));
            equipo.add(rs.getString("experiencia"));
            equipo.add(rs.getString("victorias"));
        }
        return equipo;
            
    }

    public ArrayList<String> getEcudo() throws SQLException{
        ArrayList<String> escudo = new ArrayList<String>();
        Statement stmt;
        
        Connection con = this.conectarMySQL();
        
        String query = "SELECT defensa FROM Escudo;";
        
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            escudo.add(rs.getString("defensa"));
        }
        return escudo;
            
    }
    
    public ArrayList<String> getJugador() throws SQLException{
        ArrayList<String> jugador = new ArrayList<String>();
        Statement stmt;
        
        Connection con = this.conectarMySQL();
        
        String query = "SELECT puntuacion, experiencia FROM Jugador;";
        
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            jugador.add(rs.getString("puntuacion"));
            jugador.add(rs.getString("experiencia"));
        }
        return jugador;            
    }
    
    public ArrayList<String> getRaza() throws SQLException{
        ArrayList<String> raza = new ArrayList<String>();
        Statement stmt;
        
        Connection con = this.conectarMySQL();
                String query = "SELECT raza FROM Raza;";
        
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            raza.add(rs.getString("raza"));
        }
        return raza;            
    }

    public ArrayList<String> getSubraza() throws SQLException{
        ArrayList<String> subraza = new ArrayList<String>();
        Statement stmt;
        
        Connection con = this.conectarMySQL();
                String query = "SELECT raza FROM Subraza;";
        
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            subraza.add(rs.getString("raza"));
        }
        return subraza;            
    }
    
    public ArrayList<String> getUsuario() throws SQLException{
        ArrayList<String> usuario = new ArrayList<String>();
        Statement stmt;
        
        Connection con = this.conectarMySQL();
                String query = "SELECT nombre FROM Usuario;";
        
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            usuario.add(rs.getString("nombre"));
        }
        return usuario;            
    }
    
    public ArrayList<String> getUsuario() throws SQLException{
        ArrayList<String> usuario = new ArrayList<String>();
        Statement stmt;
        
        Connection con = this.conectarMySQL();
                String query = "INSERT INTO Usuario nombre,email,contraseña,fechaNacimiento,fechaRegistro,lema;";
        
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            usuario.add(rs.getString("nombre"));
            usuario.add(rs.getString("email"));
            usuario.add(rs.getString("contraseña"));
            usuario.add(rs.getString("fechaNacimiento"));
            usuario.add(rs.getString("fechaRegistro"));
            usuario.add(rs.getString("lema"));
        }
        return usuario;            
    }
    
    public ArrayList<String> getHabilidadespecial() throws SQLException{
        ArrayList<String> habilidadespecial = new ArrayList<String>();
        Statement stmt;
        
        Connection con = this.conectarMySQL();
                String query = "SELECT nombreHabEsp FROM HabilidadEspecial;";
        
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            getHabilidadespecial.add(rs.getString("nombre"));
            getHabilidadespecial.add(rs.getString("email"));
            getHabilidadespecial.add(rs.getString("contraseña"));
            getHabilidadespecial.add(rs.getString("fechaNacimiento"));
            getHabilidadespecial.add(rs.getString("lema"));
        }
        return getHabilidadespecial;            
    }
    
}
