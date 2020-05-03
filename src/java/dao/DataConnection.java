/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//patron singleton para conexxion a base de datos
public class DataConnection {
    
    //1. Atributo de clase del tipo clase
    private static DataConnection dc;
    private Connection cnn;

    //2. constructor privado
    private DataConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        
        cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webmvc", "root","root");
    }
    
    //3. Metodo de clase tipo de la clase
    public static DataConnection createConnetion() throws ClassNotFoundException, SQLException {
        
        //4. condicion para controlar el nuemro de las intrucciones
        if (dc == null) {
            dc = new DataConnection();
        }
        
        return dc;
        
    }
    
    //5. metodo para la conexion con la base de datos
    public Connection getConnection() {
        
        return cnn;
    }
    
}
