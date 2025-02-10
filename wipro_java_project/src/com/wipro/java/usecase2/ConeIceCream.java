package com.wipro.java.usecase2;

//Inheritance 
class ConeIceCream extends IceCream {
 private String coneType; // for storing the type of the cone 

 public ConeIceCream(String flavor, double price, String size, String coneType) {
     super(flavor, price, size);
     this.coneType = coneType;
 }
//getter for coneType
 public String getConeType() {
     return coneType;
 }

 @Override
 public void IceCreamDetails() {
     System.out.println("Cone Ice Cream - Flavor: " + getFlavor() + " -Price: " + getPrice() +
             "  -Size: " + getSize() + "  -Cone Type: " + coneType);
 }
}