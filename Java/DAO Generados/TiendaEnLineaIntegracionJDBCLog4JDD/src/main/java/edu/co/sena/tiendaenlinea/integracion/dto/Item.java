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

public class Item implements Serializable
{
	/** 
	 * This attribute maps to the column Producto_idProducto in the item table.
	 */
	protected String productoIdproducto;

	/** 
	 * This attribute represents whether the attribute productoIdproducto has been modified since being read from the database.
	 */
	protected boolean productoIdproductoModified = false;

	/** 
	 * This attribute maps to the column Pedido_Factura_idFactura in the item table.
	 */
	protected int pedidoFacturaIdfactura;

	/** 
	 * This attribute represents whether the attribute pedidoFacturaIdfactura has been modified since being read from the database.
	 */
	protected boolean pedidoFacturaIdfacturaModified = false;

	/** 
	 * This attribute maps to the column cantidad in the item table.
	 */
	protected int cantidad;

	/** 
	 * This attribute represents whether the attribute cantidad has been modified since being read from the database.
	 */
	protected boolean cantidadModified = false;

	/** 
	 * This attribute maps to the column costoUnitario in the item table.
	 */
	protected float costoUnitario;

	/** 
	 * This attribute represents whether the attribute costoUnitario has been modified since being read from the database.
	 */
	protected boolean costoUnitarioModified = false;

	/** 
	 * This attribute maps to the column costoTotal in the item table.
	 */
	protected float costoTotal;

	/** 
	 * This attribute represents whether the attribute costoTotal has been modified since being read from the database.
	 */
	protected boolean costoTotalModified = false;

	/**
	 * Method 'Item'
	 * 
	 */
	public Item()
	{
	}

	/**
	 * Method 'getProductoIdproducto'
	 * 
	 * @return String
	 */
	public String getProductoIdproducto()
	{
		return productoIdproducto;
	}

	/**
	 * Method 'setProductoIdproducto'
	 * 
	 * @param productoIdproducto
	 */
	public void setProductoIdproducto(String productoIdproducto)
	{
		this.productoIdproducto = productoIdproducto;
		this.productoIdproductoModified = true;
	}

	/** 
	 * Sets the value of productoIdproductoModified
	 */
	public void setProductoIdproductoModified(boolean productoIdproductoModified)
	{
		this.productoIdproductoModified = productoIdproductoModified;
	}

	/** 
	 * Gets the value of productoIdproductoModified
	 */
	public boolean isProductoIdproductoModified()
	{
		return productoIdproductoModified;
	}

	/**
	 * Method 'getPedidoFacturaIdfactura'
	 * 
	 * @return int
	 */
	public int getPedidoFacturaIdfactura()
	{
		return pedidoFacturaIdfactura;
	}

	/**
	 * Method 'setPedidoFacturaIdfactura'
	 * 
	 * @param pedidoFacturaIdfactura
	 */
	public void setPedidoFacturaIdfactura(int pedidoFacturaIdfactura)
	{
		this.pedidoFacturaIdfactura = pedidoFacturaIdfactura;
		this.pedidoFacturaIdfacturaModified = true;
	}

	/** 
	 * Sets the value of pedidoFacturaIdfacturaModified
	 */
	public void setPedidoFacturaIdfacturaModified(boolean pedidoFacturaIdfacturaModified)
	{
		this.pedidoFacturaIdfacturaModified = pedidoFacturaIdfacturaModified;
	}

	/** 
	 * Gets the value of pedidoFacturaIdfacturaModified
	 */
	public boolean isPedidoFacturaIdfacturaModified()
	{
		return pedidoFacturaIdfacturaModified;
	}

	/**
	 * Method 'getCantidad'
	 * 
	 * @return int
	 */
	public int getCantidad()
	{
		return cantidad;
	}

