/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.abstractfactory;

import edu.co.sena.ejercicio3.abstractfactory.modelo.AutomovilDTO;
import edu.co.sena.ejercicio3.abstractfactory.modelo.ScooterDTO;

/**
 *
 * @author colsutec R
 */
public interface FabricaVehiculo {
    public abstract AutomovilDTO creaAutomovil();
    public abstract ScooterDTO creaScooter();
}
