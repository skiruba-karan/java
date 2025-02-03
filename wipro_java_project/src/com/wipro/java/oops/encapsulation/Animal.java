/**
 * 
 */
package com.wipro.java.oops.encapsulation;

public class Animal {

	public Animal(String species, String sound, int age, float weight ) {
		// TODO Auto-generated constructor stub
		super(); // the the root parent class
		this.species = species;
		this.sound = sound;
		this.age = age;
		this.weight = weight;
	}
	private String species;
	private String sound;
	private int age;
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0) {
			this.age = age;		
		}
		else {
			System.out.println("Age must be positive");
		}
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	private float weight;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Animal("Dog","bow-wow",2,10);
		System.out.println(animal1.getSpecies());
		System.out.println(animal1.getSound());
		System.out.println(animal1.getAge());
		System.out.println(animal1.getWeight());
		animal1.setAge(-5);
		
		System.out.println(animal1.getSpecies());
		System.out.println(animal1.getAge());
		System.out.println(animal1.getWeight());
	}

}
