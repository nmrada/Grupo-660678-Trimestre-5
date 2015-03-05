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
public class PersonaVO implements Comparable<PersonaVO>, Cloneable {

    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String edad;
    private String telefono;
    private String tipoDocumento;
    private String numeroDocumento;

    public PersonaVO() {
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public int compareTo(PersonaVO o) {
        int res = 0;
        if (this.tipoDocumento.equals(o.getTipoDocumento()) && this.numeroDocumento.equals(o.getNumeroDocumento())) {
            res = 10;
        } else {
            res = 20;
        }
        return res;
    }

    public void imprimir() {
        System.out.println("Primer Nombre: " + this.getPrimerNombre());
        System.out.println("Segundo Nombre: " + this.getSegundoNombre());
        System.out.println("Primer Apellido: " + this.getPrimerApellido());
        System.out.println("Segundo Apellido: " + this.getSegundoApellido());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Telefono: " + this.getTelefono());
        System.out.println("Tipo Documento: " + this.getTipoDocumento());
        System.out.println("Numero Documento: " + this.getNumeroDocumento());
    }
    
    public Object clone(){
        PersonaVO objClonado = new PersonaVO();
        objClonado.setPrimerNombre(this.primerNombre);
        objClonado.setSegundoNombre(this.segundoNombre);
        objClonado.setPrimerApellido(this.primerApellido);
        objClonado.setSegundoApellido(this.segundoApellido);
        objClonado.setEdad(this.edad);
        objClonado.setTelefono(this.telefono);
        objClonado.setTipoDocumento(this.tipoDocumento);
        objClonado.setNumeroDocumento(this.numeroDocumento);
        return objClonado;
    }
}
