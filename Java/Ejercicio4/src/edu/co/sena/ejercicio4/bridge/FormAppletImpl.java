/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.bridge;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class FormAppletImpl implements FormularioImpl {

    Scanner reader = new Scanner(System.in);

    public FormAppletImpl() {
    }

    @Override
    public void dibujaTexto(String texto) {
        System.out.println("Applet: " + texto);
    }

    @Override
    public String administraZonaIndicada() {
        return reader.next();
    }

}
