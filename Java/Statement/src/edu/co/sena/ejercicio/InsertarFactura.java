/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class InsertarFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        String total = JOptionPane.showInputDialog("Ingrese el Total de la Factura a insertar: ");
        String cuentaTipoDoc = JOptionPane.showInputDialog("Ingrese el Tipo de documento de la cuenta de la factura a insertar: ");
        String cuentaNumeroDoc = JOptionPane.showInputDialog("Ingrese el Número de documento de la cuenta de la factura a insertar: ");
        String fecha = JOptionPane.showInputDialog("Ingrese la Fecha y Hora de la factura a insertar: ");

        java.sql.Connection conexion = null;
        Statement sentencia = null;

        try {
            String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=azul123456";
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
            String sql = "INSERT INTO tiendaenlinea.factura "
                    + "(fecha, total, Cuenta_tipoDocumento, Cuenta_numeroDocumento) "
                    + "VALUES "
                    + "('" + fecha + "'," + total + ", "
                    + " '" + cuentaTipoDoc + "','" + cuentaNumeroDoc + "');";
            System.out.println(sql);
            int resultado = sentencia.executeUpdate(sql);
            if (resultado == 1) {
                System.out.println("Se inserto el factura");
            } else {
                System.out.println("No se inserto el factura");
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
