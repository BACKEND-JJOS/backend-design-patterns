package com.jjos.abstractfactory.products.trousers;

import com.jjos.abstractfactory.products.Trousers;

public class SportTrousers implements Trousers {

    @Override
    public boolean hasPockets() {
        System.out.println("Pantalones Deportivos -- Tiene bolsillo ?  ---> No");
        return false;
    }

    @Override
    public String getClosureTypes() {
        System.out.println("Pantalones  Deportivos -- Tienen cierre ?  ---> No");
        return null;
    }

}
