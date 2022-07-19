package com.company;

public class Milk {
    String product;
    double price;

    public Milk() {
    }

    public Milk(String product, double price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return product.toUpperCase() + ": " + price;
    }
}
