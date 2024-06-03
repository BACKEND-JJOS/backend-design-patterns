package com.jjos.abstractfactory.products.trousers;

import com.jjos.abstractfactory.products.Trousers;

public class GalaTrousers implements Trousers {

    @Override
    public boolean hasPockets() {
        System.out.println("Pantalones Gala -- Tiene bolsillo ?  ---> Si");
        return true;
    }

    @Override
    public String getClosureTypes() {
        System.out.println("Pantalones  Gala -- Tienen cierre ?  ---> Si");
        return "cierre";
    }

}
