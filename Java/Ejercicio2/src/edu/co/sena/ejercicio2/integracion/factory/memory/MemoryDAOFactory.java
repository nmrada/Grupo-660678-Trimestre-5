/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.factory.memory;

import edu.co.sena.ejercicio2.integracion.entity.dao.CustommerDAO;
import edu.co.sena.ejercicio2.integracion.entity.dao.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.entity.dao.memory.CustommerDAOMemoryImpl;
import edu.co.sena.ejercicio2.integracion.entity.dao.memory.EmployeedDAOMemoryImpl;
import edu.co.sena.ejercicio2.integracion.factory.DAOAbstractFactory;

/**
 *
 * @author Colsutec
 */
public class MemoryDAOFactory extends DAOAbstractFactory{

    @Override
    public EmployeedDAO createEmployeedDAO() {
        return new EmployeedDAOMemoryImpl();
    }

    @Override
    public CustommerDAO createCustommerDAO() {
        return new CustommerDAOMemoryImpl();
    }
    
}
