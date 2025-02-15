package com.wipro.java.collections.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Hashmap {
    public static void main(String[] args) {
        // 1. Create a HashMap
        HashMap<String, Integer> languages = new HashMap<>();
        
        // 2. Add elements to HashMap using put()
        languages.put("Java", 8);
        languages.put("Python", 3);
        languages.put("JavaScript", 1);
        System.out.println("Initial HashMap: " + languages);
        
        // 3. Access elements using get()
        System.out.println("Value of Java: " + languages.get("Java"));

        // 4. Access keys, values, and key-value pairs
        System.out.println("Keys: " + languages.keySet());
        System.out.println("Values: " + languages.values());
        System.out.println("Key/Value pairs: " + languages.entrySet());

        // 5. Change value using replace()
        languages.replace("Python", 5);
        System.out.println("Updated HashMap after replace(): " + languages);

        // 6. Remove elements using remove()
        languages.remove("JavaScript");
        System.out.println("Updated HashMap after remove(): " + languages);

        // 7. Iterate through HashMap
        System.out.print("Iterating through Keys: ");
        for (String key : languages.keySet()) {
            System.out.print(key + " ");
        }

        System.out.print("\nIterating through Values: ");
        for (Integer value : languages.values()) {
            System.out.print(value + " ");
        }

        System.out.print("\nIterating through Entries: ");
        for (Entry<String, Integer> entry : languages.entrySet()) {
            System.out.print(entry + " ");
        }
        System.out.println();

        // 8. Create a HashMap from another Map (TreeMap)
        TreeMap<String, Integer> evenNumbers = new TreeMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("TreeMap: " + evenNumbers);

        HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("HashMap from TreeMap: " + numbers);
    }
}
