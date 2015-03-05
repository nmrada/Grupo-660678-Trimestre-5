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
public class EjemploConexion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        //Mysql
       java.sql.Connection conexion = null;
        
        try {
            String url = "jdbc:mysql://172.16.4.142/pijamax?user=nicolas&password=12345";
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
        } catch (SQLException e) {
            System.err.println(e.toString());
        }finally{
            if(conexion !=null){
            conexion.close();
                System.out.println("Se cerro la conexion de mysql");
            }
        }
        
        //Oracle
        java.sql.Connection conexion2 = null;
        
        try {
            String url2 = "jdbc:oracle:thin:@172.16.4.142:1521:XE";
            String usuario2 = "SENA";
            String contra2 = "Sena2014";
            conexion2 = DriverManager.getConnection(url2,usuario2,contra2);
            System.out.println("Se conecto a oracle");
        } catch (SQLException e) {
            System.err.println(e.toString());
        }finally{
            if(conexion2 !=null){
            conexion2.close();
                System.out.println("Se cerro la conexion de oracle");
            }
        }
        //Postgres
        java.sql.Connection conexion3 = null;
        
        try {
            String url3 = "jdbc:postgresql://localhost:5432/Ejemplo";
            String user3= "postgres";
            String contra3 = "123456789";
            conexion3 = DriverManager.getConnection(url3,user3,contra3);
            System.out.println("Se conecto a postgres");
        } catch (SQLException e) {
            System.err.println(e.toString());
        }finally{
            if(conexion3 !=null){
            conexion3.close();
                System.out.println("Se cerro la conexion de postgres");
            }
        }
    }
    
}
