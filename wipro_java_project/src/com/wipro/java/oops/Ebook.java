package com.wipro.java.oops;

public class Ebook extends Book{
	private float fileSize;
	public Ebook(String title, String author, int publicationYear, String genre, float fileSize) {
		// TODO Auto-generated constructor stub
		super(title, author, publicationYear, genre);
		this.fileSize = fileSize;
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println("File Size: " + fileSize + "MB (Ebook)");
	}

}
