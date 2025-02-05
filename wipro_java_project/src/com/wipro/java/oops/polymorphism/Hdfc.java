package com.wipro.java.oops.polymorphism;

public class Hdfc extends Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank hdfc = new Hdfc();
		hdfc.setAccountNumber(9876543);
		hdfc.setAccountName("Alex");
		hdfc.setBalance(0.0f);
		
		hdfc.deposit(2000.0f);
		hdfc.withdraw(200.0f);
		hdfc.showAccountDetails();
	}

}
