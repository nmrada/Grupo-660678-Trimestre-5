/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.resultset;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        String entrada = JOptionPane.showInputDialog("Para consultar Facturas digite 1\nPara consultar Cuentas digite 2");
        int opcion = Integer.parseInt(entrada);
        switch (opcion) {
            case 1: {
                String idFactura = JOptionPane.showInputDialog("Ingrese el número de la Factura a Consultar");
                busquedaFactura(idFactura);
                break;
            }
            case 2: {
                String tipoDocumento = JOptionPane.showInputDialog("Ingrese el tipo de Documento de la Cuenta a Consultar");
                String numeroDocumento = JOptionPane.showInputDialog("Ingrese el número de Documento de la Cuenta a Consultar");
                busquedaCuenta(tipoDocumento, numeroDocumento);
                break;
            }
            default: {
                System.out.println("Opción no válida, digite 1 o 2");
            }
        }
    }

    public static void busquedaCuenta(String tipoDocumento, String numeroDocumento) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        try {
            String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.createStatement();
            String sql = "SELECT * FROM tiendaenlinea.cuenta where tipoDocumento = '" + tipoDocumento + "' AND "
                    + "numeroDocumento = '" + numeroDocumento + "';";
            System.out.println(sql + "\n");
            rs = sentencia.executeQuery(sql);
            if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {
                    Cuenta cuentaT = new Cuenta();
                    cuentaT.setTipoDocumento(rs.getString("tipoDocumento"));
                    cuentaT.setNumeroDocumento(rs.getString("numeroDocumento"));
                    cuentaT.setPrimerNombre(rs.getString("primerNombre"));
                    cuentaT.setSegundoNombre(rs.getString("segundoNombre"));
                    cuentaT.setPrimerApellido(rs.getString("primerApellido"));
                    cuentaT.setSegundoApellido(rs.getString("segundoApellido"));
                    cuentaT.setContrasena(rs.getString("contrasena"));
                    cuentaT.setEmail(rs.getString("email"));
                    cuentaT.setUsuario_idUsuario(rs.getString("Usuario_idUsuario"));
                    System.out.println(cuentaT.toString());
                }
            } else {
                System.out.println("Esta Cuenta no existe");
            }

        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("\nSe cerro el statement de mysql");
            }
            if (rs != null) {
                rs.close();
                System.out.println("Se cerro el resultset");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion de mysql");
            }
        }
    }

    public static void busquedaFactura(String idFactura) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        try {
            String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.createStatement();
            String sql = "SELECT * FROM tiendaenlinea.factura where idFactura = " + idFactura + "";
            System.out.println(sql + "\n");
            rs = sentencia.executeQuery(sql);
            if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {
                    Factura facturaT = new Factura();
                    facturaT.setIdFactura(rs.getInt("idFactura"));
                    facturaT.setFecha(rs.getDate("fecha"));
                    facturaT.setHora(rs.getTime("fecha"));
                    facturaT.setTotal(rs.getFloat("total"));
                    facturaT.setCuentaTipoDocumento(rs.getString("Cuenta_tipoDocumento"));
                    facturaT.setCuentaNumeroDocumento(rs.getString("Cuenta_numeroDocumento"));
                    System.out.println(facturaT.toString());
                }
            } else {
                System.out.println("Esta Factura no existe");
            }

        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("\nSe cerro el statement de mysql");
            }
            if (rs != null) {
                rs.close();
                System.out.println("Se cerro el resultset");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion de mysql");
            }
        }
    }
}
