package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalSort {
    public static void main(String[] args) {
        // Sample data for testing
        AnimalComparator a1 = new AnimalComparator("Elephant", 10, 5000);
        AnimalComparator a2 = new AnimalComparator("Lion", 5, 200);
        AnimalComparator a3 = new AnimalComparator("Tiger", 7, 250);
        AnimalComparator a4 = new AnimalComparator("Zebra", 3, 400);

        // Creating a list of animals
        List<AnimalComparator> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);

        // Sorting animals by Name using NameComparator
        Collections.sort(animals, new NameComparator());
        System.out.println("\nAnimals sorted by Name:");
        for (AnimalComparator a : animals) {
            System.out.println(a);
        }

        // Sorting animals by Age using AgeComparator
        Collections.sort(animals, new AgeComparator());
        System.out.println("\nAnimals sorted by Age:");
        for (AnimalComparator a : animals) {
            System.out.println(a);
        }

        
    }
}
