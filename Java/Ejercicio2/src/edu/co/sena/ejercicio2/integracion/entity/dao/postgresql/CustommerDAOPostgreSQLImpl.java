/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.entity.dao.postgresql;

import edu.co.sena.ejercicio2.integracion.entity.dao.CustommerDAO;
import edu.co.sena.ejercicio2.integracion.modelo.dto.PeopleDTO;
import java.util.Collection;

/**
 *
 * @author Colsutec
 */
public class CustommerDAOPostgreSQLImpl implements CustommerDAO{

    @Override
    public void insert(PeopleDTO p) {
        System.out.println("Inserte cliente en PostgreSQL "+p.toString());
    }

    @Override
    public void update(PeopleDTO p) {
        System.out.println("Actualice cliente en PostgreSQL "+p.toString());
    }

    @Override
    public void delete(PeopleDTO p) {
        System.out.println("Borre cliente en PostgreSQL "+p.toString());
    }

    @Override
    public void findByID(PeopleDTO p) {
        System.out.println("Se busco cliente en PostgreSQL "+p.toString());
    }

    @Override
    public void insert(Collection<PeopleDTO> p) {
        for (PeopleDTO p1 : p) {
            System.out.println("Inserto el cliente en PostgreSQL "+p.toString());
        }
    }
    
}
