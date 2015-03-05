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
public class ClienteCredito extends Cliente {

    @Override
    protected Pedido creaPedido(double importe) {
        return new PedidoCredito(importe);
    }

}
