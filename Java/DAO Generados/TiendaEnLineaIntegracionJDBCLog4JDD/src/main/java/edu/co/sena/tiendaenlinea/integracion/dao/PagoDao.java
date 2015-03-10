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

public interface PagoDao
{
	/** 
	 * Inserts a new row in the pago table.
	 */
	public PagoPk insert(Pago dto) throws PagoDaoException;

	/** 
	 * Updates a single row in the pago table.
	 */
	public void update(PagoPk pk, Pago dto) throws PagoDaoException;

	/** 
	 * Deletes a single row in the pago table.
	 */
	public void delete(PagoPk pk) throws PagoDaoException;

	/** 
	 * Returns the rows from the pago table that matches the specified primary-key value.
	 */
	public Pago findByPrimaryKey(PagoPk pk) throws PagoDaoException;

	/** 
	 * Returns all rows from the pago table that match the criteria 'Factura_idFactura = :facturaIdfactura'.
	 */
	public Pago findByPrimaryKey(int facturaIdfactura) throws PagoDaoException;

	/** 
	 * Returns all rows from the pago table that match the criteria ''.
	 */
	public Pago[] findAll() throws PagoDaoException;

	/** 
	 * Returns all rows from the pago table that match the criteria 'Factura_idFactura = :facturaIdfactura'.
	 */
	public Pago[] findByFactura(int facturaIdfactura) throws PagoDaoException;

	/** 
	 * Returns all rows from the pago table that match the criteria 'Factura_idFactura = :facturaIdfactura'.
	 */
	public Pago[] findWhereFacturaIdfacturaEquals(int facturaIdfactura) throws PagoDaoException;

	/** 
	 * Returns all rows from the pago table that match the criteria 'numTarCredito = :numTarCredito'.
	 */
	public Pago[] findWhereNumTarCreditoEquals(String numTarCredito) throws PagoDaoException;

	/** 
	 * Returns all rows from the pago table that match the criteria 'banco = :banco'.
	 */
	public Pago[] findWhereBancoEquals(String banco) throws PagoDaoException;

	/** 
	 * Returns all rows from the pago table that match the criteria 'tipoCuentaTar = :tipoCuentaTar'.
	 */
	public Pago[] findWhereTipoCuentaTarEquals(String tipoCuentaTar) throws PagoDaoException;

	/** 
	 * Returns all rows from the pago table that match the criteria 'tipoTransaccion = :tipoTransaccion'.
	 */
	public Pago[] findWhereTipoTransaccionEquals(String tipoTransaccion) throws PagoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the pago table that match the specified arbitrary SQL statement
	 */
	public Pago[] findByDynamicSelect(String sql, Object[] sqlParams) throws PagoDaoException;

	/** 
	 * Returns all rows from the pago table that match the specified arbitrary SQL statement
	 */
	public Pago[] findByDynamicWhere(String sql, Object[] sqlParams) throws PagoDaoException;

}
