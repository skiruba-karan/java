package com.wipro.java.oops;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library printedBook = new PrintedBook("Harry Potter","J.K.Rowling",1997,"Fiction",200);
		Library ebook = new Ebook("The Chronicles of Narnia","C.S.Lewis",1950,"Fiction",50);
		printedBook.displayDetails();
		System.out.println();
		ebook.displayDetails();
		
	}

}
