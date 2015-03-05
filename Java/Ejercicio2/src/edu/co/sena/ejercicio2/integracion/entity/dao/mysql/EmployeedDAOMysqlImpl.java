/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.entity.dao.mysql;

import edu.co.sena.ejercicio2.integracion.entity.dao.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.modelo.dto.PeopleDTO;
import java.util.Collection;

/**
 *
 * @author Colsutec
 */
public class EmployeedDAOMysqlImpl implements EmployeedDAO {

    @Override
    public void insert(PeopleDTO p) {
        System.out.println("Inserte empleado en Mysql "+p.toString());
    }

    @Override
    public void update(PeopleDTO p) {
        System.out.println("Actualice empleado en Mysql "+p.toString());
    }

    @Override
    public void delete(PeopleDTO p) {
        System.out.println("Borre empleado en Mysql "+p.toString());
    }

    @Override
    public void findByID(PeopleDTO p) {
        System.out.println("Se busco el empleado en Mysql "+p.toString());
    }

    @Override
    public void insert(Collection<PeopleDTO> p) {
        for (PeopleDTO p1 : p) {
            System.out.println("Inserte el empleado en Mysql "+ p1.toString());
        }
    }
    
}
