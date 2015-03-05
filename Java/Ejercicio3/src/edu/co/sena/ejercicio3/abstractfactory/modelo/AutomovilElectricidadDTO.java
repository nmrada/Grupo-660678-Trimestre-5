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
public class AutomovilElectricidadDTO extends AutomovilDTO {

    private String amperaje;
    private String voltaje;

    public String getAmperaje() {
        return amperaje;
    }

    public void setAmperaje(String amperaje) {
        this.amperaje = amperaje;
    }

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    @Override
    public String toString() {
        return "AuntomovilElectricidadDTO{"
                + "Placa: " + this.getPlaca()
                + ", Color: " + this.getColor()
                + ", Modelo: " + this.getModelo()
                + ", Pasajeros: " + this.getPasajero()
                + ", Amperaje: " + amperaje 
                + ", Voltaje: " + voltaje + '}';
    }

}
