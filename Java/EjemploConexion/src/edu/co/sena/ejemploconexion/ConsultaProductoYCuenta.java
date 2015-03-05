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
import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class ConsultaProductoYCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        System.out.println("Para consultar Productos digite 1 \nPara consultar Cuentas digite 2");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1: {
                System.out.println("Digite el ID de Producto a consultar");
                String idProducto = teclado.next();
                busquedaProducto(idProducto);
                break;
            }
            case 2: {
                System.out.println("Digite el Tipo de Documento de la Cuenta a consultar");
                String tipoDocumento = teclado.next();
                System.out.println("Digite el Número de Documento de la Cuenta a consultar");
                String numeroDocumento = teclado.next();
                busquedaCuenta(tipoDocumento, numeroDocumento);
                break;
            }
            default: {
                System.out.println("Opción no válida, digite 1 o 2");
            }
        }
    }

    public static void busquedaProducto(String idProducto) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        try {
            String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.createStatement();
            rs = sentencia.executeQuery("SELECT * from tiendaenlinea.producto where idProducto='" + idProducto + "'");
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

    public static void busquedaCuenta(String tipoDocumento, String numeroDocumento) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        try {
            String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.createStatement();
            rs = sentencia.executeQuery("SELECT * from tiendaenlinea.cuenta where tipoDocumento='" + tipoDocumento + "' and numeroDocumento='" + numeroDocumento + "'");
            while (rs.next() == true) {
                System.out.println("\nTipo Documento: " + rs.getString("tipoDocumento"));
                System.out.println("Número Documento: " + rs.getString("numeroDocumento"));
                System.out.println("Primer Nombre: " + rs.getString("primerNombre"));
                System.out.println("Segundo Nombre: " + rs.getString("segundoNombre"));
                System.out.println("Primer Apellido: " + rs.getString("primerApellido"));
                System.out.println("Segundo Apellido: " + rs.getString("segundoApellido"));
                System.out.println("Contraseña: " + rs.getString("contrasena"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Usuario: " + rs.getString("Usuario_idUsuario") + "\n");
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
