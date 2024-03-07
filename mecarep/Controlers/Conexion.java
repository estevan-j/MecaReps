package mecarep.Controlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {
    
    protected Connection conex;
    String url = "jdbc:sqlserver://localhost:1433;databaseName=TallerQuito;integratedSecurity=false;encrypt=false;trustServerCertificate=true;"
            +"loginTimeout = 10;";// define el limite de tiempo de conexión
    String passwd ="######"; //contraseña que maneja el motor de SQL
    String username ="###1234"; //usuario que maneja el motor de SQL

    
    public void conectar(){
        try{
            // Cargar el controlador JDBC
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conex = DriverManager.getConnection(url,username, passwd);
            //System.out.println("Conexión Valida");
        } catch(SQLException e){
            System.out.println("Conexión Invalida "+e.getMessage());
        }
    }
    
    public void cerrarConexión(){
        try{
            conex.close();
            //System.out.println("Conexión Cerrada");
        } catch (SQLException e){
            System.out.println("Conexión No Cerrada");
        }
    }    

}

