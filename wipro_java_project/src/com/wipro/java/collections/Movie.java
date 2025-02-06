package com.wipro.java.collections;

public class Movie {
    private String name;
    private double rate;
    private int year;

    // Corrected Constructor
    public Movie(String n, double r, int y) {
        this.name = n;   
        this.rate = r;   
        this.year = y;   
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
}
