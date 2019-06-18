package com.epam.zakharchenkoandrey;

public enum Product {

    SNIKERS(5000),
    SHIRT(3000),
    TROUSERS(4000),
    HATS(2500);

    int price;

    Product(int price) {
        this.price = price;
    }
}
