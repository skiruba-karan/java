package com.wipro.java.oops.polymorphism;

public class Suv extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Suv();
		car1.setMake("Mahindra");
		car1.setModel("XUV700");
		car1.setColor("Blue");
		car1.setYearOfMake(2024);
		car1.setFuelType("Petrol");
		
		car1.ShowDetails();
	}

}
