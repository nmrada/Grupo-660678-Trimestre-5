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
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class CarritodecomprasDaoImpl extends AbstractDAO implements CarritodecomprasDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT idCarritoDeCompras, subtotal, precioTotal, impuestos FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idCarritoDeCompras, subtotal, precioTotal, impuestos ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idCarritoDeCompras = ?, subtotal = ?, precioTotal = ?, impuestos = ? WHERE idCarritoDeCompras = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idCarritoDeCompras = ?";

	/** 
	 * Index of column idCarritoDeCompras
	 */
	protected static final int COLUMN_ID_CARRITO_DE_COMPRAS = 1;

	/** 
	 * Index of column subtotal
	 */
	protected static final int COLUMN_SUBTOTAL = 2;

	/** 
	 * Index of column precioTotal
	 */
	protected static final int COLUMN_PRECIO_TOTAL = 3;

	/** 
	 * Index of column impuestos
	 */
	protected static final int COLUMN_IMPUESTOS = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column idCarritoDeCompras
	 */
	protected static final int PK_COLUMN_ID_CARRITO_DE_COMPRAS = 1;

	/** 
	 * Inserts a new row in the carritodecompras table.
	 */
	public CarritodecomprasPk insert(Carritodecompras dto) throws CarritodecomprasDaoException
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
			if (dto.isIdCarritoDeComprasModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "idCarritoDeCompras" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isSubtotalModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "subtotal" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isPrecioTotalModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "precioTotal" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isImpuestosModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "impuestos" );
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
			if (dto.isIdCarritoDeComprasModified()) {
				stmt.setString( index++, dto.getIdCarritoDeCompras() );
			}
		
			if (dto.isSubtotalModified()) {
				stmt.setFloat( index++, dto.getSubtotal() );
			}
		
			if (dto.isPrecioTotalModified()) {
				stmt.setFloat( index++, dto.getPrecioTotal() );
			}
		
			if (dto.isImpuestosModified()) {
				stmt.setFloat( index++, dto.getImpuestos() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CarritodecomprasDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the carritodecompras table.
	 */
	public void update(CarritodecomprasPk pk, Carritodecompras dto) throws CarritodecomprasDaoException
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
			if (dto.isIdCarritoDeComprasModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "idCarritoDeCompras=?" );
				modified=true;
			}
		
			if (dto.isSubtotalModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "subtotal=?" );
				modified=true;
			}
		
			if (dto.isPrecioTotalModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "precioTotal=?" );
				modified=true;
			}
		
			if (dto.isImpuestosModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "impuestos=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE idCarritoDeCompras=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdCarritoDeComprasModified()) {
				stmt.setString( index++, dto.getIdCarritoDeCompras() );
			}
		
			if (dto.isSubtotalModified()) {
				stmt.setFloat( index++, dto.getSubtotal() );
			}
		
			if (dto.isPrecioTotalModified()) {
				stmt.setFloat( index++, dto.getPrecioTotal() );
			}
		
			if (dto.isImpuestosModified()) {
				stmt.setFloat( index++, dto.getImpuestos() );
			}
		
			stmt.setString( index++, pk.getIdCarritoDeCompras() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CarritodecomprasDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the carritodecompras table.
	 */
	public void delete(CarritodecomprasPk pk) throws CarritodecomprasDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setString( 1, pk.getIdCarritoDeCompras() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CarritodecomprasDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the carritodecompras table that matches the specified primary-key value.
	 */
	public Carritodecompras findByPrimaryKey(CarritodecomprasPk pk) throws CarritodecomprasDaoException
	{
		return findByPrimaryKey( pk.getIdCarritoDeCompras() );
	}

	/** 
	 * Returns all rows from the carritodecompras table that match the criteria 'idCarritoDeCompras = :idCarritoDeCompras'.
	 */
	public Carritodecompras findByPrimaryKey(String idCarritoDeCompras) throws CarritodecomprasDaoException
	{
		Carritodecompras ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idCarritoDeCompras = ?", new Object[] { idCarritoDeCompras } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the carritodecompras table that match the criteria ''.
	 */
	public Carritodecompras[] findAll() throws CarritodecomprasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idCarritoDeCompras", null );
	}

	/** 
	 * Returns all rows from the carritodecompras table that match the criteria 'idCarritoDeCompras = :idCarritoDeCompras'.
	 */
	public Carritodecompras[] findWhereIdCarritoDeComprasEquals(String idCarritoDeCompras) throws CarritodecomprasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idCarritoDeCompras = ? ORDER BY idCarritoDeCompras", new Object[] { idCarritoDeCompras } );
	}

	/** 
	 * Returns all rows from the carritodecompras table that match the criteria 'subtotal = :subtotal'.
	 */
	public Carritodecompras[] findWhereSubtotalEquals(float subtotal) throws CarritodecomprasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE subtotal = ? ORDER BY subtotal", new Object[] {  new Float(subtotal) } );
	}

	/** 
	 * Returns all rows from the carritodecompras table that match the criteria 'precioTotal = :precioTotal'.
	 */
	public Carritodecompras[] findWherePrecioTotalEquals(float precioTotal) throws CarritodecomprasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE precioTotal = ? ORDER BY precioTotal", new Object[] {  new Float(precioTotal) } );
	}

	/** 
	 * Returns all rows from the carritodecompras table that match the criteria 'impuestos = :impuestos'.
	 */
	public Carritodecompras[] findWhereImpuestosEquals(float impuestos) throws CarritodecomprasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE impuestos = ? ORDER BY impuestos", new Object[] {  new Float(impuestos) } );
	}

	/**
	 * Method 'CarritodecomprasDaoImpl'
	 * 
	 */
	public CarritodecomprasDaoImpl()
	{
	}

	/**
	 * Method 'CarritodecomprasDaoImpl'
	 * 
	 * @param userConn
	 */
	public CarritodecomprasDaoImpl(final java.sql.Connection userConn)
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
		return "tiendaenlinea.carritodecompras";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Carritodecompras fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Carritodecompras dto = new Carritodecompras();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Carritodecompras[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Carritodecompras dto = new Carritodecompras();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Carritodecompras ret[] = new Carritodecompras[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Carritodecompras dto, ResultSet rs) throws SQLException
	{
		dto.setIdCarritoDeCompras( rs.getString( COLUMN_ID_CARRITO_DE_COMPRAS ) );
		dto.setSubtotal( rs.getFloat( COLUMN_SUBTOTAL ) );
		dto.setPrecioTotal( rs.getFloat( COLUMN_PRECIO_TOTAL ) );
		dto.setImpuestos( rs.getFloat( COLUMN_IMPUESTOS ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Carritodecompras dto)
	{
		dto.setIdCarritoDeComprasModified( false );
		dto.setSubtotalModified( false );
		dto.setPrecioTotalModified( false );
		dto.setImpuestosModified( false );
	}

	/** 
	 * Returns all rows from the carritodecompras table that match the specified arbitrary SQL statement
	 */
	public Carritodecompras[] findByDynamicSelect(String sql, Object[] sqlParams) throws CarritodecomprasDaoException
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
		
		
			System.out.println( "Executing " + SQL );
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
			_e.printStackTrace();
			throw new CarritodecomprasDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the carritodecompras table that match the specified arbitrary SQL statement
	 */
	public Carritodecompras[] findByDynamicWhere(String sql, Object[] sqlParams) throws CarritodecomprasDaoException
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
		
		
			System.out.println( "Executing " + SQL );
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
			_e.printStackTrace();
			throw new CarritodecomprasDaoException( "Exception: " + _e.getMessage(), _e );
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
