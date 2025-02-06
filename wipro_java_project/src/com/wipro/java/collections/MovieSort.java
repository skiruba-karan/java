package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class MovieSort {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Force Awakens", 8.3, 2015));
        movies.add(new Movie("Star Wars", 8.7, 1977));
        movies.add(new Movie("Harry Potter", 8.9, 2004));

        // Sorting by Rate (Descending)
        Collections.sort(movies, new Rate());
        System.out.println("\nMovies sorted by Rate:");
        for (Movie m : movies) {
            System.out.println(m.getName() + " " + m.getRate() + " " + m.getYear());
        }

        // Sorting by Name (Alphabetically)
        Collections.sort(movies, new Name());
        System.out.println("\nMovies sorted by Name:");
        for (Movie m : movies) {
            System.out.println(m.getName() + " " + m.getRate() + " " + m.getYear());
        }
        
        // Sorting by Year (Ascending)
       Collections.sort(movies,new Year());
       System.out.println("\nMovies sorted by Year:");
       for(Movie m:movies) {
    	   System.out.println(m.getName()+" "+m.getRate()+" "+m.getYear());
       }
    }
}
