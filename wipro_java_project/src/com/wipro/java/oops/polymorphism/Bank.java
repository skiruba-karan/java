package com.wipro.java.oops.polymorphism;

public class Bank {
	private int accountNumber;
	private String accountName;
	private float balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	void deposit(float amount) {
		balance+=amount;
		System.out.println("Amount Deposited");
	}
	void withdraw(float amount) {
		if(amount>balance) {
			System.out.println("Insufficient balance!");
		}
		else {
			balance -=amount;
			System.out.println("Amount Debited sucessfully!");
		}
	}
	void showAccountDetails() {
		System.out.println("Account Number: "+getAccountNumber());
		System.out.println("Name: "+getAccountName());
		System.out.println("Balance: "+getBalance());
	}
}
