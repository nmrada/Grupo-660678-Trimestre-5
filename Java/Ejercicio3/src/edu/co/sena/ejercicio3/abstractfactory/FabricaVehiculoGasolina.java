/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.abstractfactory;

import edu.co.sena.ejercicio3.abstractfactory.modelo.AutomovilDTO;
import edu.co.sena.ejercicio3.abstractfactory.modelo.AutomovilGasolinaDTO;
import edu.co.sena.ejercicio3.abstractfactory.modelo.ScooterDTO;
import edu.co.sena.ejercicio3.abstractfactory.modelo.ScooterGasolinaDTO;

/**
 *
 * @author colsutec R
 */
public class FabricaVehiculoGasolina implements FabricaVehiculo{

    @Override
    public AutomovilDTO creaAutomovil() {
        return new AutomovilGasolinaDTO();
    }

    @Override
    public ScooterDTO creaScooter() {
        return new ScooterGasolinaDTO();
    }

    
}
