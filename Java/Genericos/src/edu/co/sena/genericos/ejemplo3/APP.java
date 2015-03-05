/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.genericos.ejemplo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Nicolas
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante es1 = new Estudiante();
        es1.setId(01);
        es1.setNombre("Carlos Colmenares");
        
        Estudiante es2 = new Estudiante();
        es2.setId(02);
        es2.setNombre("Andres Ortiz");
        
        Estudiante es3 = new Estudiante();
        es3.setId(03);
        es3.setNombre("Tyrone Gonzalez");
        
        Estudiante es4 = new Estudiante();
        es4.setId(04);
        es4.setNombre("Diana Ramirez");
        
        Estudiante es5 = new Estudiante();
        es5.setId(05);
        es5.setNombre("Jhon Castillo");
        
        List<Estudiante> listaDeEstudiantes = new ArrayList<>(3);
        listaDeEstudiantes.add(es1);
        listaDeEstudiantes.add(es2);
        listaDeEstudiantes.add(es3);
        listaDeEstudiantes.add(es4);
        listaDeEstudiantes.add(es5);
        
        Comparator<Estudiante> sortNombre = new EstudianteOrdenadosNombre();
        Comparator<Estudiante> sortId = new EstudianteOrdenadoId();
        
        System.out.println("Ordenados por Nombre");
        Collections.sort(listaDeEstudiantes, sortNombre);
        for (Estudiante estudiante : listaDeEstudiantes) {
            System.out.println(estudiante.toString());
        }
        
        System.out.println("");
        System.out.println("Ordenados por Id");
        
        Collections.sort(listaDeEstudiantes, sortId);
        for (Estudiante estudiante : listaDeEstudiantes) {
            System.out.println(estudiante.toString());
        }
        
    }
    
}
