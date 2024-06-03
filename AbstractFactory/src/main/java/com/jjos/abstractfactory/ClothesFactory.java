package com.jjos.abstractfactory;

import com.jjos.abstractfactory.products.Shirt;
import com.jjos.abstractfactory.products.Shoe;
import com.jjos.abstractfactory.products.Trousers;

public interface ClothesFactory {
    Shoe createShoes();
    Shirt createShirt();
    Trousers createTrousers();
}
