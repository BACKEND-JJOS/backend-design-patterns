package com.jjos.singleton;

import com.jjos.singleton.connector.DatabaseConnector;

public class Main {
    public static void main(String[] args) {

        DatabaseConnector databaseConnector1 = DatabaseConnector.getInstance();
        // Si instanciamos DatabaseConnector databaseConnector1 = new DatabaseConnector(); nos genera un error.
        System.out.println("databaseConnector1: " + databaseConnector1);

        DatabaseConnector databaseConnector2 = DatabaseConnector.getInstance();
        // En teoría debe retornar el mismo objeto instanciado para el conector 2
        System.out.println("databaseConnector2: " + databaseConnector2);

        // Comprobamos si ambas instancias son iguales
        System.out.println("¿Las instancias son iguales? " + (databaseConnector1 == databaseConnector2));

    }
}