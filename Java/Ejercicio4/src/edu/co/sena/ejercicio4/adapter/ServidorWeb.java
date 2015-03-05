/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.adapter;

/**
 *
 * @author ColsutecR
 */
public class ServidorWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Documento documento1, documento2;
        documento1 = new DocumentoHtml();
        documento1.setContenido("Hello");
        documento1.dibuja();
        System.out.println("");
        documento2 = new DocumentoPdf();
        documento2.setContenido("Hola");
        documento2.dibuja();
    }
    
}
