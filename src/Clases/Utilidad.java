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
<<<<<<< HEAD
    public String port = "3307";
=======
    public String port = "3306";
>>>>>>> 5b81b6d934a277642c960f9c354f4328e084deb8

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

    // Nombre de usuario
    public String username = "root";

    // Clave de usuario
<<<<<<< HEAD
    public String password = "oxiev";
=======
    public String password = "";
>>>>>>> 5b81b6d934a277642c960f9c354f4328e084deb8
    
    
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
