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
public class OperandoO extends OperandoBinario {

    public OperandoO(Expresion operandoIzquierdo, Expresion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }

    public boolean evalua(String descripcion) {
        return operandoIzquierdo.evalua(descripcion) || operandoDerecho.evalua(descripcion);
    }

    // parte análisis sintáctico
    public static Expresion parsea() throws Exception {
        Expresion resultadoIzquierdo, resultadoDerecho;
        resultadoIzquierdo = OperadorY.parsea();
        while ((Expresion.PIEZA != null) && (Expresion.PIEZA.equals("o"))) {
            Expresion.siguientePieza();
            resultadoDerecho = OperadorY.parsea();
            resultadoIzquierdo = new OperandoO(resultadoIzquierdo, resultadoDerecho);
        }
        return resultadoIzquierdo;
    }

}
