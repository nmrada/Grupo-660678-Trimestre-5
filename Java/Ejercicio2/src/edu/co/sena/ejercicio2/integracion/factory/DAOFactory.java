/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.factory;
import edu.co.sena.ejercicio2.integracion.entity.dao.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.entity.dao.CustommerDAO;
/**
 *
 * @author ColsutecR
 */
public interface DAOFactory {
    public EmployeedDAO createEmployeedDAO();
    public CustommerDAO createCustommerDAO();
}
