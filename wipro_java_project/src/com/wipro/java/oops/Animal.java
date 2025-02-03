/**
 * 
 */
package com.wipro.java.oops;

/**1. No Constructor 
 * 2. Getters have return value
 * 3. Setters have no return value
 * 4. Properties are determined using private fields
 * 5. Values/Behaviors are determined via setters
 * 6. toString will convert the entire animal class with properties and behaviors
 */
public class Animal {

	/**
	 * 
	 */
	private String species; //Species
	

	private String animalName; //Animal Name
	private int age; //Age
	private float weight; //Weight
	private String habitat; //Habitat
	
	//Getter for Species
	public String getSpecies() {
		return species;
	}
	//Setter for Species
	public void setSpeices(String species) {
		this.species = species;
	}
	// Getter for AnimalName
	public String getAnimalName() {
		return animalName;
	}
	//Setter for AnimalName
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	//Getter for Age
	public int getAge() {
		return age;
	}
	//Setter for Age
	public void setAge(int age) {
		this.age = age;
	}
	//Getter for Weight
	public float getWeight() {
		return weight;
	}
	//Setter for Weight
	public void setWeight(float weight) {
		this.weight = weight;
	}
	//Getter for Habitat
	public String getHabitat() {
		return habitat;
	}
	//Setter for Habitat
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	@Override
	public String toString() {
		return "Animal [species=" + species + ", animalName=" + animalName + ", age=" + age + ", weight=" + weight
				+ ", habitat=" + habitat + "]";
	}

	

}
