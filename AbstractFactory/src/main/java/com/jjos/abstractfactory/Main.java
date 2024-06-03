package com.jjos.abstractfactory;

import com.jjos.abstractfactory.factories.GalaClothesFactory;
import com.jjos.abstractfactory.factories.SportClothesFactory;
import com.jjos.abstractfactory.products.Shirt;
import com.jjos.abstractfactory.products.Shoe;
import com.jjos.abstractfactory.products.Trousers;
import com.jjos.abstractfactory.products.shirt.GalaShirt;
import com.jjos.abstractfactory.products.shirt.SportShirt;
import com.jjos.abstractfactory.products.shoe.GalaShoe;
import com.jjos.abstractfactory.products.shoe.SportShoe;
import com.jjos.abstractfactory.products.trousers.GalaTrousers;
import com.jjos.abstractfactory.products.trousers.SportTrousers;

public class Main {
    public static void main(String[] args) {
        // Fabrica de ropa deportiva
        ClothesFactory sportClothesFactory = new SportClothesFactory();
        Shirt sportShirt = sportClothesFactory.createShirt();
        Shoe sportShoe = sportClothesFactory.createShoes();
        Trousers sportTrousers = sportClothesFactory.createTrousers();

        System.out.println("\nEjemplo de ropa deportiva");
        System.out.println("Camisa deportiva tiene botones? " + sportShirt.hasButtons());
        System.out.println("Zapatos deportivos son para correr? " + sportShoe.isRunnigShoes());
        System.out.println("Pantalones deportivos tienen bolsillos? " + sportTrousers.hasPockets());

        // Fabrica de ropa de gala
        ClothesFactory galaClothesFactory = new GalaClothesFactory();
        Shirt galaShirt = galaClothesFactory.createShirt();
        Shoe galaShoe = galaClothesFactory.createShoes();
        Trousers galaTrousers = galaClothesFactory.createTrousers();

        System.out.println("\nEjemplo de ropa gala");
        System.out.println("Camisa de gala tiene botones? " + galaShirt.hasButtons());
        System.out.println("Zapatos de gala son para correr? " + galaShoe.isRunnigShoes());
        System.out.println("Pantalones de gala tienen bolsillos? " + galaTrousers.hasPockets());
    }

}