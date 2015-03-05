/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio4.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas
 */
public class VehiculoSolicitado {
    protected List<OpcionVehiculo> opciones = new ArrayList<>();
    protected List<Integer> precioDeVentaOpciones = new ArrayList<>();

    public VehiculoSolicitado() {
    }
    
    public void agregaOpciones(String nombre, int precioDeVenta, FabricaOpcion fabrica){
        opciones.add(fabrica.getOpcion(nombre));
        precioDeVentaOpciones.add(precioDeVenta);
        System.out.println(fabrica.getOpcion(nombre));
        System.out.println(opciones.size());
    }
    
    public void muestraOpcionesa(){
        int indice, tamano;
        tamano = opciones.size();
        for (indice = 0; indice < tamano; indice ++) {
            opciones.get(indice).visualiza(precioDeVentaOpciones.get(indice));
            System.out.println("");
        }
    }
}
