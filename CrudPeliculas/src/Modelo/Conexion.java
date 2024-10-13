
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

// Ruben Dario Durango Gomez
public class Conexion {
    
    String url = "jdbc:mysql://localhost:3306/peliculas";
    String user ="root", pass ="admin";
    Connection con;
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
    
    
    
    
}
