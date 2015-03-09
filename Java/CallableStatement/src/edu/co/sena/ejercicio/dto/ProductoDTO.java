/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio.dto;

/**
 *
 * @author ColsutecR
 */
public class ProductoDTO implements java.io.Serializable{
    private String idProducto;
    private String nombre;
    private String marca;
    private String referencia;
    private String descripcion;
    private String material;
    private String color;
    private int cantidad;
    private short activo;
    private double precioUnitario;
    private double descuento;
    private int categoria_idCategoria;
    private int categoria_idCatalogo;

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public short getActivo() {
        return activo;
    }

    public void setActivo(short activo) {
        this.activo = activo;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getCategoria_idCategoria() {
        return categoria_idCategoria;
    }

    public void setCategoria_idCategoria(int categoria_idCategoria) {
        this.categoria_idCategoria = categoria_idCategoria;
    }

    public int getCategoria_idCatalogo() {
        return categoria_idCatalogo;
    }

    public void setCategoria_idCatalogo(int categoria_idCatalogo) {
        this.categoria_idCatalogo = categoria_idCatalogo;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", marca=" + marca + ", referencia=" + referencia + ", descripcion=" + descripcion + ", material=" + material + ", color=" + color + ", cantidad=" + cantidad + ", activo=" + activo + ", precioUnitario=" + precioUnitario + ", descuento=" + descuento + ", categoria_idCategoria=" + categoria_idCategoria + ", categoria_idCatalogo=" + categoria_idCatalogo + '}';
    }

}
