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
public class ConsultarItemFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        String idFactura = JOptionPane.showInputDialog("Ingrese el id de la Factura a Consultar");
        try {
            String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.createStatement();
            String sql = "select producto.nombre,  item.cantidad, item.costoUnitario, item.costoTotal "
                    + "from tiendaenlinea.factura, tiendaenlinea.pedido, tiendaenlinea.item, tiendaenlinea.producto "
                    + "where factura.idFactura = pedido.Factura_idFactura and pedido.Factura_idFactura = item.Pedido_Factura_idFactura and "
                    + "item.Producto_idProducto = producto.idProducto and factura.idFactura = " + idFactura + ";";
            System.out.println(sql + "\n");
            rs = sentencia.executeQuery(sql);
            if (rs.next() == true) {
                rs.beforeFirst();
//                System.out.println("Nombre Producto\t\t\tCantidad   Costo Unitario   Costo Total");
//                while (rs.next() == true) {
//                    System.out.print(rs.getString("producto.nombre") + "\t");
//                    System.out.print("    " + rs.getString("item.cantidad") + "\t");
//                    System.out.print("      " + rs.getString("item.costoUnitario") + "\t");
//                    System.out.print("      " + rs.getString("item.costoTotal") + "\n");
//                }
                while (rs.next() == true) {
                    System.out.println("Nombre: " + rs.getString("producto.nombre"));
                    System.out.println("Cantidad   Costo Unitario   Costo Total");
                    System.out.print("    " + rs.getString("item.cantidad") + "\t");
                    System.out.print("      " + rs.getString("item.costoUnitario") + "\t");
                    System.out.print("      " + rs.getString("item.costoTotal") + "\n");
                }
            } else {
                System.out.println("El id de Factura no existe");
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
