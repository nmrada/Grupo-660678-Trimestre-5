/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.abstractfactory.modelo;

/**
 *
 * @author colsutec R
 */
public class AutomovilGasolinaDTO extends AutomovilDTO {
    private String capacidadTanque;

    public String getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(String capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public String toString() {
        return "AutomovilGasolinaDTO{" 
                + "Placa: " + this.getPlaca()
                + ", Color: " + this.getColor()
                + ", Modelo: " + this.getModelo()
                + ", Pasajeros: " + this.getPasajero()
                + ", Capacidad del Tanque: " + capacidadTanque + '}';
    }
    
    
}
