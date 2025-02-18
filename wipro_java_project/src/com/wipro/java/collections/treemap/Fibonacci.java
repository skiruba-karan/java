package com.wipro.java.collections.treemap;

import java.util.TreeMap;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();
        scanner.close();

        TreeMap<Integer, Long> fibonacciMap = new TreeMap<>();

        // Generating Fibonacci series and storing it in TreeMap
        for (int i = 0; i < n; i++) {
            fibonacciMap.put(i, fibonacci(i));
        }

        // Printing the Fibonacci series from TreeMap
        System.out.println("Fibonacci Series stored in TreeMap:");
        for (var entry : fibonacciMap.entrySet()) {
            System.out.println("Term " + entry.getKey() + ": " + entry.getValue());
        }
    }

    // Recursive method to calculate Fibonacci number
    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
