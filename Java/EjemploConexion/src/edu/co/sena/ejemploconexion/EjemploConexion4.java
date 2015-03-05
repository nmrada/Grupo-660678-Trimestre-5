/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLWarning;

/**
 *
 * @author Nicolas
 */
public class EjemploConexion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost/pijamax?user=root&password=123456789";
        realizarConexion(url);

    }

    public static void realizarConexion(String url) {
        try {
            Connection conexion = DriverManager.getConnection(url);
            System.out.println("Se ha establecido la conexion con: " + url);
            compruebaSQLWarnings(conexion.getWarnings());
            conexion.close();
            System.out.println("Se ha cerrado la conexion con: " + url);
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }

    public static void muestraSQLException(SQLException ex) {
        System.out.println("Se han dado excepciones SQLException\n");
        while (ex != null) {
            System.out.println("SQLState: " + ex.getSQLState() + "\n");
            System.out.println("Mensaje: " + ex.getMessage() + "\n");
            System.out.println("Codigo de Error: " + ex.getErrorCode() + "\n");
            ex = ex.getNextException();
            System.out.println("\n");
        }
    }

    public static void compruebaSQLWarnings(SQLWarning warn) {
        if (warn != null) {
            System.out.println("Aviso(s) producido(s) al conectar");
            while (warn != null) {
                System.out.println("SQLState: " + warn.getSQLState() + "\n");
                System.out.println("Mensaje: " + warn.getMessage() + "\n");
                System.out.println("Codigo de Error: " + warn.getErrorCode() + "\n");
                System.out.println("\n");
                warn = warn.getNextWarning();
            }
        }

    }

}
