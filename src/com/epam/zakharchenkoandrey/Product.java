package com.epam.zakharchenkoandrey;

public enum Product {

    SNIKERS(5000),
    TSHIRT(3000),
    TROUSERS(4000),
    HATS(2500),
    SUNGLASSES(8900);

    int price;

    Product(int price) {
        this.price = price;
    }

    public static Product getProduct(int numberProduct) {
        Product product = SNIKERS;
        switch (numberProduct) {
            case 0:
                product = SNIKERS;
                break;
            case 1:
                product = TSHIRT;
                break;
            case 2:
                product = TROUSERS;
                break;
            case 3:
                product = HATS;
                break;
            case 4:
                product = SUNGLASSES;
        }
        return product;
    }

    @Override
    public String toString () {
        return super.toString() + " " + price + " tenge";
    }
}
