package com.wipro.java.usecase2;

// Abstract Class for Abstraction 
//Encapsulation  for IceCream class
abstract class IceCream {
    private String flavor;
    private double price;
    private String size; // Sizes like Small, Medium and Large

    // Constructor
    public IceCream(String flavor, double price, String size) {
        this.flavor = flavor;
        this.price = price;
        this.size = size;
    }

    // Getters
    public String getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    // Abstract method 
    public abstract void IceCreamDetails();
}

