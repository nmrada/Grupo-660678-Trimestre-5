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
public class OperadorY extends OperandoBinario {

    public OperadorY(Expresion operandoIzquierdo, Expresion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }
    
    @Override
    public boolean evalua(String descripcion){
        return operandoIzquierdo.evalua(descripcion)&& operandoDerecho.evalua(descripcion);
    }
    
    // parte análisis sintáctico
    
    public static Expresion parsea()throws Exception{
        Expresion resultadoIzquierdo, resultadoDerecho;
        resultadoIzquierdo = Expresion.parsea();
        while ((Expresion.PIEZA != null)&&(Expresion.PIEZA.equals("y"))) {            
            Expresion.siguientePieza();
            resultadoDerecho = Expresion.parsea();
            resultadoIzquierdo = new OperadorY(resultadoIzquierdo, resultadoDerecho);
        }
        return resultadoIzquierdo;
    }
    
}
