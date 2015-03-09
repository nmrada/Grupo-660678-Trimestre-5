/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio;

import edu.co.sena.ejercicio.dto.ProductoDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class ProductoAPP {

    /**
     * @param args the command line arguments
     */
    private Connection conexion = null;
    private CallableStatement sentencia = null;
    String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";

    public static void main(String[] args) throws SQLException {
        ProductoAPP app = new ProductoAPP();
        ProductoDTO producto = new ProductoDTO();
        producto.setIdProducto("69");
        producto.setNombre("Saxofon de Cobre");
        producto.setMarca("Yamaha");
        producto.setMaterial("Cobre");
        producto.setDescripcion("Saxofon de cobre, color negro");
        producto.setColor("Negro");
        producto.setReferencia("8523");
        producto.setCantidad(5);
        producto.setActivo(new Short("1"));
        producto.setPrecioUnitario(600000);
        producto.setDescuento(0);
        producto.setCategoria_idCategoria(7);
        producto.setCategoria_idCatalogo(1);
        app.insertarProducto(producto);
    }

    public void insertarProducto(ProductoDTO producto) throws SQLException {
        try {
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a la base de Datos");
            String sql = "CALL tiendaenlinea.insertarProducto(?,?,?,?,?,?,?,?,?,?,?,?,?);";
            sentencia = conexion.prepareCall(sql);
            sentencia.setString(1, producto.getIdProducto());
            sentencia.setString(2, producto.getNombre());
            sentencia.setString(3, producto.getMarca());
            sentencia.setString(4, producto.getReferencia());
            sentencia.setString(5, producto.getDescripcion());
            sentencia.setString(6, producto.getMaterial());
            sentencia.setString(7, producto.getColor());
            sentencia.setInt(8, producto.getCantidad());
            sentencia.setShort(9, producto.getActivo());
            sentencia.setDouble(10, producto.getPrecioUnitario());
            sentencia.setDouble(11, producto.getDescuento());
            sentencia.setInt(12, producto.getCategoria_idCategoria());
            sentencia.setInt(13, producto.getCategoria_idCatalogo());
            System.out.println("Sentencia ejecutada " + sql);            
            sentencia.execute();
        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el Callable Statement");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la Conexión");
            }

        }
    }
    
}
