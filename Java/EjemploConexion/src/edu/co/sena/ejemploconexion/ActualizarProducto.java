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
public class ActualizarProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        String id = JOptionPane.showInputDialog("Ingrese el Id del Producto a que va a actualizar: ");
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;

        try {
            String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.createStatement();
            String sql = "SELECT * FROM tiendaenlinea.producto where idProducto ='" + id + "';";
            rs = sentencia.executeQuery(sql);
            if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {
                    System.out.println("\nId Producto: " + rs.getString("idProducto"));
                    System.out.println("Nombre Producto: " + rs.getString("nombre"));
                    System.out.println("Marca Producto: " + rs.getString("marca"));
                    System.out.println("Referencia Producto: " + rs.getString("referencia"));
                    System.out.println("Descripción Producto: " + rs.getString("descripcion"));
                    System.out.println("Material Producto: " + rs.getString("material"));
                    System.out.println("Color Producto: " + rs.getString("color"));
                    System.out.println("Cantidad Producto: " + rs.getString("cantidad"));
                    System.out.println("Producto Activo: " + rs.getString("activo"));
                    System.out.println("Precio Unitario Producto: " + rs.getString("precioUnitario"));
                    System.out.println("Descuento Producto: " + rs.getString("descuento"));
                    System.out.println("Categoria Producto: " + rs.getString("Categoria_idCategoria"));
                    System.out.println("Catalogo Producto: " + rs.getString("Catalogo_idCatalogo") + "\n");
                }
                sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
                String nombre = JOptionPane.showInputDialog("Ingrese el Nombre del Producto a modificar: ");
                String marca = JOptionPane.showInputDialog("Ingrese la Marca del Producto a modificar: ");
                String referencia = JOptionPane.showInputDialog("Ingrese la Referencia del Producto a modificar: ");
                String descripcion = JOptionPane.showInputDialog("Ingrese la Descripcion del Producto a modificar: ");
                String material = JOptionPane.showInputDialog("Ingrese el Material del Producto a modificar: ");
                String color = JOptionPane.showInputDialog("Ingrese el Color del Producto a modificar: ");
                String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad del Producto a modificar: ");
                String activo = JOptionPane.showInputDialog("Ingrese el estado del Producto a modificar: ");
                String precio = JOptionPane.showInputDialog("Ingrese el Precio Unitario del Producto a modificar: ");
                String descuento = JOptionPane.showInputDialog("Ingrese el descuento del Producto a modificar: ");
                String idCategoria = JOptionPane.showInputDialog("Ingrese el ID de la Categoria del Producto a modificar: ");
                String idCatalogo = JOptionPane.showInputDialog("Ingrese el Catalogo del Producto a modificar: ");

                String sql2 = "update tiendaenlinea.producto set nombre ='" + nombre + "', marca='" + marca + "',"
                        + "referencia ='" + referencia + "', descripcion='" + descripcion + "', material='" + material + "', "
                        + "color='" + color + "',cantidad = " + cantidad + ", activo = " + activo + ", "
                        + "precioUnitario = " + precio + ", descuento = " + descuento + ","
                        + " Categoria_idCategoria = " + idCategoria + ",Catalogo_idCatalogo= " + idCatalogo
                        + " where idProducto='" + id + "';";
                System.out.println(sql2);
                int resultado = sentencia.executeUpdate(sql2);
                if (resultado == 1) {
                    System.out.println("Se Actualizo el producto");
                } else {
                    System.out.println("No se Actualizo el producto");
                }
            } else {
                System.out.println("El producto no existe");
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
                System.out.println("Se cerro el resultset");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion de mysql");
            }
        }
    }

}
