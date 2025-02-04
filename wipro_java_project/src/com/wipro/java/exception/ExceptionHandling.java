package com.wipro.java.exception;

public class ExceptionHandling {

	   public static void main(String[] args) {
	        // Declare and initialize two integer variables
	        int num1 = 15;
	        int num2 = 0; // This will cause an exception when used as a divisor

	        // Try block contains the code that may generate an exception
	        try {
	            // Attempting division by zero, which causes ArithmeticException
	            int result = num1 / num2; 
	            System.out.println("Result: " + result); // This line will not execute if an exception occurs

	        } catch (ArithmeticException e) { 
	            // Catch block handles the division by zero exception
	            System.out.println("Exception occurred: " + e.toString()); // Prints the exception details

	        } finally {
	            // Finally block always executes, regardless of exception occurrence
	            System.out.println("Execution completed");
	        }
	    }
	}
