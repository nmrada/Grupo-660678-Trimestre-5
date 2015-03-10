/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.dao;

import edu.co.sena.tiendaenlinea.integracion.dto.*;
import edu.co.sena.tiendaenlinea.integracion.exceptions.*;

public interface ProductoDao
{
	/** 
	 * Inserts a new row in the producto table.
	 */
	public ProductoPk insert(Producto dto) throws ProductoDaoException;

	/** 
	 * Updates a single row in the producto table.
	 */
	public void update(ProductoPk pk, Producto dto) throws ProductoDaoException;

	/** 
	 * Deletes a single row in the producto table.
	 */
	public void delete(ProductoPk pk) throws ProductoDaoException;

	/** 
	 * Returns the rows from the producto table that matches the specified primary-key value.
	 */
	public Producto findByPrimaryKey(ProductoPk pk) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'idProducto = :idProducto'.
	 */
	public Producto findByPrimaryKey(String idProducto) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria ''.
	 */
	public Producto[] findAll() throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'Catalogo_idCatalogo = :catalogoIdcatalogo'.
	 */
	public Producto[] findByCatalogo(int catalogoIdcatalogo) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'Categoria_idCategoria = :categoriaIdcategoria'.
	 */
	public Producto[] findByCategoria(int categoriaIdcategoria) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'idProducto = :idProducto'.
	 */
	public Producto[] findWhereIdProductoEquals(String idProducto) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'nombre = :nombre'.
	 */
	public Producto[] findWhereNombreEquals(String nombre) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'marca = :marca'.
	 */
	public Producto[] findWhereMarcaEquals(String marca) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'referencia = :referencia'.
	 */
	public Producto[] findWhereReferenciaEquals(String referencia) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'descripcion = :descripcion'.
	 */
	public Producto[] findWhereDescripcionEquals(String descripcion) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'material = :material'.
	 */
	public Producto[] findWhereMaterialEquals(String material) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'color = :color'.
	 */
	public Producto[] findWhereColorEquals(String color) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'foto = :foto'.
	 */
	public Producto[] findWhereFotoEquals(byte[] foto) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'cantidad = :cantidad'.
	 */
	public Producto[] findWhereCantidadEquals(int cantidad) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'activo = :activo'.
	 */
	public Producto[] findWhereActivoEquals(short activo) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'precioUnitario = :precioUnitario'.
	 */
	public Producto[] findWherePrecioUnitarioEquals(float precioUnitario) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'descuento = :descuento'.
	 */
	public Producto[] findWhereDescuentoEquals(float descuento) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'Categoria_idCategoria = :categoriaIdcategoria'.
	 */
	public Producto[] findWhereCategoriaIdcategoriaEquals(int categoriaIdcategoria) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'Catalogo_idCatalogo = :catalogoIdcatalogo'.
	 */
	public Producto[] findWhereCatalogoIdcatalogoEquals(int catalogoIdcatalogo) throws ProductoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the producto table that match the specified arbitrary SQL statement
	 */
	public Producto[] findByDynamicSelect(String sql, Object[] sqlParams) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the specified arbitrary SQL statement
	 */
	public Producto[] findByDynamicWhere(String sql, Object[] sqlParams) throws ProductoDaoException;

}
