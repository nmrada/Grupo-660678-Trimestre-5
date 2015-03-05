/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.abstractfactory;

import edu.co.sena.ejercicio3.abstractfactory.modelo.AutomovilElectricidadDTO;
import edu.co.sena.ejercicio3.abstractfactory.modelo.AutomovilDTO;
import edu.co.sena.ejercicio3.abstractfactory.modelo.AutomovilGasolinaDTO;
import edu.co.sena.ejercicio3.abstractfactory.modelo.ScooterDTO;
import edu.co.sena.ejercicio3.abstractfactory.modelo.ScooterElectricidadDTO;

/**
 *
 * @author colsutec R
 */
public class FabricaVehiculoElectricidad implements FabricaVehiculo {

    @Override
    public AutomovilDTO creaAutomovil() {
        return new AutomovilElectricidadDTO();
    }

    @Override
    public ScooterDTO creaScooter() {
        return new ScooterElectricidadDTO();
    
    }

}
