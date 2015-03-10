/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the municipio table.
 */
public class MunicipioPk implements Serializable
{
	protected String idMunicipio;

	/** 
	 * Sets the value of idMunicipio
	 */
	public void setIdMunicipio(String idMunicipio)
	{
		this.idMunicipio = idMunicipio;
	}

	/** 
	 * Gets the value of idMunicipio
	 */
	public String getIdMunicipio()
	{
		return idMunicipio;
	}

	/**
	 * Method 'MunicipioPk'
	 * 
	 */
	public MunicipioPk()
	{
	}

	/**
	 * Method 'MunicipioPk'
	 * 
	 * @param idMunicipio
	 */
	public MunicipioPk(final String idMunicipio)
	{
		this.idMunicipio = idMunicipio;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof MunicipioPk)) {
			return false;
		}
		
		final MunicipioPk _cast = (MunicipioPk) _other;
		if (idMunicipio == null ? _cast.idMunicipio != idMunicipio : !idMunicipio.equals( _cast.idMunicipio )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (idMunicipio != null) {
			_hashCode = 29 * _hashCode + idMunicipio.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.tiendaenlinea.integracion.dto.MunicipioPk: " );
		ret.append( "idMunicipio=" + idMunicipio );
		return ret.toString();
	}

}
