package com.jjos.abstractfactory.factories;

import com.jjos.abstractfactory.ClothesFactory;
import com.jjos.abstractfactory.products.Shirt;
import com.jjos.abstractfactory.products.Shoe;
import com.jjos.abstractfactory.products.Trousers;
import com.jjos.abstractfactory.products.shirt.GalaShirt;
import com.jjos.abstractfactory.products.shoe.GalaShoe;
import com.jjos.abstractfactory.products.trousers.GalaTrousers;

public class GalaClothesFactory implements ClothesFactory {
    @Override
    public Shoe createShoes() {
        return new GalaShoe();
    }

    @Override
    public Shirt createShirt() {
        return new GalaShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new GalaTrousers();
    }
}
