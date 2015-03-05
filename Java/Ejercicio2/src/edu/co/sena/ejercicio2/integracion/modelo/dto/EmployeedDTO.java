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
public class EmployeedDTO extends PeopleDTO implements Serializable {

    private String idEmployeed;

    public EmployeedDTO() {
    }

    public String getIdEmployee() {
        return idEmployeed;
    }

    public void setIdEmployee(String idEmployeed) {
        this.idEmployeed = idEmployeed;
    }

    @Override
    public String toString() {
        return "EmployeedDTO{" + "idEmployeed = " + idEmployeed 
                + ", Primer Nombre = " + super.getPrimerNombre() 
                + ", Segundo Nombre = " + super.getSegundoNombre() 
                + ", Primer Apellido = " + super.getPrimerApellido() 
                + ", Segundo Apellido = " + super.getSegundoApellido() + '}';
    }

}
