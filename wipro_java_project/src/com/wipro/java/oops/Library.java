package com.wipro.java.oops;

public abstract class Library {
	private String title;
	private String author;
	private int publicationYear;
	abstract void displayDetails();
	
	public Library(String title, String author, int publicationYear) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
// Encapsulation: Getter
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	
}
