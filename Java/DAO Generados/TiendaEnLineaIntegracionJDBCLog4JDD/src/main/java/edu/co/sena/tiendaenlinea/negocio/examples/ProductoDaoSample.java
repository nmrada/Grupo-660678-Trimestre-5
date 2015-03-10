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
import edu.co.sena.tiendaenlinea.integracion.dao.ProductoDao;
import edu.co.sena.tiendaenlinea.integracion.dto.Producto;
import edu.co.sena.tiendaenlinea.integracion.exceptions.ProductoDaoException;
import edu.co.sena.tiendaenlinea.integracion.factory.ProductoDaoFactory;

public class ProductoDaoSample
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
		// findByCatalogo(0);
		// findByCategoria(0);
		// findWhereIdProductoEquals("");
		// findWhereNombreEquals("");
		// findWhereMarcaEquals("");
		// findWhereReferenciaEquals("");
		// findWhereDescripcionEquals("");
		// findWhereMaterialEquals("");
		// findWhereColorEquals("");
		// findWhereFotoEquals(null);
		// findWhereCantidadEquals(0);
		// findWhereActivoEquals(0);
		// findWherePrecioUnitarioEquals(0);
		// findWhereDescuentoEquals(0);
		// findWhereCategoriaIdcategoriaEquals(0);
		// findWhereCatalogoIdcatalogoEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByCatalogo'
	 * 
	 * @param catalogoIdcatalogo
	 */
	public static void findByCatalogo(int catalogoIdcatalogo)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findByCatalogo(catalogoIdcatalogo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByCategoria'
	 * 
	 * @param categoriaIdcategoria
	 */
	public static void findByCategoria(int categoriaIdcategoria)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findByCategoria(categoriaIdcategoria);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdProductoEquals'
	 * 
	 * @param idProducto
	 */
	public static void findWhereIdProductoEquals(String idProducto)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereIdProductoEquals(idProducto);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNombreEquals'
	 * 
	 * @param nombre
	 */
	public static void findWhereNombreEquals(String nombre)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereNombreEquals(nombre);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereMarcaEquals'
	 * 
	 * @param marca
	 */
	public static void findWhereMarcaEquals(String marca)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereMarcaEquals(marca);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereReferenciaEquals'
	 * 
	 * @param referencia
	 */
	public static void findWhereReferenciaEquals(String referencia)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereReferenciaEquals(referencia);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereDescripcionEquals'
	 * 
	 * @param descripcion
	 */
	public static void findWhereDescripcionEquals(String descripcion)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereDescripcionEquals(descripcion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereMaterialEquals'
	 * 
	 * @param material
	 */
	public static void findWhereMaterialEquals(String material)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereMaterialEquals(material);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereColorEquals'
	 * 
	 * @param color
	 */
	public static void findWhereColorEquals(String color)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereColorEquals(color);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereFotoEquals'
	 * 
	 * @param foto
	 */
	public static void findWhereFotoEquals(byte[] foto)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereFotoEquals(foto);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCantidadEquals'
	 * 
	 * @param cantidad
	 */
	public static void findWhereCantidadEquals(int cantidad)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereCantidadEquals(cantidad);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereActivoEquals'
	 * 
	 * @param activo
	 */
	public static void findWhereActivoEquals(short activo)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereActivoEquals(activo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWherePrecioUnitarioEquals'
	 * 
	 * @param precioUnitario
	 */
	public static void findWherePrecioUnitarioEquals(float precioUnitario)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWherePrecioUnitarioEquals(precioUnitario);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereDescuentoEquals'
	 * 
	 * @param descuento
	 */
	public static void findWhereDescuentoEquals(float descuento)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereDescuentoEquals(descuento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCategoriaIdcategoriaEquals'
	 * 
	 * @param categoriaIdcategoria
	 */
	public static void findWhereCategoriaIdcategoriaEquals(int categoriaIdcategoria)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereCategoriaIdcategoriaEquals(categoriaIdcategoria);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCatalogoIdcatalogoEquals'
	 * 
	 * @param catalogoIdcatalogo
	 */
	public static void findWhereCatalogoIdcatalogoEquals(int catalogoIdcatalogo)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereCatalogoIdcatalogoEquals(catalogoIdcatalogo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getProductoDao'
	 * 
	 * @return ProductoDao
	 */
	public static ProductoDao getProductoDao()
	{
		return ProductoDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Producto dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdProducto() );
		buf.append( ", " );
		buf.append( dto.getNombre() );
		buf.append( ", " );
		buf.append( dto.getMarca() );
		buf.append( ", " );
		buf.append( dto.getReferencia() );
		buf.append( ", " );
		buf.append( dto.getDescripcion() );
		buf.append( ", " );
		buf.append( dto.getMaterial() );
		buf.append( ", " );
		buf.append( dto.getColor() );
		buf.append( ", " );
		buf.append( dto.getFoto() );
		buf.append( ", " );
		buf.append( dto.getCantidad() );
		buf.append( ", " );
		buf.append( dto.getActivo() );
		buf.append( ", " );
		buf.append( dto.getPrecioUnitario() );
		buf.append( ", " );
		buf.append( dto.getDescuento() );
		buf.append( ", " );
		buf.append( dto.getCategoriaIdcategoria() );
		buf.append( ", " );
		buf.append( dto.getCatalogoIdcatalogo() );
		System.out.println( buf.toString() );
	}

}
