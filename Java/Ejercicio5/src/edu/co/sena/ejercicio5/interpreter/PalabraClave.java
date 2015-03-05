/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.interpreter;

/**
 *
 * @author Nicolas
 */
public class PalabraClave extends Expresion {

    protected String palabraClave;

    public PalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    @Override
    public boolean evalua(String descripcion) {
        return descripcion.indexOf(palabraClave) != -1;
    }
    
    //parte análisis sintáctico
    
    //public static new Expresion parsea() throws Exception
    
    public static Expresion parsea() throws Exception{
        Expresion resultado;
        resultado = new PalabraClave(PIEZA);
        siguientePieza();
        return resultado;
    }

}
