/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.genericos.metodos;

import java.util.List;

/**
 *
 * @author ColsutecR
 */
public class ListaUtilidades {
    public static <T>void imprimirLista(List<T> a){
        for (T a1 : a) {
            System.out.println(a1);
        }
    }
}
