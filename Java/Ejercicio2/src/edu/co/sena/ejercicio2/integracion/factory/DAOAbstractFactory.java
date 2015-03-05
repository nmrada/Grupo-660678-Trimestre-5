/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.factory;

import edu.co.sena.ejercicio2.integracion.factory.memory.MemoryDAOFactory;
import edu.co.sena.ejercicio2.integracion.factory.mysql.MysqlDAOFactory;
import edu.co.sena.ejercicio2.integracion.factory.oracle.OracleDAOFactory;
import edu.co.sena.ejercicio2.integracion.factory.postgresql.PostgreSQLDAOFactory;

/**
 *
 * @author ColsutecR
 */
public abstract class DAOAbstractFactory implements DAOFactory {

    public static final int ORACLE_FACTORY = 1;
    public static final int MYSQL_FACTORY = 2;
    public static final int MEMORY_FACTORY = 3;
    public static final int POSTGRESQL_FACTORY = 4;

    public final static DAOAbstractFactory getDAOFactory(int factoryType) throws Exception {
        switch (factoryType) {
            case ORACLE_FACTORY:{
                return new OracleDAOFactory();
            }
            case MYSQL_FACTORY:{
                return new MysqlDAOFactory();
            }
            case MEMORY_FACTORY:{
                return new MemoryDAOFactory();
            }
            case POSTGRESQL_FACTORY: {
                return new PostgreSQLDAOFactory();
            }
            default:{
                System.out.println("El tipo de fabrica no puede sr implementado o no existe");
                return null;
            }
    
        }

    }
}
