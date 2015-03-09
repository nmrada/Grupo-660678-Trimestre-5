/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import edu.co.sena.ejercicio.dto.ProductoDTO;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ColsutecR
 */
public class ProductoAPP {

    /**
     * @param args the command line arguments
     */
    private Connection conexion = null;
    private PreparedStatement sentencia = null;
    private ResultSet resultado = null;
    String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";

    public static void main(String[] args) throws SQLException {
        //Inserta el Producto

        ProductoAPP app = new ProductoAPP();
        ProductoDTO producto = new ProductoDTO();
        producto.setIdProducto("69");
//        producto.setNombre("Bateria Acustica");
//        producto.setMarca("Fander");
//        producto.setReferencia("696969");
//        producto.setDescripcion("Bateria Marca Fander");
//        producto.setMaterial("Caoba");
//        producto.setColor("Negro");
//        producto.setCantidad(20);
//        producto.setActivo(new Short("1"));
//        producto.setPrecioUnitario(300000);
//        producto.setDescuento(0);
//        producto.setCategoria_idCategoria(7);
//        producto.setCategoria_idCatalogo(1);
//        app.insertarProducto(producto);

        // Actualiza el Producto
//        producto.setNombre("Saxofon De Cobre");
//        producto.setMarca("Yamaha");
//        producto.setReferencia("qwerty");
//        producto.setDescripcion("Saxofon de cobre negro");
//        producto.setMaterial("Cobre");
//        producto.setColor("Negro");
//        producto.setCantidad(10);
//        producto.setActivo(new Short("1"));
//        producto.setPrecioUnitario(100000);
//        producto.setDescuento(0);
//        producto.setCategoria_idCategoria(6);
//        producto.setCategoria_idCatalogo(1);
//        app.actualizarProducto(producto);
        //Eliminar Producto
//        app.eliminarProducto(producto);
        //Mostrar todos los Productos
//        List<ProductoDTO> lista = app.buscarProductos();
//        for (ProductoDTO prod : lista) {
//            System.out.println(prod.toString());
//        }

        // Mostrar un solo Producto
        ProductoDTO productoConsulta = app.buscarUnSoloProducto(producto);
        System.out.println(productoConsulta.toString());
    }

