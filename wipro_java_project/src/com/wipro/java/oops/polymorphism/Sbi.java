package com.wipro.java.oops.polymorphism;

public class Sbi extends Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank sbi = new Sbi();
		sbi.setAccountNumber(123456);
		sbi.setAccountName("Alice");
		sbi.setBalance(0.0f);
		
		sbi.deposit(1000.0f);
		sbi.withdraw(200.0f);
		sbi.showAccountDetails();
		
	}

}
