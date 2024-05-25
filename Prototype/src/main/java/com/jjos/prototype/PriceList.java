package com.jjos.prototype;

import java.util.ArrayList;
import java.util.List;

public class PriceList implements  IPrototype{

    private String name;

    private List<Product> productsList = new ArrayList<>();

    public PriceList (String name){
        this.name = name;
    }

    public String getName(){
        return  this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    /**
     * Clonación superficial
     * @return
     */
    @Override
    public Cloneable shallowCopy() {
        PriceList clone = new PriceList(name);
        clone.setProductsList(productsList);
        return clone;
    }

    /**
     * Clonación profunda
     * @return
     */
    @Override
    public Cloneable deepClone() {
        PriceList clone = new PriceList(name);
        List<Product> cloneProducts = new ArrayList<>();
        for (Product product : productsList){
            Product cloneProduct = (Product) product.shallowCopy();
            cloneProducts.add(cloneProduct);
        }

        clone.setProductsList(cloneProducts);
        return clone;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    @Override
    public String toString() {
        return  Integer.toHexString(System.identityHashCode(this)) +  "PriceList{" +
                "name='" + name + '\'' +
                ", productsList=" + productsList +
                '}';
    }
}
