/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio;

import edu.co.sena.ejercicio.dto.CuentaDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class CuentaAPP {

    /**
     * @param args the command line arguments
     */
    private Connection conexion = null;
    private PreparedStatement sentencia = null;
    private ResultSet resultado = null;
    String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";

    public static void main(String[] args) throws SQLException {

        //Insertar Cuenta
        CuentaAPP app = new CuentaAPP();
        CuentaDTO cuenta = new CuentaDTO();
        cuenta.setTipoDocumento("CC");
        cuenta.setNumeroDocumento("69696969");
//        cuenta.setPrimerNombre("Gavlyn");
//        cuenta.setSegundoNombre("Elizabeth");
//        cuenta.setPrimerApellido("Green");
//        cuenta.setSegundoApellido("Ford");
//        cuenta.setContrasena("12345");
//        cuenta.setEmail("gavlyn@hotmail.com");
//        cuenta.setUsuario_idUsuario("Gavlyn");
//        app.insertarCuenta(cuenta);

        //Actualizar Cuenta
//        cuenta.setPrimerNombre("Salomon");
//        cuenta.setSegundoNombre("Antonio");
//        cuenta.setPrimerApellido("Bustamante");
//        cuenta.setSegundoApellido("Rojas");
//        cuenta.setContrasena("3366");
//        cuenta.setEmail("salomon@hotmail.com");
//        app.actualizarCuenta(cuenta);
        //Eliminar Cuenta
        //app.eliminarCuenta(cuenta);
        //Buscar una sola Cuenta
        
        CuentaDTO cuentaBusqueda = app.buscarUnaSolaCuenta(cuenta);
        System.out.println(cuentaBusqueda.toString());
    }

    public void insertarCuenta(CuentaDTO cuenta) throws SQLException {

        try {

            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a la base de datos");
            String sqlInsertar = "INSERT INTO tiendaenlinea.cuenta "
                    + "(tipoDocumento, "
                    + "numeroDocumento, "
                    + "primerNombre, "
                    + "segundoNombre, "
                    + "primerApellido, "
                    + "segundoApellido, "
                    + "contrasena, "
                    + "email, "
                    + "Usuario_idUsuario) "
                    + "VALUES "
                    + "(?,?,?,?,?,?,?,?,?);";
            sentencia = conexion.prepareStatement(sqlInsertar);

            sentencia.setString(1, cuenta.getTipoDocumento());
            sentencia.setString(2, cuenta.getNumeroDocumento());
            sentencia.setString(3, cuenta.getPrimerNombre());
            sentencia.setString(4, cuenta.getSegundoNombre());
            sentencia.setString(5, cuenta.getPrimerApellido());
            sentencia.setString(6, cuenta.getSegundoApellido());
            sentencia.setString(7, cuenta.getContrasena());
            sentencia.setString(8, cuenta.getEmail());
            sentencia.setString(9, cuenta.getUsuario_idUsuario());

            System.out.println("Sentencia ejecutada " + sqlInsertar);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("Se inserto la cuenta " + resultado);
            } else {
                System.out.println("No se inserto la cuenta");
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

    public void actualizarCuenta(CuentaDTO cuenta) throws SQLException {
        try {

            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a la base de datos");
            String sqlInsertar = "UPDATE tiendaenlinea.cuenta "
                    + "SET "
                    + "primerNombre = ?, "
                    + "segundoNombre = ?, "
                    + "primerApellido = ?, "
                    + "segundoApellido = ?, "
                    + "contrasena = ?, "
                    + "email = ? "
                    + "WHERE tipoDocumento = ? AND numeroDocumento = ?;";
            sentencia = conexion.prepareStatement(sqlInsertar);

            sentencia.setString(1, cuenta.getPrimerNombre());
            sentencia.setString(2, cuenta.getSegundoNombre());
            sentencia.setString(3, cuenta.getPrimerApellido());
            sentencia.setString(4, cuenta.getSegundoApellido());
            sentencia.setString(5, cuenta.getContrasena());
            sentencia.setString(6, cuenta.getEmail());
            sentencia.setString(7, cuenta.getTipoDocumento());
            sentencia.setString(8, cuenta.getNumeroDocumento());

            System.out.println("Sentencia ejecutada " + sqlInsertar);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("Se actualizo la cuenta " + resultado);
            } else {
                System.out.println("No se actualizo la cuenta");
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

    public void eliminarCuenta(CuentaDTO cuenta) throws SQLException {
        try {

            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a la base de datos");
            String sqlInsertar = "delete from tiendaenlinea.cuenta "
                    + "WHERE tipoDocumento = ? AND numeroDocumento = ?;";
            sentencia = conexion.prepareStatement(sqlInsertar);

            sentencia.setString(1, cuenta.getTipoDocumento());
            sentencia.setString(2, cuenta.getNumeroDocumento());

            System.out.println("Sentencia ejecutada " + sqlInsertar);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("Se elimino la cuenta " + resultado);
            } else {
                System.out.println("No se elimino la cuenta");
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

    public CuentaDTO buscarUnaSolaCuenta(CuentaDTO cuenta) throws SQLException {
        CuentaDTO cuentaTemporal = new CuentaDTO();
        ResultSet rs = null;
        try {
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a la base de datos");
            String sqlBuscar = "select * from tiendaenlinea.cuenta where tipoDocumento = ? and numeroDocumento = ?;";
            sentencia = conexion.prepareStatement(sqlBuscar);
            sentencia.setString(1, cuenta.getTipoDocumento());
            sentencia.setString(2, cuenta.getNumeroDocumento());
            rs = sentencia.executeQuery();
            System.out.println("Sentencia ejecutada " + sqlBuscar);
            if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {
                    cuentaTemporal.setTipoDocumento(rs.getString("tipoDocumento"));
                    cuentaTemporal.setNumeroDocumento(rs.getString("numeroDocumento"));
                    cuentaTemporal.setPrimerNombre(rs.getString("primerNombre"));
                    cuentaTemporal.setSegundoNombre(rs.getString("segundoNombre"));
                    cuentaTemporal.setPrimerApellido(rs.getString("primerApellido"));
                    cuentaTemporal.setSegundoApellido(rs.getString("segundoApellido"));
                    cuentaTemporal.setContrasena(rs.getString("contrasena"));
                    cuentaTemporal.setEmail(rs.getString("email"));
                    cuentaTemporal.setUsuario_idUsuario(rs.getString("Usuario_idUsuario"));
                }
            } else {
                System.out.println("No existe la cuenta");
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
        return cuentaTemporal;
    }
}
