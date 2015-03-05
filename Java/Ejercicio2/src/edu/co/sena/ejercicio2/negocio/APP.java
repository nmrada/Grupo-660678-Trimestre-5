/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.negocio;

import edu.co.sena.ejercicio2.integracion.modelo.dto.*;
import edu.co.sena.ejercicio2.integracion.entity.dao.*;
import edu.co.sena.ejercicio2.integracion.factory.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ColsutecR
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        PeopleDTO p1 = new PeopleDTO();
        p1.setPrimerNombre("Pedro");
        p1.setSegundoNombre("Antonio");
        p1.setPrimerApellido("Cardenas");
        p1.setSegundoApellido("Alvarez");
        System.out.println(p1.toString());
        
        EmployeedDTO e1 = new EmployeedDTO();
        e1.setIdEmployee("123456789");
        e1.setPrimerNombre("Carlos");
        e1.setSegundoNombre("Antonio");
        e1.setPrimerApellido("Martinez");
        e1.setSegundoApellido("Caceres");
        System.out.println(e1.toString());
        
        CustommerDTO c1 = new CustommerDTO();
        c1.setIdCustommer("123456");
        c1.setPrimerNombre("Diana");
        c1.setSegundoNombre("Carolina");
        c1.setPrimerApellido("Ramirez");
        c1.setSegundoApellido("Perez");
        System.out.println(c1.toString());
        
        
        
        DAOFactory fabrica = DAOAbstractFactory.getDAOFactory(DAOAbstractFactory.ORACLE_FACTORY);
        EmployeedDAO empl = fabrica.createEmployeedDAO();
        CustommerDAO cliente1 = fabrica.createCustommerDAO();
        System.out.println("");
        empl.insert(e1);
        empl.update(e1);
        empl.delete(e1);
        empl.findByID(e1);
        System.out.println("");
        cliente1.insert(c1);
        cliente1.update(c1);
        cliente1.delete(c1);
        cliente1.findByID(c1);
        System.out.println("---");
        List<PeopleDTO> listaEmpleado = new ArrayList<>();
        listaEmpleado.add(e1);
        listaEmpleado.add(e1);
        listaEmpleado.add(e1);
        listaEmpleado.add(e1);
        
        
        empl.insert(listaEmpleado);
    }
    
}
