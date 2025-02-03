package com.wipro.java.oops.polymorphism;

public class Hatchback extends Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car2 = new Hatchback();
		car2.setMake("Hyundai");
		car2.setModel("i20");
		car2.setColor("Red");
		car2.setYearOfMake(2024);
		car2.setFuelType("Petrol");
		car2.ShowDetails();
	}

}
