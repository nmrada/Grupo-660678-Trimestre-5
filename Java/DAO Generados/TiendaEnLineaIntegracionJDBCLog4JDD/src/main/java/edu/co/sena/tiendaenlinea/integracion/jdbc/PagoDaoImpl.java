/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.jdbc;

import edu.co.sena.tiendaenlinea.integracion.dao.*;
import edu.co.sena.tiendaenlinea.integracion.factory.*;
import edu.co.sena.tiendaenlinea.integracion.dto.*;
import edu.co.sena.tiendaenlinea.integracion.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import org.apache.log4j.Logger;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class PagoDaoImpl extends AbstractDAO implements PagoDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	protected static final Logger logger = Logger.getLogger( PagoDaoImpl.class );

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT Factura_idFactura, numTarCredito, banco, tipoCuentaTar, tipoTransaccion FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( Factura_idFactura, numTarCredito, banco, tipoCuentaTar, tipoTransaccion ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET Factura_idFactura = ?, numTarCredito = ?, banco = ?, tipoCuentaTar = ?, tipoTransaccion = ? WHERE Factura_idFactura = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE Factura_idFactura = ?";

	/** 
	 * Index of column Factura_idFactura
	 */
	protected static final int COLUMN_FACTURA_IDFACTURA = 1;

	/** 
	 * Index of column numTarCredito
	 */
	protected static final int COLUMN_NUM_TAR_CREDITO = 2;

	/** 
	 * Index of column banco
	 */
	protected static final int COLUMN_BANCO = 3;

	/** 
	 * Index of column tipoCuentaTar
	 */
	protected static final int COLUMN_TIPO_CUENTA_TAR = 4;

	/** 
	 * Index of column tipoTransaccion
	 */
	protected static final int COLUMN_TIPO_TRANSACCION = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column Factura_idFactura
	 */
	protected static final int PK_COLUMN_FACTURA_IDFACTURA = 1;

	/** 
	 * Inserts a new row in the pago table.
	 */
	public PagoPk insert(Pago dto) throws PagoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isFacturaIdfacturaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "Factura_idFactura" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNumTarCreditoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "numTarCredito" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isBancoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "banco" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isTipoCuentaTarModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "tipoCuentaTar" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isTipoTransaccionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "tipoTransaccion" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isFacturaIdfacturaModified()) {
				stmt.setInt( index++, dto.getFacturaIdfactura() );
			}
		
			if (dto.isNumTarCreditoModified()) {
				stmt.setString( index++, dto.getNumTarCredito() );
			}
		
			if (dto.isBancoModified()) {
				stmt.setString( index++, dto.getBanco() );
			}
		
			if (dto.isTipoCuentaTarModified()) {
				stmt.setString( index++, dto.getTipoCuentaTar() );
			}
		
			if (dto.isTipoTransaccionModified()) {
				stmt.setString( index++, dto.getTipoTransaccion() );
			}
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new PagoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the pago table.
	 */
	public void update(PagoPk pk, Pago dto) throws PagoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isFacturaIdfacturaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "Factura_idFactura=?" );
				modified=true;
			}
		
			if (dto.isNumTarCreditoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "numTarCredito=?" );
				modified=true;
			}
		
			if (dto.isBancoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "banco=?" );
				modified=true;
			}
		
			if (dto.isTipoCuentaTarModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "tipoCuentaTar=?" );
				modified=true;
			}
		
			if (dto.isTipoTransaccionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "tipoTransaccion=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE Factura_idFactura=?" );
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isFacturaIdfacturaModified()) {
				stmt.setInt( index++, dto.getFacturaIdfactura() );
			}
		
			if (dto.isNumTarCreditoModified()) {
				stmt.setString( index++, dto.getNumTarCredito() );
			}
		
			if (dto.isBancoModified()) {
				stmt.setString( index++, dto.getBanco() );
			}
		
			if (dto.isTipoCuentaTarModified()) {
				stmt.setString( index++, dto.getTipoCuentaTar() );
			}
		
			if (dto.isTipoTransaccionModified()) {
				stmt.setString( index++, dto.getTipoTransaccion() );
			}
		
			stmt.setInt( index++, pk.getFacturaIdfactura() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new PagoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the pago table.
	 */
	public void delete(PagoPk pk) throws PagoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL_DELETE + " with PK: " + pk);
			}
		
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getFacturaIdfactura() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new PagoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the pago table that matches the specified primary-key value.
	 */
	public Pago findByPrimaryKey(PagoPk pk) throws PagoDaoException
	{
		return findByPrimaryKey( pk.getFacturaIdfactura() );
	}

	/** 
	 * Returns all rows from the pago table that match the criteria 'Factura_idFactura = :facturaIdfactura'.
	 */
	public Pago findByPrimaryKey(int facturaIdfactura) throws PagoDaoException
	{
		Pago ret[] = findByDynamicSelect( SQL_SELECT + " WHERE Factura_idFactura = ?", new Object[] {  new Integer(facturaIdfactura) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the pago table that match the criteria ''.
	 */
	public Pago[] findAll() throws PagoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY Factura_idFactura", null );
	}

	/** 
	 * Returns all rows from the pago table that match the criteria 'Factura_idFactura = :facturaIdfactura'.
	 */
	public Pago[] findByFactura(int facturaIdfactura) throws PagoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Factura_idFactura = ?", new Object[] {  new Integer(facturaIdfactura) } );
	}

	/** 
	 * Returns all rows from the pago table that match the criteria 'Factura_idFactura = :facturaIdfactura'.
	 */
	public Pago[] findWhereFacturaIdfacturaEquals(int facturaIdfactura) throws PagoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Factura_idFactura = ? ORDER BY Factura_idFactura", new Object[] {  new Integer(facturaIdfactura) } );
	}

	/** 
	 * Returns all rows from the pago table that match the criteria 'numTarCredito = :numTarCredito'.
	 */
	public Pago[] findWhereNumTarCreditoEquals(String numTarCredito) throws PagoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE numTarCredito = ? ORDER BY numTarCredito", new Object[] { numTarCredito } );
	}

	/** 
	 * Returns all rows from the pago table that match the criteria 'banco = :banco'.
	 */
	public Pago[] findWhereBancoEquals(String banco) throws PagoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE banco = ? ORDER BY banco", new Object[] { banco } );
	}

	/** 
	 * Returns all rows from the pago table that match the criteria 'tipoCuentaTar = :tipoCuentaTar'.
	 */
	public Pago[] findWhereTipoCuentaTarEquals(String tipoCuentaTar) throws PagoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE tipoCuentaTar = ? ORDER BY tipoCuentaTar", new Object[] { tipoCuentaTar } );
	}

	/** 
	 * Returns all rows from the pago table that match the criteria 'tipoTransaccion = :tipoTransaccion'.
	 */
	public Pago[] findWhereTipoTransaccionEquals(String tipoTransaccion) throws PagoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE tipoTransaccion = ? ORDER BY tipoTransaccion", new Object[] { tipoTransaccion } );
	}

	/**
	 * Method 'PagoDaoImpl'
	 * 
	 */
	public PagoDaoImpl()
	{
	}

	/**
	 * Method 'PagoDaoImpl'
	 * 
	 * @param userConn
	 */
	public PagoDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "tiendaenlinea.pago";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Pago fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Pago dto = new Pago();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Pago[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Pago dto = new Pago();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Pago ret[] = new Pago[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Pago dto, ResultSet rs) throws SQLException
	{
		dto.setFacturaIdfactura( rs.getInt( COLUMN_FACTURA_IDFACTURA ) );
		dto.setNumTarCredito( rs.getString( COLUMN_NUM_TAR_CREDITO ) );
		dto.setBanco( rs.getString( COLUMN_BANCO ) );
		dto.setTipoCuentaTar( rs.getString( COLUMN_TIPO_CUENTA_TAR ) );
		dto.setTipoTransaccion( rs.getString( COLUMN_TIPO_TRANSACCION ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Pago dto)
	{
		dto.setFacturaIdfacturaModified( false );
		dto.setNumTarCreditoModified( false );
		dto.setBancoModified( false );
		dto.setTipoCuentaTarModified( false );
		dto.setTipoTransaccionModified( false );
	}

	/** 
	 * Returns all rows from the pago table that match the specified arbitrary SQL statement
	 */
	public Pago[] findByDynamicSelect(String sql, Object[] sqlParams) throws PagoDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL);
			}
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new PagoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the pago table that match the specified arbitrary SQL statement
	 */
	public Pago[] findByDynamicWhere(String sql, Object[] sqlParams) throws PagoDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL);
			}
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new PagoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
