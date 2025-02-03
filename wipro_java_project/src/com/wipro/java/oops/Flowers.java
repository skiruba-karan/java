/**
 * 
 */
package com.wipro.java.oops;


public class Flowers {
	String name;
	String color;
	int price;
	
	Flowers(String name,String color, int price){
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	void display() {
		System.out.println("Flower Name: "+name+", Color: "+color+", Price: "+price);
	}
	
	public static void main(String[] args) {
		Flowers flowerObject1 = new Flowers("Rose","Red",20);
		Flowers flowerObject2 = new Flowers("SunFlower","Yellow",30);
		Flowers flowerObject3 = new Flowers("Jasmine","White",50);
		flowerObject1.display();
		flowerObject2.display();
		flowerObject3.display();
	}

}
