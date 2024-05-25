package com.jjos.prototype;

public class Product  implements  IPrototype{

    private String name;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Clonación superficial
     * @return
     */
    @Override
    public Cloneable shallowCopy() {
        Product clone = new Product(this.name, this.price);
        return clone;
    }

    /**
     * Clonación profunda
     * @return
     */
    @Override
    public Cloneable deepClone() {
        return shallowCopy();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) + " Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
