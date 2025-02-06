package com.wipro.java.collections;

import java.util.*;
public class Animal implements Comparable<Animal>{
	private String name;
	private int age;
	private float weight;
	
//	Constructor
	public Animal(String name, int age, float weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public float getWeight() {
		return weight;
	}
	
	public int compareTo(Animal other) {
		return Integer.compare(this.age, other.age);
	}
    public String toString() {
        return name + " | Age: " + age + " | Weight: " + weight + " kg";
    }
    public static void main(String[] args) {
        // Sample data for testing
        Animal a1 = new Animal("Elephant", 10, 5000);
        Animal a2 = new Animal("Lion", 5, 200);
        Animal a3 = new Animal("Tiger", 7, 250);

        // Creating a list of animals
        List<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);

        // Sorting animals by age (Ascending Order)
        animals.sort(null);

        // Displaying sorted list
        System.out.println("Animals sorted by age (natural order):");
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}
