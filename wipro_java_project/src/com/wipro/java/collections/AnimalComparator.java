package com.wipro.java.collections;

public class AnimalComparator {
    private String name;
    private int age;
    private float weight;
    
    // Constructor
    public AnimalComparator(String name, int age, float weight) {
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

    @Override
    public String toString() {
        return name + " | Age: " + age + " | Weight: " + weight + " kg";
    }
}