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
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ColsutecR
 */
public class InsertarProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        String id = JOptionPane.showInputDialog("Ingrese el Id del Producto a insertar: ");
        String nombre = JOptionPane.showInputDialog("Ingrese el Nombre del Producto a insertar: ");
        String marca = JOptionPane.showInputDialog("Ingrese la Marca del Producto a insertar: ");
        String referencia = JOptionPane.showInputDialog("Ingrese la Referencia del Producto a insertar: ");
        String descripcion = JOptionPane.showInputDialog("Ingrese la Descripcion del Producto a insertar: ");
        String material = JOptionPane.showInputDialog("Ingrese el Material del Producto a insertar: ");
        String color = JOptionPane.showInputDialog("Ingrese el Color del Producto a insertar: ");
        String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad del Producto a insertar: ");
        String activo = JOptionPane.showInputDialog("Ingrese el estado del Producto a insertar: ");
        String precio = JOptionPane.showInputDialog("Ingrese el Precio Unitario del Producto a insertar: ");
        String descuento = JOptionPane.showInputDialog("Ingrese el descuento del Producto a insertar: ");
        String idCategoria = JOptionPane.showInputDialog("Ingrese el ID de la Categoria del Producto a insertar: ");
        String idCatalogo = JOptionPane.showInputDialog("Ingrese el Catalogo del Producto a insertar: ");
        java.sql.Connection conexion = null;
        Statement sentencia = null;

        try {
            String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
            String sql = "insert into tiendaenlinea.producto (idProducto, nombre, marca, referencia, descripcion, material, color,"
                    + "cantidad, activo, precioUnitario, descuento, Categoria_idCategoria,Catalogo_idCatalogo)"
                    + "values ('" + id + "','" + nombre + "','"+ marca + "','" + referencia + "','"
                    + descripcion + "','" + material + "','"+ color + "'," + cantidad + ","+ activo + "," + precio + ","
                    + descuento + "," + idCategoria + ","+ idCatalogo + ");";
            System.out.println(sql);
            int resultado = sentencia.executeUpdate(sql);
            if ( resultado == 1) {
                System.out.println("Se inserto el producto");
            }else{
                System.out.println("No se inserto el producto");
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