	/**
	 * Method 'setCantidad'
	 * 
	 * @param cantidad
	 */
	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
		this.cantidadModified = true;
	}

	/** 
	 * Sets the value of cantidadModified
	 */
	public void setCantidadModified(boolean cantidadModified)
	{
		this.cantidadModified = cantidadModified;
	}

	/** 
	 * Gets the value of cantidadModified
	 */
	public boolean isCantidadModified()
	{
		return cantidadModified;
	}

	/**
	 * Method 'getCostoUnitario'
	 * 
	 * @return float
	 */
	public float getCostoUnitario()
	{
		return costoUnitario;
	}

	/**
	 * Method 'setCostoUnitario'
	 * 
	 * @param costoUnitario
	 */
	public void setCostoUnitario(float costoUnitario)
	{
		this.costoUnitario = costoUnitario;
		this.costoUnitarioModified = true;
	}

	/** 
	 * Sets the value of costoUnitarioModified
	 */
	public void setCostoUnitarioModified(boolean costoUnitarioModified)
	{
		this.costoUnitarioModified = costoUnitarioModified;
	}

	/** 
	 * Gets the value of costoUnitarioModified
	 */
	public boolean isCostoUnitarioModified()
	{
		return costoUnitarioModified;
	}

	/**
	 * Method 'getCostoTotal'
	 * 
	 * @return float
	 */
	public float getCostoTotal()
	{
		return costoTotal;
	}

	/**
	 * Method 'setCostoTotal'
	 * 
	 * @param costoTotal
	 */
	public void setCostoTotal(float costoTotal)
	{
		this.costoTotal = costoTotal;
		this.costoTotalModified = true;
	}

	/** 
	 * Sets the value of costoTotalModified
	 */
	public void setCostoTotalModified(boolean costoTotalModified)
	{
		this.costoTotalModified = costoTotalModified;
	}

	/** 
	 * Gets the value of costoTotalModified
	 */
	public boolean isCostoTotalModified()
	{
		return costoTotalModified;
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
		
		if (!(_other instanceof Item)) {
			return false;
		}
		
		final Item _cast = (Item) _other;
		if (productoIdproducto == null ? _cast.productoIdproducto != productoIdproducto : !productoIdproducto.equals( _cast.productoIdproducto )) {
			return false;
		}
		
		if (productoIdproductoModified != _cast.productoIdproductoModified) {
			return false;
		}
		
		if (pedidoFacturaIdfactura != _cast.pedidoFacturaIdfactura) {
			return false;
		}
		
		if (pedidoFacturaIdfacturaModified != _cast.pedidoFacturaIdfacturaModified) {
			return false;
		}
		
		if (cantidad != _cast.cantidad) {
			return false;
		}
		
		if (cantidadModified != _cast.cantidadModified) {
			return false;
		}
		
		if (costoUnitario != _cast.costoUnitario) {
			return false;
		}
		
		if (costoUnitarioModified != _cast.costoUnitarioModified) {
			return false;
		}
		
		if (costoTotal != _cast.costoTotal) {
			return false;
		}
		
		if (costoTotalModified != _cast.costoTotalModified) {
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
		
		_hashCode = 29 * _hashCode + (productoIdproductoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + pedidoFacturaIdfactura;
		_hashCode = 29 * _hashCode + (pedidoFacturaIdfacturaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + cantidad;
		_hashCode = 29 * _hashCode + (cantidadModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(costoUnitario);
		_hashCode = 29 * _hashCode + (costoUnitarioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(costoTotal);
		_hashCode = 29 * _hashCode + (costoTotalModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ItemPk
	 */
	public ItemPk createPk()
	{
		return new ItemPk(productoIdproducto, pedidoFacturaIdfactura);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.tiendaenlinea.integracion.dto.Item: " );
		ret.append( "productoIdproducto=" + productoIdproducto );
		ret.append( ", pedidoFacturaIdfactura=" + pedidoFacturaIdfactura );
		ret.append( ", cantidad=" + cantidad );
		ret.append( ", costoUnitario=" + costoUnitario );
		ret.append( ", costoTotal=" + costoTotal );
		return ret.toString();
	}

}
