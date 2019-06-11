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
import java.sql.SQLException;

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
    public String port = "3307";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

    // Nombre de usuario
    public String username = "root";

    // Clave de usuario
    public String password = "oxiev";
    
    
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
}
