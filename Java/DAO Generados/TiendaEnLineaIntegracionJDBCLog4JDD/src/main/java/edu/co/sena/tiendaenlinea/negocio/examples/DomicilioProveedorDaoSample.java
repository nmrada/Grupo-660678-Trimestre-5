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
import edu.co.sena.tiendaenlinea.integracion.dao.DomicilioProveedorDao;
import edu.co.sena.tiendaenlinea.integracion.dto.DomicilioProveedor;
import edu.co.sena.tiendaenlinea.integracion.exceptions.DomicilioProveedorDaoException;
import edu.co.sena.tiendaenlinea.integracion.factory.DomicilioProveedorDaoFactory;

public class DomicilioProveedorDaoSample
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
		// findByMunicipio("");
		// findByProveedor("", "");
		// findWhereProveedorIdproveedorEquals("");
		// findWhereProveedorTipodeidentificacionEquals("");
		// findWhereTelefonoEquals("");
		// findWhereDireccionEquals("");
		// findWhereBarrioEquals("");
		// findWhereLocalidadEquals("");
		// findWhereMunicipioIdmunicipioEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			DomicilioProveedorDao _dao = getDomicilioProveedorDao();
			DomicilioProveedor _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByMunicipio'
	 * 
	 * @param municipioIdmunicipio
	 */
	public static void findByMunicipio(String municipioIdmunicipio)
	{
		try {
			DomicilioProveedorDao _dao = getDomicilioProveedorDao();
			DomicilioProveedor _result[] = _dao.findByMunicipio(municipioIdmunicipio);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByProveedor'
	 * 
	 * @param proveedorIdproveedor
	 * @param proveedorTipodeidentificacion
	 */
	public static void findByProveedor(String proveedorIdproveedor, String proveedorTipodeidentificacion)
	{
		try {
			DomicilioProveedorDao _dao = getDomicilioProveedorDao();
			DomicilioProveedor _result[] = _dao.findByProveedor(proveedorIdproveedor, proveedorTipodeidentificacion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereProveedorIdproveedorEquals'
	 * 
	 * @param proveedorIdproveedor
	 */
	public static void findWhereProveedorIdproveedorEquals(String proveedorIdproveedor)
	{
		try {
			DomicilioProveedorDao _dao = getDomicilioProveedorDao();
			DomicilioProveedor _result[] = _dao.findWhereProveedorIdproveedorEquals(proveedorIdproveedor);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereProveedorTipodeidentificacionEquals'
	 * 
	 * @param proveedorTipodeidentificacion
	 */
	public static void findWhereProveedorTipodeidentificacionEquals(String proveedorTipodeidentificacion)
	{
		try {
			DomicilioProveedorDao _dao = getDomicilioProveedorDao();
			DomicilioProveedor _result[] = _dao.findWhereProveedorTipodeidentificacionEquals(proveedorTipodeidentificacion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereTelefonoEquals'
	 * 
	 * @param telefono
	 */
	public static void findWhereTelefonoEquals(String telefono)
	{
		try {
			DomicilioProveedorDao _dao = getDomicilioProveedorDao();
			DomicilioProveedor _result[] = _dao.findWhereTelefonoEquals(telefono);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereDireccionEquals'
	 * 
	 * @param direccion
	 */
	public static void findWhereDireccionEquals(String direccion)
	{
		try {
			DomicilioProveedorDao _dao = getDomicilioProveedorDao();
			DomicilioProveedor _result[] = _dao.findWhereDireccionEquals(direccion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereBarrioEquals'
	 * 
	 * @param barrio
	 */
	public static void findWhereBarrioEquals(String barrio)
	{
		try {
			DomicilioProveedorDao _dao = getDomicilioProveedorDao();
			DomicilioProveedor _result[] = _dao.findWhereBarrioEquals(barrio);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereLocalidadEquals'
	 * 
	 * @param localidad
	 */
	public static void findWhereLocalidadEquals(String localidad)
	{
		try {
			DomicilioProveedorDao _dao = getDomicilioProveedorDao();
			DomicilioProveedor _result[] = _dao.findWhereLocalidadEquals(localidad);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereMunicipioIdmunicipioEquals'
	 * 
	 * @param municipioIdmunicipio
	 */
	public static void findWhereMunicipioIdmunicipioEquals(String municipioIdmunicipio)
	{
		try {
			DomicilioProveedorDao _dao = getDomicilioProveedorDao();
			DomicilioProveedor _result[] = _dao.findWhereMunicipioIdmunicipioEquals(municipioIdmunicipio);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getDomicilioProveedorDao'
	 * 
	 * @return DomicilioProveedorDao
	 */
	public static DomicilioProveedorDao getDomicilioProveedorDao()
	{
		return DomicilioProveedorDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(DomicilioProveedor dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getProveedorIdproveedor() );
		buf.append( ", " );
		buf.append( dto.getProveedorTipodeidentificacion() );
		buf.append( ", " );
		buf.append( dto.getTelefono() );
		buf.append( ", " );
		buf.append( dto.getDireccion() );
		buf.append( ", " );
		buf.append( dto.getBarrio() );
		buf.append( ", " );
		buf.append( dto.getLocalidad() );
		buf.append( ", " );
		buf.append( dto.getMunicipioIdmunicipio() );
		System.out.println( buf.toString() );
	}

}
