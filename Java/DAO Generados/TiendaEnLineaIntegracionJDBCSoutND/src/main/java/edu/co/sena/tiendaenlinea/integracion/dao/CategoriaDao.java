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

public interface CategoriaDao
{
	/** 
	 * Inserts a new row in the categoria table.
	 */
	public CategoriaPk insert(Categoria dto) throws CategoriaDaoException;

	/** 
	 * Updates a single row in the categoria table.
	 */
	public void update(CategoriaPk pk, Categoria dto) throws CategoriaDaoException;

	/** 
	 * Deletes a single row in the categoria table.
	 */
	public void delete(CategoriaPk pk) throws CategoriaDaoException;

	/** 
	 * Returns the rows from the categoria table that matches the specified primary-key value.
	 */
	public Categoria findByPrimaryKey(CategoriaPk pk) throws CategoriaDaoException;

	/** 
	 * Returns all rows from the categoria table that match the criteria 'idCategoria = :idCategoria'.
	 */
	public Categoria findByPrimaryKey(int idCategoria) throws CategoriaDaoException;

	/** 
	 * Returns all rows from the categoria table that match the criteria ''.
	 */
	public Categoria[] findAll() throws CategoriaDaoException;

	/** 
	 * Returns all rows from the categoria table that match the criteria 'idCategoria = :idCategoria'.
	 */
	public Categoria[] findWhereIdCategoriaEquals(int idCategoria) throws CategoriaDaoException;

	/** 
	 * Returns all rows from the categoria table that match the criteria 'nombreCategoria = :nombreCategoria'.
	 */
	public Categoria[] findWhereNombreCategoriaEquals(String nombreCategoria) throws CategoriaDaoException;

	/** 
	 * Returns all rows from the categoria table that match the criteria 'activa = :activa'.
	 */
	public Categoria[] findWhereActivaEquals(short activa) throws CategoriaDaoException;

	/** 
	 * Returns all rows from the categoria table that match the criteria 'pariente = :pariente'.
	 */
	public Categoria[] findWhereParienteEquals(int pariente) throws CategoriaDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the categoria table that match the specified arbitrary SQL statement
	 */
	public Categoria[] findByDynamicSelect(String sql, Object[] sqlParams) throws CategoriaDaoException;

	/** 
	 * Returns all rows from the categoria table that match the specified arbitrary SQL statement
	 */
	public Categoria[] findByDynamicWhere(String sql, Object[] sqlParams) throws CategoriaDaoException;

}
