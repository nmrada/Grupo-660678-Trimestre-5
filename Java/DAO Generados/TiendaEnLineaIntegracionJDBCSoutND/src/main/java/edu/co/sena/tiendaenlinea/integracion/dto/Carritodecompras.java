/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.dto;

import edu.co.sena.tiendaenlinea.integracion.dao.*;
import edu.co.sena.tiendaenlinea.integracion.factory.*;
import edu.co.sena.tiendaenlinea.integracion.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Carritodecompras implements Serializable
{
	/** 
	 * This attribute maps to the column idCarritoDeCompras in the carritodecompras table.
	 */
	protected String idCarritoDeCompras;

	/** 
	 * This attribute maps to the column subtotal in the carritodecompras table.
	 */
	protected float subtotal;

	/** 
	 * This attribute maps to the column precioTotal in the carritodecompras table.
	 */
	protected float precioTotal;

	/** 
	 * This attribute maps to the column impuestos in the carritodecompras table.
	 */
	protected float impuestos;

	/**
	 * Method 'Carritodecompras'
	 * 
	 */
	public Carritodecompras()
	{
	}

	/**
	 * Method 'getIdCarritoDeCompras'
	 * 
	 * @return String
	 */
	public String getIdCarritoDeCompras()
	{
		return idCarritoDeCompras;
	}

	/**
	 * Method 'setIdCarritoDeCompras'
	 * 
	 * @param idCarritoDeCompras
	 */
	public void setIdCarritoDeCompras(String idCarritoDeCompras)
	{
		this.idCarritoDeCompras = idCarritoDeCompras;
	}

	/**
	 * Method 'getSubtotal'
	 * 
	 * @return float
	 */
	public float getSubtotal()
	{
		return subtotal;
	}

	/**
	 * Method 'setSubtotal'
	 * 
	 * @param subtotal
	 */
	public void setSubtotal(float subtotal)
	{
		this.subtotal = subtotal;
	}

	/**
	 * Method 'getPrecioTotal'
	 * 
	 * @return float
	 */
	public float getPrecioTotal()
	{
		return precioTotal;
	}

	/**
	 * Method 'setPrecioTotal'
	 * 
	 * @param precioTotal
	 */
	public void setPrecioTotal(float precioTotal)
	{
		this.precioTotal = precioTotal;
	}

	/**
	 * Method 'getImpuestos'
	 * 
	 * @return float
	 */
	public float getImpuestos()
	{
		return impuestos;
	}

	/**
	 * Method 'setImpuestos'
	 * 
	 * @param impuestos
	 */
	public void setImpuestos(float impuestos)
	{
		this.impuestos = impuestos;
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
		
		if (!(_other instanceof Carritodecompras)) {
			return false;
		}
		
		final Carritodecompras _cast = (Carritodecompras) _other;
		if (idCarritoDeCompras == null ? _cast.idCarritoDeCompras != idCarritoDeCompras : !idCarritoDeCompras.equals( _cast.idCarritoDeCompras )) {
			return false;
		}
		
		if (subtotal != _cast.subtotal) {
			return false;
		}
		
		if (precioTotal != _cast.precioTotal) {
			return false;
		}
		
		if (impuestos != _cast.impuestos) {
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
		if (idCarritoDeCompras != null) {
			_hashCode = 29 * _hashCode + idCarritoDeCompras.hashCode();
		}
		
		_hashCode = 29 * _hashCode + Float.floatToIntBits(subtotal);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(precioTotal);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(impuestos);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CarritodecomprasPk
	 */
	public CarritodecomprasPk createPk()
	{
		return new CarritodecomprasPk(idCarritoDeCompras);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.tiendaenlinea.integracion.dto.Carritodecompras: " );
		ret.append( "idCarritoDeCompras=" + idCarritoDeCompras );
		ret.append( ", subtotal=" + subtotal );
		ret.append( ", precioTotal=" + precioTotal );
		ret.append( ", impuestos=" + impuestos );
		return ret.toString();
	}

}
