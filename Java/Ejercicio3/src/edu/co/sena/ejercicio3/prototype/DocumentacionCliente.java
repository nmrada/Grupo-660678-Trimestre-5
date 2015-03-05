/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ColsutecR
 */
public class DocumentacionCliente extends Documentacion {

    public DocumentacionCliente(String informacion) {
        documentos = new ArrayList<>();
        DocumentacionEnBlanco docuemntacionEnBlanco = DocumentacionEnBlanco.instance();
        List<Documento> documentosEnBlanco = docuemntacionEnBlanco.getDocumentos();
        for (Documento documento : documentosEnBlanco) {
            Documento copiaDocumento = documento.duplica();
            copiaDocumento.rellena(informacion);
            documentos.add(copiaDocumento);
        }
    }

    public void visualiza() {
        for (Documento documento : documentos) {
            documento.visualiza();
        }
    }

    public void imprime() {
        for (Documento documento : documentos) {
          documento.imprime();
        }
    }
}
