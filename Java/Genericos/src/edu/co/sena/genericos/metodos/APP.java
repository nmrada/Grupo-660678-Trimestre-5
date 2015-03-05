/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.genericos.metodos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ColsutecR
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        e1.setId(1);
        e1.setNombre("Pepito Alcachofas");
        
        Estudiante e2 = new Estudiante();
        e2.setId(2);
        e2.setNombre("Diana Ramirez");
        
        Estudiante e3 = new Estudiante();
        e3.setId(3);
        e3.setNombre("Pedro Infante");
        
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(e1);
        listaEstudiantes.add(e2);
        listaEstudiantes.add(e3);
        
        ListaUtilidades.imprimirLista(listaEstudiantes);
    }
    
}
