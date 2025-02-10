package com.wipro.java.usecase2;
class CupIceCream extends IceCream {
    private String topping; 

    public CupIceCream(String flavor, double price, String size, String topping) {
        super(flavor, price, size);
        this.topping = topping;
    }
//getter for topping
    public String getTopping() {
        return topping;
    }

    @Override
    public void IceCreamDetails() {
        System.out.println("Cup Ice Cream - Flavor: " + getFlavor() + " - Price: " + getPrice() +
                " - Size: " + getSize() + " - Topping: " + topping);
    }
}