    public void insertarProducto(ProductoDTO producto) throws SQLException {
        try {

            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a la base de datos");
            String sqlInsertar = "INSERT INTO tiendaenlinea.producto "
                    + "(idProducto, nombre, marca, referencia, descripcion, "
                    + "material, color, cantidad, activo, precioUnitario, "
                    + "descuento, Categoria_idCategoria, Catalogo_idCatalogo) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
            sentencia = conexion.prepareStatement(sqlInsertar);
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

            System.out.println("Sentencia ejecutada " + sqlInsertar);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("Se inserto el producto " + resultado);
            } else {
                System.out.println("No se inserto el producto");
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el Statement");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la Conexión");
            }

        }
    }

    public void actualizarProducto(ProductoDTO producto) throws SQLException {
        try {

            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a la base de datos");
            String sqlActualizar = "UPDATE tiendaenlinea.producto "
                    + "SET "
                    + "nombre = ?, "
                    + "marca = ?, "
                    + "referencia = ?, "
                    + "descripcion = ?, "
                    + "material = ?, "
                    + "color = ?, "
                    + "cantidad = ?, "
                    + "activo = ?, "
                    + "precioUnitario = ?, "
                    + "descuento = ?, "
                    + "Categoria_idCategoria = ?, "
                    + "Catalogo_idCatalogo = ? "
                    + "WHERE idProducto = ?;";
            sentencia = conexion.prepareStatement(sqlActualizar);

            sentencia.setString(1, producto.getNombre());
            sentencia.setString(2, producto.getMarca());
            sentencia.setString(3, producto.getReferencia());
            sentencia.setString(4, producto.getDescripcion());
            sentencia.setString(5, producto.getMaterial());
            sentencia.setString(6, producto.getColor());
            sentencia.setInt(7, producto.getCantidad());
            sentencia.setShort(8, producto.getActivo());
            sentencia.setDouble(9, producto.getPrecioUnitario());
            sentencia.setDouble(10, producto.getDescuento());
            sentencia.setInt(11, producto.getCategoria_idCategoria());
            sentencia.setInt(12, producto.getCategoria_idCatalogo());
            sentencia.setString(13, producto.getIdProducto());

            System.out.println("Sentencia ejecutada " + sqlActualizar);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("Se actualizo el producto " + resultado);
            } else {
                System.out.println("No se actualizo el producto");
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el Statement");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la Conexión");
            }

        }
    }

    public void eliminarProducto(ProductoDTO producto) throws SQLException {
        try {

            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a la base de datos");
            String sqlEliminar = "delete from tiendaenlinea.producto where idProducto = ?;";
            sentencia = conexion.prepareStatement(sqlEliminar);
            sentencia.setString(1, producto.getIdProducto());

            System.out.println("Sentencia ejecutada " + sqlEliminar);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("Se elimino el producto " + resultado);
            } else {
                System.out.println("No se elimino el producto");
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el Statement");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la Conexión");
            }

        }
    }

    public List<ProductoDTO> buscarProductos() throws SQLException {
        List<ProductoDTO> lista = new ArrayList<>();
        ResultSet rs = null;
        try {
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a la base de datos");
            String sqlBuscar = "select * from tiendaenlinea.producto";
            sentencia = conexion.prepareStatement(sqlBuscar);
            rs = sentencia.executeQuery(sqlBuscar);
            System.out.println("Sentencia ejecutada " + sqlBuscar);
            if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {
                    ProductoDTO producto = new ProductoDTO();
                    producto.setIdProducto(rs.getString("idProducto"));
                    producto.setNombre(rs.getString("nombre"));
                    producto.setMarca(rs.getString("marca"));
                    producto.setReferencia(rs.getString("referencia"));
                    producto.setDescripcion(rs.getString("descripcion"));
                    producto.setMaterial(rs.getString("material"));
                    producto.setColor(rs.getString("color"));
                    producto.setCantidad(rs.getInt("cantidad"));
                    producto.setActivo(rs.getShort("activo"));
                    producto.setPrecioUnitario(rs.getDouble("precioUnitario"));
                    producto.setDescuento(rs.getDouble("descuento"));
                    producto.setCategoria_idCategoria(rs.getInt("Categoria_idCategoria"));
                    producto.setCategoria_idCatalogo(rs.getInt("Catalogo_idCatalogo"));
                    lista.add(producto);
                }
            } else {
                System.out.println("No hay productos");
            }

        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            if (rs != null) {
                rs.close();
                System.out.println("Se cerro el ResultSet");
            }
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el Statement");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la Conexión");
            }

        }
        return lista;
    }

    public ProductoDTO buscarUnSoloProducto(ProductoDTO producto) throws SQLException {
        ProductoDTO productoTemporal = new ProductoDTO();
        ResultSet rs = null;
        try {
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a la base de datos");
            String sqlBuscar = "select * from tiendaenlinea.producto where idProducto = ? ;";
            sentencia = conexion.prepareStatement(sqlBuscar);
            sentencia.setString(1, producto.getIdProducto());
            rs = sentencia.executeQuery();
            System.out.println("Sentencia ejecutada " + sqlBuscar);
            if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {
                    productoTemporal.setIdProducto(rs.getString("idProducto"));
                    productoTemporal.setNombre(rs.getString("nombre"));
                    productoTemporal.setMarca(rs.getString("marca"));
                    productoTemporal.setReferencia(rs.getString("referencia"));
                    productoTemporal.setDescripcion(rs.getString("descripcion"));
                    productoTemporal.setMaterial(rs.getString("material"));
                    productoTemporal.setColor(rs.getString("color"));
                    productoTemporal.setCantidad(rs.getInt("cantidad"));
                    productoTemporal.setActivo(rs.getShort("activo"));
                    productoTemporal.setPrecioUnitario(rs.getDouble("precioUnitario"));
                    productoTemporal.setDescuento(rs.getDouble("descuento"));
                    productoTemporal.setCategoria_idCategoria(rs.getInt("Categoria_idCategoria"));
                    productoTemporal.setCategoria_idCatalogo(rs.getInt("Catalogo_idCatalogo"));
                }
            } else {
                System.out.println("No existe el  producto");
            }

        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            if (rs != null) {
                rs.close();
                System.out.println("Se cerro el ResultSet");
            }
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el Statement");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la Conexión");
            }

        }
        return productoTemporal;
    }

}
