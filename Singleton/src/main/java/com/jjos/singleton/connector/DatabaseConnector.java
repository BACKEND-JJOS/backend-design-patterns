package com.jjos.singleton.connector;

/**
 * Reglas para un singleton
 * 1: Tener un constructor privado
 * 2: Tener un atributo privado estatico de la misma clase
 * 3: Tener un metodo estatico que devuelva la instancia
 */
public class DatabaseConnector {
    private static DatabaseConnector instance;

    /**
     * Constructor privado
     */
    private DatabaseConnector(){
        System.out.println("Creating object");
    }

    public static synchronized DatabaseConnector getInstance() {
        if(instance == null){
            instance =  new DatabaseConnector();
        }
        return instance;
    }
}
