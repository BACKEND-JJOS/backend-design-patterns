package com.jjos.abstractfactory.products.shirt;

import com.jjos.abstractfactory.products.Shirt;

public class GalaShirt implements Shirt {
    @Override
    public boolean hasLongSleeves() {
        System.out.println("camisa gala -- Tiene mangas largas ?  ---> Si");
        return true;
    }

    @Override
    public boolean hasButtons() {
        System.out.println("camisa gala -- Tiene botones ?  ---> Si");
        return true;
    }
}
