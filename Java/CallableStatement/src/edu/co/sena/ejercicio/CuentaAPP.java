/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio;

import edu.co.sena.ejercicio.dto.CuentaDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
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
    private CallableStatement sentencia = null;
    String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";

    public static void main(String[] args) throws SQLException {
        CuentaAPP app = new CuentaAPP();
        CuentaDTO cuenta = new CuentaDTO();
        cuenta.setTipoDocumento("CC");
        cuenta.setNumeroDocumento("69696969");
        cuenta.setPrimerNombre("Gavlyn");
        cuenta.setSegundoNombre("Marcela");
        cuenta.setPrimerApellido("Green");
        cuenta.setSegundoApellido("Ford");
        cuenta.setContrasena("12345");
        cuenta.setEmail("gavlyn@hotmail.com");
        cuenta.setUsuario_idUsuario("Gavlyn");
        
        app.insertarCuenta(cuenta);
    }

    public void insertarCuenta(CuentaDTO cuenta) throws SQLException {
        try {
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a la base de Datos");
            String sql = "CALL tiendaenlinea.insertarCuenta(?,?,?,?,?,?,?,?,?);";
            sentencia = conexion.prepareCall(sql);
            sentencia.setString(1, cuenta.getTipoDocumento());
            sentencia.setString(2, cuenta.getNumeroDocumento());
            sentencia.setString(3, cuenta.getPrimerNombre());
            sentencia.setString(4, cuenta.getSegundoNombre());
            sentencia.setString(5, cuenta.getPrimerApellido());
            sentencia.setString(6, cuenta.getSegundoApellido());
            sentencia.setString(7, cuenta.getContrasena());
            sentencia.setString(8, cuenta.getEmail());
            sentencia.setString(9, cuenta.getUsuario_idUsuario());

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
