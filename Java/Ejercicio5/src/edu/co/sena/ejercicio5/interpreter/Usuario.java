/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.interpreter;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Expresion expresionConsulta = null;
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca su consulta: ");
        String consulta = reader.nextLine();
        try {
            expresionConsulta = Expresion.analiza(consulta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            expresionConsulta = null;
        }
        if (expresionConsulta != null) {
            System.out.println("Introduzca la descripción del vehiculo: ");
            String descripcion = reader.nextLine();
            if (expresionConsulta.evalua(descripcion)) {
                System.out.println("La descripción responde a la consulta");
            } else {
                System.out.println("La descripción no responde a la consulta");
            }
        }
    }

}
