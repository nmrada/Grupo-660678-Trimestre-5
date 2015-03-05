/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.facade;

import java.util.List;

/**
 *
 * @author Nicolas
 */
public class WebServiceAutoImpl implements WebServiceAuto {

    protected Catalogo catalogo = new ComponenteCatalogo();
    protected GestionDocumento gestionDocumento = new ComponenteGestionDocumento();

    public WebServiceAutoImpl() {
    }

    @Override
    public String documento(int indice) {
        return gestionDocumento.documento(indice);
    }

    @Override
    public List<String> buscaVehiculos(int precioMedio, int desviacionMax) {
        return catalogo.buscaVehiculos(precioMedio - desviacionMax, precioMedio + desviacionMax);
    }

}
