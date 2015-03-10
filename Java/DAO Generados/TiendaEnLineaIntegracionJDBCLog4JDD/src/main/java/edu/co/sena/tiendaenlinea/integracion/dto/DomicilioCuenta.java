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

public class DomicilioCuenta implements Serializable
{
	/** 
	 * This attribute maps to the column Cuenta_tipoDocumento in the domicilio_cuenta table.
	 */
	protected String cuentaTipodocumento;

	/** 
	 * This attribute represents whether the attribute cuentaTipodocumento has been modified since being read from the database.
	 */
	protected boolean cuentaTipodocumentoModified = false;

	/** 
	 * This attribute maps to the column Cuenta_numeroDocumento in the domicilio_cuenta table.
	 */
	protected String cuentaNumerodocumento;

	/** 
	 * This attribute represents whether the attribute cuentaNumerodocumento has been modified since being read from the database.
	 */
	protected boolean cuentaNumerodocumentoModified = false;

	/** 
	 * This attribute maps to the column telefono in the domicilio_cuenta table.
	 */
	protected String telefono;

	/** 
	 * This attribute represents whether the attribute telefono has been modified since being read from the database.
	 */
	protected boolean telefonoModified = false;

	/** 
	 * This attribute maps to the column direccion in the domicilio_cuenta table.
	 */
	protected String direccion;

	/** 
	 * This attribute represents whether the attribute direccion has been modified since being read from the database.
	 */
	protected boolean direccionModified = false;

	/** 
	 * This attribute maps to the column barrio in the domicilio_cuenta table.
	 */
	protected String barrio;

	/** 
	 * This attribute represents whether the attribute barrio has been modified since being read from the database.
	 */
	protected boolean barrioModified = false;

	/** 
	 * This attribute maps to the column localidad in the domicilio_cuenta table.
	 */
	protected String localidad;

	/** 
	 * This attribute represents whether the attribute localidad has been modified since being read from the database.
	 */
	protected boolean localidadModified = false;

	/** 
	 * This attribute maps to the column Municipio_idMunicipio in the domicilio_cuenta table.
	 */
	protected String municipioIdmunicipio;

	/** 
	 * This attribute represents whether the attribute municipioIdmunicipio has been modified since being read from the database.
	 */
	protected boolean municipioIdmunicipioModified = false;

	/**
	 * Method 'DomicilioCuenta'
	 * 
	 */
	public DomicilioCuenta()
	{
	}

	/**
	 * Method 'getCuentaTipodocumento'
	 * 
	 * @return String
	 */
	public String getCuentaTipodocumento()
	{
		return cuentaTipodocumento;
	}

	/**
	 * Method 'setCuentaTipodocumento'
	 * 
	 * @param cuentaTipodocumento
	 */
	public void setCuentaTipodocumento(String cuentaTipodocumento)
	{
		this.cuentaTipodocumento = cuentaTipodocumento;
		this.cuentaTipodocumentoModified = true;
	}

	/** 
	 * Sets the value of cuentaTipodocumentoModified
	 */
	public void setCuentaTipodocumentoModified(boolean cuentaTipodocumentoModified)
	{
		this.cuentaTipodocumentoModified = cuentaTipodocumentoModified;
	}

	/** 
	 * Gets the value of cuentaTipodocumentoModified
	 */
	public boolean isCuentaTipodocumentoModified()
	{
		return cuentaTipodocumentoModified;
	}

	/**
	 * Method 'getCuentaNumerodocumento'
	 * 
	 * @return String
	 */
	public String getCuentaNumerodocumento()
	{
		return cuentaNumerodocumento;
	}

	/**
	 * Method 'setCuentaNumerodocumento'
	 * 
	 * @param cuentaNumerodocumento
	 */
	public void setCuentaNumerodocumento(String cuentaNumerodocumento)
	{
		this.cuentaNumerodocumento = cuentaNumerodocumento;
		this.cuentaNumerodocumentoModified = true;
	}

	/** 
	 * Sets the value of cuentaNumerodocumentoModified
	 */
	public void setCuentaNumerodocumentoModified(boolean cuentaNumerodocumentoModified)
	{
		this.cuentaNumerodocumentoModified = cuentaNumerodocumentoModified;
	}

	/** 
	 * Gets the value of cuentaNumerodocumentoModified
	 */
	public boolean isCuentaNumerodocumentoModified()
	{
		return cuentaNumerodocumentoModified;
	}

	/**
	 * Method 'getTelefono'
	 * 
	 * @return String
	 */
	public String getTelefono()
	{
		return telefono;
	}

	/**
	 * Method 'setTelefono'
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
		this.telefonoModified = true;
	}

	/** 
	 * Sets the value of telefonoModified
	 */
	public void setTelefonoModified(boolean telefonoModified)
	{
		this.telefonoModified = telefonoModified;
	}

	/** 
	 * Gets the value of telefonoModified
	 */
	public boolean isTelefonoModified()
	{
		return telefonoModified;
	}

	/**
	 * Method 'getDireccion'
	 * 
	 * @return String
	 */
	public String getDireccion()
	{
		return direccion;
	}

	/**
	 * Method 'setDireccion'
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
		this.direccionModified = true;
	}

	/** 
	 * Sets the value of direccionModified
	 */
	public void setDireccionModified(boolean direccionModified)
	{
		this.direccionModified = direccionModified;
	}

	/** 
	 * Gets the value of direccionModified
	 */
	public boolean isDireccionModified()
	{
		return direccionModified;
	}

	/**
	 * Method 'getBarrio'
	 * 
	 * @return String
	 */
	public String getBarrio()
	{
		return barrio;
	}

	/**
	 * Method 'setBarrio'
	 * 
	 * @param barrio
	 */
	public void setBarrio(String barrio)
	{
		this.barrio = barrio;
		this.barrioModified = true;
	}

