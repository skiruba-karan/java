package com.wipro.java.collections;

public class MovieComparable implements Comparable<MovieComparable> {
    private String name;
    private double rate;
    private int year;

    
    public MovieComparable(String name, double rate, int year) {
        this.name = name;
        this.rate = rate;
        this.year= year;
    }

    // compareTo method
    @Override
    public int compareTo(MovieComparable m) {
        return this.year - m.year; // Ascending order
    }

	public String getName() {
		return name;
	}

	public double getRate() {
		return rate;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "MovieComparable [name=" + name + ", rate=" + rate + ", year=" + year + "]";
	}

   
}

