package com.wipro.java.collections.treemap;

import java.util.*;  

public class Treemap{
    public static void main(String[] args) {
        // 1. Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // 2. Adding elements using put()
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Mango");
        treeMap.put(5, "Orange");
        treeMap.put(4, "Grapes");
        
        // Display the TreeMap (sorted by key)
        System.out.println("TreeMap: " + treeMap);

        // 3. Access elements using get()
        System.out.println("Value for key 3: " + treeMap.get(3));

        // 4. Remove an element using remove()
        treeMap.remove(2);
        System.out.println("After removing key 2: " + treeMap);

        // 5. Get first and last entry
        System.out.println("First Entry: " + treeMap.firstEntry());
        System.out.println("Last Entry: " + treeMap.lastEntry());

        // 6. Get keys and values separately
        System.out.println("Keys: " + treeMap.keySet());
        System.out.println("Values: " + treeMap.values());

        // 7. Iterate through the TreeMap
        System.out.println("Iterating through TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 8. Checking existence of keys and values
        System.out.println("Contains key 3? " + treeMap.containsKey(3));
        System.out.println("Contains value 'Apple'? " + treeMap.containsValue("Apple"));

        // 9. Retrieve elements using higherKey(), lowerKey(), floorKey(), and ceilingKey()
        System.out.println("Higher Key than 3: " + treeMap.higherKey(3));
        System.out.println("Lower Key than 3: " + treeMap.lowerKey(3));
        System.out.println("Floor Key of 3: " + treeMap.floorKey(3));
        System.out.println("Ceiling Key of 3: " + treeMap.ceilingKey(3));

        // 10. Reverse order using descendingMap()
        System.out.println("TreeMap in Descending Order: " + treeMap.descendingMap());

        // 11. Clear the TreeMap
        treeMap.clear();
        System.out.println("TreeMap after clear(): " + treeMap);
    }
}
