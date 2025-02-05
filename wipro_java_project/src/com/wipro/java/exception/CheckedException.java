package com.wipro.java.exception;


public class CheckedException {

	public static void withdraw(float balance, float amount)throws Exception{
		
		if(amount>balance) {
			throw new Exception("Insufficient funds! Available Balance: "+balance);
		}else {
			System.out.println("Withdrawal successful! Remaining Balance: "+(balance-amount));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Checked Exception");
		try {
			withdraw(500,1000);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
//		Unchecked Exception Demonstration
		System.out.println("Unchecked Exception");
		int num1 = 4;
		int num2 = 0;
		try {
			int result = num1/num2;
			System.out.println("Result: "+result);
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Execution completed");
		}
	}

}
