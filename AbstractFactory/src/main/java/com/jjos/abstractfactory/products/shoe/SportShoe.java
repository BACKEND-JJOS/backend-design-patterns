package com.jjos.abstractfactory.products.shoe;

import com.jjos.abstractfactory.products.Shoe;

public class SportShoe implements Shoe {
    @Override
    public boolean isElegantShoes() {
        System.out.println("Zapatos deportivos -- Son zapatos elegante ?  ---> No");
        return false;
    }

    @Override
    public boolean isRunnigShoes() {
        System.out.println("Zapatos deportivos -- Son zapatos para correr ?  ---> Si");
        return true;
    }
}
