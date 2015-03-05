/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.entity.dao.postgresql;

import edu.co.sena.ejercicio2.integracion.entity.dao.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.modelo.dto.PeopleDTO;
import java.util.Collection;

/**
 *
 * @author Colsutec
 */
public class EmployeedDAOPostgreSQLImpl implements EmployeedDAO{

    @Override
    public void insert(PeopleDTO p) {
        System.out.println("Inserte empleado en PostgreSQL "+p.toString());
    }

    @Override
    public void update(PeopleDTO p) {
        System.out.println("Actualice empleado en PostgreSQL "+p.toString());
    }

    @Override
    public void delete(PeopleDTO p) {
        System.out.println("Borre empleado en PostgreSQL "+p.toString());
    }

    @Override
    public void findByID(PeopleDTO p) {
        System.out.println("Se busco el empleado en PostgreSQL "+p.toString());
    }

    @Override
    public void insert(Collection<PeopleDTO> p) {
        for (PeopleDTO p1 : p) {
            System.out.println("Inserto el empleado en PostgreSQL "+p.toString());
        }
    }
    
}
