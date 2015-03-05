/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.actividad1.integracion.modelo;

/**
 *
 * @author ColsutecR
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaVO p1 = new PersonaVO();
        p1.setPrimerNombre("Pedro");
        p1.setSegundoNombre("Antonio");
        p1.setPrimerApellido("Ramirez");
        p1.setSegundoApellido("Cardenas");
        p1.setEdad("34");
        p1.setTelefono("144545");
        p1.setTipoDocumento("CC");
        p1.setNumeroDocumento("12345");
        
        PersonaVO p2 = new PersonaVO();
        p2.setPrimerNombre("Pedro");
        p2.setSegundoNombre("Antonio");
        p2.setPrimerApellido("Ramirez");
        p2.setSegundoApellido("Cardenas");
        p2.setEdad("34");
        p2.setTelefono("144545");
        p2.setTipoDocumento("CC");
        p2.setNumeroDocumento("12345");
       
        PersonaVO p3 = new PersonaVO();
        p3.setPrimerNombre("Pedro");
        p3.setSegundoNombre("Antonio");
        p3.setPrimerApellido("Ramirez");
        p3.setSegundoApellido("Cardenas");
        p3.setEdad("34");
        p3.setTelefono("144545");
        p3.setTipoDocumento("CC");
        p3.setNumeroDocumento("1234567789");
        
        PersonaVO p4 = (PersonaVO)p3.clone();

        if (p3.compareTo(p4) == 10) {
            System.out.println("Es la misma persona");
        } else if (p3.compareTo(p4) == 20) {
            System.out.println("Son diferentes personas");
        }

        if (p1.compareTo(p3) == 10) {
            System.out.println("Es la misma persona");
        } else if (p1.compareTo(p3) == 20) {
            System.out.println("Son diferentes personas");
        }
    }

}
