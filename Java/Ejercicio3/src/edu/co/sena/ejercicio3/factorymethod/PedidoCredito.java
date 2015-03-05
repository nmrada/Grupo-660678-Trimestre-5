/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.factorymethod;

/**
 *
 * @author ColsutecR
 */
public class PedidoCredito extends Pedido {

    public PedidoCredito(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return (importe >= 1000.0) && (importe <= 5000.0);
    }

    @Override
    public void paga() {
        System.out.println("El pago del pedido a credito de: " + importe + " se ha realizado.");
    }

}
