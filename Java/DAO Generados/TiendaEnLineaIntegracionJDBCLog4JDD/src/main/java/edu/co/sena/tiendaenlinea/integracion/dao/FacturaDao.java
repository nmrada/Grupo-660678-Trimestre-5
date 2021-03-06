/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.dao;

import java.util.Date;
import edu.co.sena.tiendaenlinea.integracion.dto.*;
import edu.co.sena.tiendaenlinea.integracion.exceptions.*;

public interface FacturaDao
{
	/** 
	 * Inserts a new row in the factura table.
	 */
	public FacturaPk insert(Factura dto) throws FacturaDaoException;

	/** 
	 * Updates a single row in the factura table.
	 */
	public void update(FacturaPk pk, Factura dto) throws FacturaDaoException;

	/** 
	 * Deletes a single row in the factura table.
	 */
	public void delete(FacturaPk pk) throws FacturaDaoException;

	/** 
	 * Returns the rows from the factura table that matches the specified primary-key value.
	 */
	public Factura findByPrimaryKey(FacturaPk pk) throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the criteria 'idFactura = :idFactura'.
	 */
	public Factura findByPrimaryKey(int idFactura) throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the criteria ''.
	 */
	public Factura[] findAll() throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the criteria 'Cuenta_tipoDocumento = :cuentaTipodocumento AND Cuenta_numeroDocumento = :cuentaNumerodocumento'.
	 */
	public Factura[] findByCuenta(String cuentaTipodocumento, String cuentaNumerodocumento) throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the criteria 'idFactura = :idFactura'.
	 */
	public Factura[] findWhereIdFacturaEquals(int idFactura) throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the criteria 'fecha = :fecha'.
	 */
	public Factura[] findWhereFechaEquals(Date fecha) throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the criteria 'total = :total'.
	 */
	public Factura[] findWhereTotalEquals(float total) throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the criteria 'Cuenta_tipoDocumento = :cuentaTipodocumento'.
	 */
	public Factura[] findWhereCuentaTipodocumentoEquals(String cuentaTipodocumento) throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the criteria 'Cuenta_numeroDocumento = :cuentaNumerodocumento'.
	 */
	public Factura[] findWhereCuentaNumerodocumentoEquals(String cuentaNumerodocumento) throws FacturaDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the factura table that match the specified arbitrary SQL statement
	 */
	public Factura[] findByDynamicSelect(String sql, Object[] sqlParams) throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the specified arbitrary SQL statement
	 */
	public Factura[] findByDynamicWhere(String sql, Object[] sqlParams) throws FacturaDaoException;

}
