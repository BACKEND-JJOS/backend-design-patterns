package com.jjos.abstractfactory.factories;

import com.jjos.abstractfactory.ClothesFactory;
import com.jjos.abstractfactory.products.Shirt;
import com.jjos.abstractfactory.products.Shoe;
import com.jjos.abstractfactory.products.Trousers;
import com.jjos.abstractfactory.products.shirt.SportShirt;
import com.jjos.abstractfactory.products.shoe.SportShoe;
import com.jjos.abstractfactory.products.trousers.SportTrousers;

public class SportClothesFactory implements ClothesFactory {
    @Override
    public Shoe createShoes() {
        return new SportShoe();
    }

    @Override
    public Shirt createShirt() {
        return new SportShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new SportTrousers();
    }
}
