package com.jjos.prototype;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de precios inicial con varios productos
        PriceList priceList = new PriceList("Lista normal");
        List<Product> productList = List.of(
                new Product("Computadora", 500000),
                new Product("Teclado", 400000),
                new Product("Pantalla", 200000),
                new Product("Auriculares", 300000)
        );
        // Asignar la lista de productos a la lista de precios
        priceList.setProductsList(productList);

        // Imprimir la lista de precios original
        System.out.println(priceList);

        // Crear una nueva lista de precios clonada (clonación profunda)
        PriceList priceList2 = (PriceList) priceList.deepClone();
        // Cambiar el nombre de la lista de precios clonada
        priceList2.setName("Lista Preferencial");

        // Aplicar un descuento del 10% a cada producto en la lista clonada
        for (Product product : priceList2.getProductsList()) {
            product.setPrice(product.getPrice() * 0.9);
        }

        // Imprimir la lista de precios clonada con el descuento aplicado
        System.out.println(priceList2);

        // Mostrar que la lista original no ha sido modificada
        System.out.println("Original después de la clonación profunda: " + priceList);

        // Crear una nueva lista de precios clonada (clonación superficial)
        PriceList priceList3 = (PriceList) priceList.shallowCopy();

        // Cambiar el nombre de la lista de precios clonada
        priceList3.setName("Lista Superficial");

        // Modificar el precio del primer producto en la lista clonada superficialmente
        priceList3.getProductsList().get(0).setPrice(600000);

        // Imprimir la lista de precios clonada superficialmente
        System.out.println(priceList3);

        // Mostrar que la lista original ha sido modificada debido a la clonación superficial
        System.out.println("Original después de la clonación superficial: " + priceList);
    }
}
