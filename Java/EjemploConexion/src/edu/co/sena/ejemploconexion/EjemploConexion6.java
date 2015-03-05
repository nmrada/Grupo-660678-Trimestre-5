/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploconexion;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ColsutecR
 */
public class EjemploConexion6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        try {
            String url = "jdbc:mysql://172.16.4.142/pijamax?user=nicolas&password=12345";
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.createStatement();
            rs = sentencia.executeQuery("SELECT * from pijamax.categorias where id_categoria = 145");
            System.out.println("numeros de registros: " + sentencia.getMaxRows());
            if (!rs.wasNull()) {
                while (rs.next() == true) {
                    System.out.println("Id Categoria: " + rs.getString("id_categoria"));
                    System.out.println("Nombre Categoria: " + rs.getString("nombre_categoria") + "\n");
                }
            } else {
                System.out.println("No hay datos");
            }

        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el statement de mysql");
            }
            if (rs != null) {
                rs.close();
                System.out.println("Se cerro el rs");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion de mysql");
            }
        }
    }

}
