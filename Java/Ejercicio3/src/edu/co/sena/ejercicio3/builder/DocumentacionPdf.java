/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio3.builder;

/**
 *
 * @author Nicolas
 */
public class DocumentacionPdf extends Documentacion{

    @Override
    public void agregarDocumento(String documento) {
        if (documento.startsWith("<PDF>")) {
            contenido.add(documento);
        }
    }

    @Override
    public void imprime() {
        System.out.println("Documnetación PDF");
        for (String string : contenido) {
            System.out.println(string);
        }
    }
    
}
