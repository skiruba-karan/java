package com.wipro.java.collections;

import java.util.Comparator;

class Rate implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return Double.compare(movie2.getRate(), movie1.getRate()); // Descending order
    }
}
