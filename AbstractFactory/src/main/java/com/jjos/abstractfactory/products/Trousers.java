package com.jjos.abstractfactory.products;

public interface Trousers {

    //Metodo para validar si el pantalon tiene bolsillos
    boolean hasPockets();

    //Metodo para obtener el tipo de cierre de los pantalones(cierre, botones, sin cierre)
    String getClosureTypes();
}
