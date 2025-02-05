package com.wipro.java.collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Define the number of elements to add to the list
        int n = 5;
        
        // Create a LinkedList of Integer objects
        List<Integer> l1 = new LinkedList<Integer>();
        
        // Add numbers from 1 to n into the list
        for (int i = 1; i <= n; i++) {
            l1.add(i); // Adds the element at the end of the list
        }
        
        // Print the entire list after adding elements
        // Expected output: [1, 2, 3, 4, 5]
        System.out.println(l1);
        
        // Remove the element at index 3 (0-based index)
        // This removes the fourth element in the list, which is '4'
        l1.remove(3);
        
        // Print the list after removal
        // Expected output: [1, 2, 3, 5]
        System.out.println(l1);
        
        // Print an empty line for separation
        System.out.println();
        
        // Iterate over the list using a for loop and print each element
        for (int i = 0; i < l1.size(); i++) {
            // Print each element followed by a space
            System.out.println(l1.get(i) + " ");
		}

	}

}
