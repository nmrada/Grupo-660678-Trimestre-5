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
 * This class represents the primary key of the item table.
 */
public class ItemPk implements Serializable
{
	protected String productoIdproducto;

	protected int pedidoFacturaIdfactura;

	/** 
	 * This attribute represents whether the primitive attribute pedidoFacturaIdfactura is null.
	 */
	protected boolean pedidoFacturaIdfacturaNull;

	/** 
	 * Sets the value of productoIdproducto
	 */
	public void setProductoIdproducto(String productoIdproducto)
	{
		this.productoIdproducto = productoIdproducto;
	}

	/** 
	 * Gets the value of productoIdproducto
	 */
	public String getProductoIdproducto()
	{
		return productoIdproducto;
	}

	/** 
	 * Sets the value of pedidoFacturaIdfactura
	 */
	public void setPedidoFacturaIdfactura(int pedidoFacturaIdfactura)
	{
		this.pedidoFacturaIdfactura = pedidoFacturaIdfactura;
	}

	/** 
	 * Gets the value of pedidoFacturaIdfactura
	 */
	public int getPedidoFacturaIdfactura()
	{
		return pedidoFacturaIdfactura;
	}

	/**
	 * Method 'ItemPk'
	 * 
	 */
	public ItemPk()
	{
	}

	/**
	 * Method 'ItemPk'
	 * 
	 * @param productoIdproducto
	 * @param pedidoFacturaIdfactura
	 */
	public ItemPk(final String productoIdproducto, final int pedidoFacturaIdfactura)
	{
		this.productoIdproducto = productoIdproducto;
		this.pedidoFacturaIdfactura = pedidoFacturaIdfactura;
	}

	/** 
	 * Sets the value of pedidoFacturaIdfacturaNull
	 */
	public void setPedidoFacturaIdfacturaNull(boolean pedidoFacturaIdfacturaNull)
	{
		this.pedidoFacturaIdfacturaNull = pedidoFacturaIdfacturaNull;
	}

	/** 
	 * Gets the value of pedidoFacturaIdfacturaNull
	 */
	public boolean isPedidoFacturaIdfacturaNull()
	{
		return pedidoFacturaIdfacturaNull;
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
		
		if (!(_other instanceof ItemPk)) {
			return false;
		}
		
		final ItemPk _cast = (ItemPk) _other;
		if (productoIdproducto == null ? _cast.productoIdproducto != productoIdproducto : !productoIdproducto.equals( _cast.productoIdproducto )) {
			return false;
		}
		
		if (pedidoFacturaIdfactura != _cast.pedidoFacturaIdfactura) {
			return false;
		}
		
		if (pedidoFacturaIdfacturaNull != _cast.pedidoFacturaIdfacturaNull) {
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
		if (productoIdproducto != null) {
			_hashCode = 29 * _hashCode + productoIdproducto.hashCode();
		}
		
		_hashCode = 29 * _hashCode + pedidoFacturaIdfactura;
		_hashCode = 29 * _hashCode + (pedidoFacturaIdfacturaNull ? 1 : 0);
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
		ret.append( "edu.co.sena.tiendaenlinea.integracion.dto.ItemPk: " );
		ret.append( "productoIdproducto=" + productoIdproducto );
		ret.append( ", pedidoFacturaIdfactura=" + pedidoFacturaIdfactura );
		return ret.toString();
	}

}
