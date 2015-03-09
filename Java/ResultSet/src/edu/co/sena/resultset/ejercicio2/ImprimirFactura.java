/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.resultset.ejercicio2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ColsutecR
 */
public class ImprimirFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        double totalFactura = 0;
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
            List<ItemTO> listaItems = new ArrayList<>();
            if (rs.next() == true) {
                if (!rs.isFirst()) {
                    rs.beforeFirst();
                }
                rs.absolute(2);
                while (rs.next() == true) {
                    ItemTO itemT = new ItemTO();
                    itemT.setNombre(rs.getString("producto.nombre"));
                    itemT.setCantidad(rs.getInt("item.cantidad"));
                    itemT.setCostoUnitario(rs.getDouble("item.costoUnitario"));
                    itemT.setCostoTotal(rs.getDouble("item.costoTotal"));
                    listaItems.add(itemT);
                }
                int posicion = rs.findColumn("item.costoUnitario");
                System.out.println("El campo costo Unitario esta en la posicion "+posicion);
//                rs.isFirst();
                rs.last();
                System.out.println("La consulta tiene "+rs.getMetaData().getColumnCount()+" registros");
            } else {
                System.out.println("El id de Factura no existe");
            }
            for (ItemTO item : listaItems) {
                System.out.println(item.toString());
                totalFactura = totalFactura + item.getCostoTotal();
            }
            System.out.println("Total de la Factura " + totalFactura);
            Double tot = (Double) totalFactura;
            System.out.println(tot.toString());

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