	/** 
	 * Sets the value of barrioModified
	 */
	public void setBarrioModified(boolean barrioModified)
	{
		this.barrioModified = barrioModified;
	}

	/** 
	 * Gets the value of barrioModified
	 */
	public boolean isBarrioModified()
	{
		return barrioModified;
	}

	/**
	 * Method 'getLocalidad'
	 * 
	 * @return String
	 */
	public String getLocalidad()
	{
		return localidad;
	}

	/**
	 * Method 'setLocalidad'
	 * 
	 * @param localidad
	 */
	public void setLocalidad(String localidad)
	{
		this.localidad = localidad;
		this.localidadModified = true;
	}

	/** 
	 * Sets the value of localidadModified
	 */
	public void setLocalidadModified(boolean localidadModified)
	{
		this.localidadModified = localidadModified;
	}

	/** 
	 * Gets the value of localidadModified
	 */
	public boolean isLocalidadModified()
	{
		return localidadModified;
	}

	/**
	 * Method 'getMunicipioIdmunicipio'
	 * 
	 * @return String
	 */
	public String getMunicipioIdmunicipio()
	{
		return municipioIdmunicipio;
	}

	/**
	 * Method 'setMunicipioIdmunicipio'
	 * 
	 * @param municipioIdmunicipio
	 */
	public void setMunicipioIdmunicipio(String municipioIdmunicipio)
	{
		this.municipioIdmunicipio = municipioIdmunicipio;
		this.municipioIdmunicipioModified = true;
	}

	/** 
	 * Sets the value of municipioIdmunicipioModified
	 */
	public void setMunicipioIdmunicipioModified(boolean municipioIdmunicipioModified)
	{
		this.municipioIdmunicipioModified = municipioIdmunicipioModified;
	}

	/** 
	 * Gets the value of municipioIdmunicipioModified
	 */
	public boolean isMunicipioIdmunicipioModified()
	{
		return municipioIdmunicipioModified;
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
		
		if (!(_other instanceof DomicilioCuenta)) {
			return false;
		}
		
		final DomicilioCuenta _cast = (DomicilioCuenta) _other;
		if (cuentaTipodocumento == null ? _cast.cuentaTipodocumento != cuentaTipodocumento : !cuentaTipodocumento.equals( _cast.cuentaTipodocumento )) {
			return false;
		}
		
		if (cuentaTipodocumentoModified != _cast.cuentaTipodocumentoModified) {
			return false;
		}
		
		if (cuentaNumerodocumento == null ? _cast.cuentaNumerodocumento != cuentaNumerodocumento : !cuentaNumerodocumento.equals( _cast.cuentaNumerodocumento )) {
			return false;
		}
		
		if (cuentaNumerodocumentoModified != _cast.cuentaNumerodocumentoModified) {
			return false;
		}
		
		if (telefono == null ? _cast.telefono != telefono : !telefono.equals( _cast.telefono )) {
			return false;
		}
		
		if (telefonoModified != _cast.telefonoModified) {
			return false;
		}
		
		if (direccion == null ? _cast.direccion != direccion : !direccion.equals( _cast.direccion )) {
			return false;
		}
		
		if (direccionModified != _cast.direccionModified) {
			return false;
		}
		
		if (barrio == null ? _cast.barrio != barrio : !barrio.equals( _cast.barrio )) {
			return false;
		}
		
		if (barrioModified != _cast.barrioModified) {
			return false;
		}
		
		if (localidad == null ? _cast.localidad != localidad : !localidad.equals( _cast.localidad )) {
			return false;
		}
		
		if (localidadModified != _cast.localidadModified) {
			return false;
		}
		
		if (municipioIdmunicipio == null ? _cast.municipioIdmunicipio != municipioIdmunicipio : !municipioIdmunicipio.equals( _cast.municipioIdmunicipio )) {
			return false;
		}
		
		if (municipioIdmunicipioModified != _cast.municipioIdmunicipioModified) {
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
		if (cuentaTipodocumento != null) {
			_hashCode = 29 * _hashCode + cuentaTipodocumento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (cuentaTipodocumentoModified ? 1 : 0);
		if (cuentaNumerodocumento != null) {
			_hashCode = 29 * _hashCode + cuentaNumerodocumento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (cuentaNumerodocumentoModified ? 1 : 0);
		if (telefono != null) {
			_hashCode = 29 * _hashCode + telefono.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (telefonoModified ? 1 : 0);
		if (direccion != null) {
			_hashCode = 29 * _hashCode + direccion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (direccionModified ? 1 : 0);
		if (barrio != null) {
			_hashCode = 29 * _hashCode + barrio.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (barrioModified ? 1 : 0);
		if (localidad != null) {
			_hashCode = 29 * _hashCode + localidad.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (localidadModified ? 1 : 0);
		if (municipioIdmunicipio != null) {
			_hashCode = 29 * _hashCode + municipioIdmunicipio.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (municipioIdmunicipioModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return DomicilioCuentaPk
	 */
	public DomicilioCuentaPk createPk()
	{
		return new DomicilioCuentaPk(cuentaTipodocumento, cuentaNumerodocumento);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.tiendaenlinea.integracion.dto.DomicilioCuenta: " );
		ret.append( "cuentaTipodocumento=" + cuentaTipodocumento );
		ret.append( ", cuentaNumerodocumento=" + cuentaNumerodocumento );
		ret.append( ", telefono=" + telefono );
		ret.append( ", direccion=" + direccion );
		ret.append( ", barrio=" + barrio );
		ret.append( ", localidad=" + localidad );
		ret.append( ", municipioIdmunicipio=" + municipioIdmunicipio );
		return ret.toString();
	}

}