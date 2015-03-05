/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.modelo.dto;

import java.io.Serializable;

/**
 *
 * @author ColsutecR
 */
public class CustommerDTO extends PeopleDTO implements Serializable {

    private String idCustommer;

    public CustommerDTO() {
    }

    public String getIdCustommer() {
        return idCustommer;
    }

    public void setIdCustommer(String idCustommer) {
        this.idCustommer = idCustommer;
    }

    @Override
    public String toString() {
        return "CustommerDTO{" + "idCustommer=" + idCustommer 
                + ", Primer Nombre = " + super.getPrimerNombre() 
                + ", Segundo Nombre = " + super.getSegundoNombre() 
                + ", Primer Apellido = " + super.getPrimerApellido() 
                + ", Segundo Apellido = " + super.getSegundoApellido() + '}';
    }

}
