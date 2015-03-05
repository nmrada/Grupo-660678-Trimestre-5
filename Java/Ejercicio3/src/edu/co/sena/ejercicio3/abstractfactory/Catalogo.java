/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.abstractfactory;

import edu.co.sena.ejercicio3.abstractfactory.modelo.AutomovilElectricidadDTO;
import edu.co.sena.ejercicio3.abstractfactory.modelo.ScooterGasolinaDTO;

/**
 *
 * @author colsutec R
 */
public class Catalogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaVehiculo fabricaE = new FabricaVehiculoElectricidad();
        AutomovilElectricidadDTO autoE1 = (AutomovilElectricidadDTO)fabricaE.creaAutomovil();
        autoE1.setPlaca("ABC123");
        autoE1.setModelo("2015");
        autoE1.setColor("Negro");
        autoE1.setPasajero(4);
        autoE1.setAmperaje("110A");
        autoE1.setVoltaje("110V");
        System.out.println(autoE1.toString());
        System.out.println("");
        FabricaVehiculoGasolina fabricaG = new FabricaVehiculoGasolina();
        ScooterGasolinaDTO scooterG1 = (ScooterGasolinaDTO)fabricaG.creaScooter();
        scooterG1.setPlaca("DVC456");
        scooterG1.setColor("Azul");
        scooterG1.setModelo("2015");
        scooterG1.setPasajero(2);
        scooterG1.setCapacidadTanque("18");
        System.out.println(scooterG1.toString());
       
        
        
        
        
    }
    
}
