package com.wipro.java.collections;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Declare an integer array variable
        int[] arr;
        
        // Initialize the array with a size of 5
        arr = new int[5];
        
        // Assign values to each element in the array
        arr[0] = 10; // First element is 10
        arr[1] = 20; // Second element is 20
        arr[2] = 30; // Third element is 30
        arr[3] = 40; // Fourth element is 40
        arr[4] = 50; // Fifth element is 50
        
        // Loop through the array using its length property
        for (int i = 0; i < arr.length; i++) {
            // Print the current element of the array
            System.out.println(arr[i]);
	}
	}

}
