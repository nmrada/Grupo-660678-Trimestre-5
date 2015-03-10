/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.negocio.examples;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.tiendaenlinea.integracion.dao.UsuarioDao;
import edu.co.sena.tiendaenlinea.integracion.dto.Usuario;
import edu.co.sena.tiendaenlinea.integracion.exceptions.UsuarioDaoException;
import edu.co.sena.tiendaenlinea.integracion.factory.UsuarioDaoFactory;

public class UsuarioDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findWhereIdUsuarioEquals("");
		// findWhereContrasenaEquals("");
		// findWhereRolEquals("");
		// findWhereEstadoEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			UsuarioDao _dao = getUsuarioDao();
			Usuario _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdUsuarioEquals'
	 * 
	 * @param idUsuario
	 */
	public static void findWhereIdUsuarioEquals(String idUsuario)
	{
		try {
			UsuarioDao _dao = getUsuarioDao();
			Usuario _result[] = _dao.findWhereIdUsuarioEquals(idUsuario);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereContrasenaEquals'
	 * 
	 * @param contrasena
	 */
	public static void findWhereContrasenaEquals(String contrasena)
	{
		try {
			UsuarioDao _dao = getUsuarioDao();
			Usuario _result[] = _dao.findWhereContrasenaEquals(contrasena);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereRolEquals'
	 * 
	 * @param rol
	 */
	public static void findWhereRolEquals(String rol)
	{
		try {
			UsuarioDao _dao = getUsuarioDao();
			Usuario _result[] = _dao.findWhereRolEquals(rol);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereEstadoEquals'
	 * 
	 * @param estado
	 */
	public static void findWhereEstadoEquals(String estado)
	{
		try {
			UsuarioDao _dao = getUsuarioDao();
			Usuario _result[] = _dao.findWhereEstadoEquals(estado);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getUsuarioDao'
	 * 
	 * @return UsuarioDao
	 */
	public static UsuarioDao getUsuarioDao()
	{
		return UsuarioDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Usuario dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdUsuario() );
		buf.append( ", " );
		buf.append( dto.getContrasena() );
		buf.append( ", " );
		buf.append( dto.getRol() );
		buf.append( ", " );
		buf.append( dto.getEstado() );
		System.out.println( buf.toString() );
	}

}
