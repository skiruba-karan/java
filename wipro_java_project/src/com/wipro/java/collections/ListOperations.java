package com.wipro.java.collections;

import java.util.List;
import java.util.ArrayList;

public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create the first ArrayList of Integers, l1
        List<Integer> l1 = new ArrayList<Integer>();
        
        // Add integers to l1 at specific indices
        l1.add(0, 1); // Add 1 at index 0
        l1.add(1, 2); // Add 2 at index 1
        l1.add(2, 3); // Add 3 at index 2
        
        // Print the initial list l1: [1, 2, 3]
        System.out.println(l1);
        
        // Create the second ArrayList of Integers, l2
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(5); // Add 5 to l2
        l2.add(6); // Add 6 to l2
        l2.add(7); // Add 7 to l2
        
        // Adding all elements of l2 into l1 starting at index 1
        // l1 will now be: [1, 5, 6, 7, 2, 3]
        l1.addAll(1, l2);
        
        // Print l1 after merging l2 into it
        System.out.println(l1);
        
        // Remove the element at index 1 from l1
        // This will remove the first element from the inserted l2 elements (i.e., the value 5)
        l1.remove(1);
        
        // Print l1 after removal; expected output: [1, 6, 7, 2, 3]
        System.out.println(l1);
        
        // Replace the element at index 0 with the value 5
        l1.set(0, 5);
        
        // Print l1 after setting the first element to 5; expected output: [5, 6, 7, 2, 3]
        System.out.println(l1);
	}

}
