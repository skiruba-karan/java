package com.wipro.java.exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		int result = 10/0;
		System.out.println("Result: "+result);
		
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}finally {
			System.out.println("Execution completed");
		}
	
	}

}
