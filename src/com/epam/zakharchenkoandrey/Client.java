package com.epam.zakharchenkoandrey;

import java.util.EnumSet;

public class Client {

    private int id;
    private int balance;
    private String size;
    EnumSet<Product> listProduct;

    public Client() {
    }

    public Client (int id) {
        this.id = id;
    }


    public void buy() {
       // listProduct.range(1, 3);
        System.out.println("Client # " + id + " bought " + listProduct);
    }

    @Override
    public String toString() {
        return id + " ";
    }
}
