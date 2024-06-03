package com.jjos.abstractfactory.products.shoe;

import com.jjos.abstractfactory.products.Shoe;

public class GalaShoe implements Shoe {
    @Override
    public boolean isElegantShoes() {
        System.out.println("Zapatos Gala -- Son zapatos elegante ?  ---> Si");
        return true;
    }

    @Override
    public boolean isRunnigShoes() {
        System.out.println("Zapatos Gala -- Son zapatos para correr ?  ---> No");
        return false;
    }
}
