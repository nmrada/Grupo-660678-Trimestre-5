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
public abstract class Expresion {

    public abstract boolean evalua(String descripcion);

    //parte análisis sintáctico
    protected static String FUENTE;
    protected static int INDICE;
    protected static String PIEZA;

    protected static void siguientePieza() {
        //System.out.println(fuente.charAt(indice));
        while ((INDICE < FUENTE.length()) && (FUENTE.charAt(INDICE) == ' ')) {
            INDICE++;
        }
        if (INDICE == FUENTE.length()) {
            PIEZA = null;
        } else if ((FUENTE.charAt(INDICE) == '(') || (FUENTE.charAt(INDICE) == ')')) {
            PIEZA = FUENTE.substring(INDICE, INDICE + 1);
            INDICE++;
        } else {
            int inicio = INDICE;
            while ((INDICE < FUENTE.length()) && (FUENTE.charAt(INDICE) != ' ') && (FUENTE.charAt(INDICE) != ')')) {
                INDICE++;
                PIEZA = FUENTE.substring(inicio, INDICE);
            }
        }

    }

    public static Expresion analiza(String fuente) throws Exception {
        Expresion.FUENTE = fuente;
        INDICE = 0;
        siguientePieza();
        return OperandoO.parsea();
    }

    public static Expresion parsea() throws Exception {
        Expresion resultado;
        if (PIEZA.equals("(")) {
            siguientePieza();
            resultado = OperandoO.parsea();
            if (PIEZA == null) {
                throw new Exception("Error de sintaxis");
            }
            if (!PIEZA.equals(")")) {
                throw new Exception("Error de sintaxis");
            }
            siguientePieza();
        } else {
            resultado = PalabraClave.parsea();
        }
        return resultado;
    }
}
