package com.wipro.java.oops.polymorphism;

public class Car {
	private String make;
	private String model;
	private String color;
	private int yearOfMake;
	private String fuelType;
	
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYearOfMake() {
		return yearOfMake;
	}
	public void setYearOfMake(int yearOfMake) {
		this.yearOfMake = yearOfMake;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", color=" + color + ", yearOfMake=" + yearOfMake
				+ ", fuelType=" + fuelType + "]";
	}
	  public void ShowDetails() {
	        System.out.println("Car Details:");
	        System.out.println("Make: " + make);
	        System.out.println("Model: " + model);
	        System.out.println("Color: " + color);
	        System.out.println("Year of Make: " + yearOfMake);
	        System.out.println("Fuel Type: " + fuelType);
	    }
	
	
	
	
}
