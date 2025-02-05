package com.wipro.java.oops;

public class PrintedBook extends Book {
	private int numberOfPages;
	
	public PrintedBook(String title, String author, int publicationYear, String genre, int numberOfPages) {
		// TODO Auto-generated constructor stub
		super(title, author, publicationYear, genre);
		this.numberOfPages = numberOfPages;
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("Pages: " + numberOfPages + " (Printed Book)");
	}

}
