package com.wipro.java.oops;

public class Book extends Library{
	private String genre;
	
	public Book(String title,String author, int publicationYear, String genre) {
		// TODO Auto-generated constructor stub
		super(title,author,publicationYear);
		this.genre = genre;
	}
	public String getGenre() {
		return genre;
	}
	
	void displayDetails() {
		System.out.println("Book: " + getTitle() + " by " + getAuthor());
        System.out.println("Genre: " + genre + " | Year: " + getPublicationYear());
	}

}
