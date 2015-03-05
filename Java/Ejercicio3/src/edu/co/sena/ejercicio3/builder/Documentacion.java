/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas
 */
public abstract class Documentacion {

    protected List<String> contenido = new ArrayList<>();

    public abstract void agregarDocumento(String documento);

    public abstract void imprime();

}
