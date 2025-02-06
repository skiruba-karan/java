package com.wipro.java.collections;

import java.util.Comparator;

class Name implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getName().compareTo(movie2.getName()); // Ascending order
    }
}
