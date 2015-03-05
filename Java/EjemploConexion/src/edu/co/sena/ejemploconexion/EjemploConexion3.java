/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author ColsutecR
 */
public class EjemploConexion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Connection conexion = null;
        Properties propiedades = new Properties();
        propiedades.setProperty("user","root");
        propiedades.setProperty("password","123456789");
        
        try {
            String url = "jdbc:mysql://localhost/pijamax";
            conexion = DriverManager.getConnection(url,propiedades);
            System.out.println("Se conecto");
        } catch (SQLException e) {
            System.err.println(e.toString());
        }finally{
            if(conexion !=null){
            conexion.close();
                System.out.println("Se cerro la conexion");
            }
        }
        
    }
    
}
