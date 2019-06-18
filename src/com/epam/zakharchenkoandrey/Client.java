package com.epam.zakharchenkoandrey;

import java.util.EnumSet;
import java.util.Random;

public class Client {

    private int id;
    private int balance;
    private String size;
    private EnumSet<Product> listProduct;

    public Client() {
    }

    public Client (int id) {
        this.id = id;
    }


    public void buy() {
        Random random = new Random();                  // Можно ли random вынести в класс и сделать static?
        int countProduct = random.nextInt(5) + 1;
        listProduct = EnumSet.noneOf(Product.class);
        for (int i = 0; i < countProduct; i++) {
            int numberProduct = random.nextInt(5);
            listProduct.add(Product.getProduct(numberProduct));
        }
        System.out.println("Client # " + id + " bought " + listProduct);
    }

    @Override
    public String toString() {
        return id + " ";
    }
}
