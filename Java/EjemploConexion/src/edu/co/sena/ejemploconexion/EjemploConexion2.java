/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploconexion;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class EjemploConexion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/pijamax?user=root&password=123456789";
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto");
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e.toString());
        }finally{
            if(conexion !=null){
            conexion.close();
                System.out.println("Se cerro la conexion");
            }
        }
    }
    
}
