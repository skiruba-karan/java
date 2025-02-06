package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Collections {

    public static void main(String[] args) {
//        Arrays 
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        //  ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("BMW");
        arrayList.add("Mercedes");
        arrayList.add("Rolls-Royce");
        System.out.println("Initial ArrayList: " + arrayList);

        // Adding an element at a specific index
        arrayList.add(1, "Toyota");
        System.out.println("After adding 'Toyota' at index 1: " + arrayList);

        // Removing an element
        arrayList.remove("Mercedes");
        System.out.println("After removing 'Mercedes': " + arrayList);

        // Updating an element
        arrayList.set(2, "Lamborghini");
        System.out.println("After setting index 2 to 'Lamborghini': " + arrayList);

        // Iterating using a for-each loop
        System.out.println("Iterating over ArrayList:");
        for (String car : arrayList) {
            System.out.println(car);
        }
        System.out.println();

        // LinkedList

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        System.out.println("Initial LinkedList: " + linkedList);

        // Adding elements
        linkedList.add(50); 
        linkedList.add(400); 
        System.out.println("After adding elements: " + linkedList);

        // Removing elements
        linkedList.remove(); // Specific to LinkedList
        linkedList.remove();  // Specific to LinkedList
        System.out.println("After removing elements: " + linkedList);

        // Iterating using a for loop
        System.out.println("Iterating over LinkedList:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println();
        // HashMap

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("Initial HashMap: " + hashMap);

        // Accessing values
        int value = hashMap.get("Two");
        System.out.println("Value associated with 'Two': " + value);

        // Removing a key-value pair
        hashMap.remove("Three");
        System.out.println("After removing 'Three': " + hashMap);

        // Iterating over the HashMap
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}