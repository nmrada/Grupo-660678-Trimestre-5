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

public class CategoriaDaoImpl extends AbstractDAO implements CategoriaDao
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
	protected final String SQL_SELECT = "SELECT idCategoria, nombreCategoria, activa, pariente FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idCategoria, nombreCategoria, activa, pariente ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idCategoria = ?, nombreCategoria = ?, activa = ?, pariente = ? WHERE idCategoria = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idCategoria = ?";

	/** 
	 * Index of column idCategoria
	 */
	protected static final int COLUMN_ID_CATEGORIA = 1;

	/** 
	 * Index of column nombreCategoria
	 */
	protected static final int COLUMN_NOMBRE_CATEGORIA = 2;

	/** 
	 * Index of column activa
	 */
	protected static final int COLUMN_ACTIVA = 3;

	/** 
	 * Index of column pariente
	 */
	protected static final int COLUMN_PARIENTE = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column idCategoria
	 */
	protected static final int PK_COLUMN_ID_CATEGORIA = 1;

	/** 
	 * Inserts a new row in the categoria table.
	 */
	public CategoriaPk insert(Categoria dto) throws CategoriaDaoException
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
			if (dto.isIdCategoriaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "idCategoria" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreCategoriaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "nombreCategoria" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isActivaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "activa" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isParienteModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "pariente" );
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
			if (dto.isIdCategoriaModified()) {
				stmt.setInt( index++, dto.getIdCategoria() );
			}
		
			if (dto.isNombreCategoriaModified()) {
				stmt.setString( index++, dto.getNombreCategoria() );
			}
		
			if (dto.isActivaModified()) {
				stmt.setShort( index++, dto.getActiva() );
			}
		
			if (dto.isParienteModified()) {
				stmt.setInt( index++, dto.getPariente() );
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
			throw new CategoriaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the categoria table.
	 */
	public void update(CategoriaPk pk, Categoria dto) throws CategoriaDaoException
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
			if (dto.isIdCategoriaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "idCategoria=?" );
				modified=true;
			}
		
			if (dto.isNombreCategoriaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "nombreCategoria=?" );
				modified=true;
			}
		
			if (dto.isActivaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "activa=?" );
				modified=true;
			}
		
			if (dto.isParienteModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "pariente=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE idCategoria=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdCategoriaModified()) {
				stmt.setInt( index++, dto.getIdCategoria() );
			}
		
			if (dto.isNombreCategoriaModified()) {
				stmt.setString( index++, dto.getNombreCategoria() );
			}
		
			if (dto.isActivaModified()) {
				stmt.setShort( index++, dto.getActiva() );
			}
		
			if (dto.isParienteModified()) {
				stmt.setInt( index++, dto.getPariente() );
			}
		
			stmt.setInt( index++, pk.getIdCategoria() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CategoriaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the categoria table.
	 */
	public void delete(CategoriaPk pk) throws CategoriaDaoException
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
			stmt.setInt( 1, pk.getIdCategoria() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CategoriaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the categoria table that matches the specified primary-key value.
	 */
	public Categoria findByPrimaryKey(CategoriaPk pk) throws CategoriaDaoException
	{
		return findByPrimaryKey( pk.getIdCategoria() );
	}

	/** 
	 * Returns all rows from the categoria table that match the criteria 'idCategoria = :idCategoria'.
	 */
	public Categoria findByPrimaryKey(int idCategoria) throws CategoriaDaoException
	{
		Categoria ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idCategoria = ?", new Object[] {  new Integer(idCategoria) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the categoria table that match the criteria ''.
	 */
	public Categoria[] findAll() throws CategoriaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idCategoria", null );
	}

	/** 
	 * Returns all rows from the categoria table that match the criteria 'idCategoria = :idCategoria'.
	 */
	public Categoria[] findWhereIdCategoriaEquals(int idCategoria) throws CategoriaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idCategoria = ? ORDER BY idCategoria", new Object[] {  new Integer(idCategoria) } );
	}

	/** 
	 * Returns all rows from the categoria table that match the criteria 'nombreCategoria = :nombreCategoria'.
	 */
	public Categoria[] findWhereNombreCategoriaEquals(String nombreCategoria) throws CategoriaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE nombreCategoria = ? ORDER BY nombreCategoria", new Object[] { nombreCategoria } );
	}

	/** 
	 * Returns all rows from the categoria table that match the criteria 'activa = :activa'.
	 */
	public Categoria[] findWhereActivaEquals(short activa) throws CategoriaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE activa = ? ORDER BY activa", new Object[] {  new Short(activa) } );
	}

	/** 
	 * Returns all rows from the categoria table that match the criteria 'pariente = :pariente'.
	 */
	public Categoria[] findWhereParienteEquals(int pariente) throws CategoriaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE pariente = ? ORDER BY pariente", new Object[] {  new Integer(pariente) } );
	}

	/**
	 * Method 'CategoriaDaoImpl'
	 * 
	 */
	public CategoriaDaoImpl()
	{
	}

	/**
	 * Method 'CategoriaDaoImpl'
	 * 
	 * @param userConn
	 */
	public CategoriaDaoImpl(final java.sql.Connection userConn)
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
		return "tiendaenlinea.categoria";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Categoria fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Categoria dto = new Categoria();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Categoria[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Categoria dto = new Categoria();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Categoria ret[] = new Categoria[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Categoria dto, ResultSet rs) throws SQLException
	{
		dto.setIdCategoria( rs.getInt( COLUMN_ID_CATEGORIA ) );
		dto.setNombreCategoria( rs.getString( COLUMN_NOMBRE_CATEGORIA ) );
		dto.setActiva( rs.getShort( COLUMN_ACTIVA ) );
		dto.setPariente( rs.getInt( COLUMN_PARIENTE ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Categoria dto)
	{
		dto.setIdCategoriaModified( false );
		dto.setNombreCategoriaModified( false );
		dto.setActivaModified( false );
		dto.setParienteModified( false );
	}

	/** 
	 * Returns all rows from the categoria table that match the specified arbitrary SQL statement
	 */
	public Categoria[] findByDynamicSelect(String sql, Object[] sqlParams) throws CategoriaDaoException
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
			throw new CategoriaDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the categoria table that match the specified arbitrary SQL statement
	 */
	public Categoria[] findByDynamicWhere(String sql, Object[] sqlParams) throws CategoriaDaoException
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
			throw new CategoriaDaoException( "Exception: " + _e.getMessage(), _e );
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
