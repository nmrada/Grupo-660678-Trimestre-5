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
import javax.swing.JOptionPane;

/**
 *
 * @author ColsutecR
 */
public class EliminarCarrito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        String id = JOptionPane.showInputDialog("Ingrese el Id del Carrito a que va a borrar: ");
        java.sql.Connection conexion = null;
        Statement sentencia = null;

        try {
            String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
            String sql2 = "DELETE FROM tiendaenlinea.carritodecompras WHERE idCarritoDeCompras =" + id + ";";
            System.out.println(sql2);
            int resultado = sentencia.executeUpdate(sql2);
            if (resultado == 1) {
                System.out.println("Se Borro el carrito");
            } else {
                System.out.println("No se borro el carrito");
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el statement de mysql");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion de mysql");
            }
        }
    }

}
