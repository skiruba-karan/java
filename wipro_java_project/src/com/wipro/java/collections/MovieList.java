package com.wipro.java.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class MovieList{
    public static void main(String[] args) {
    	  ArrayList<MovieComparable> movies = new ArrayList<>();
          movies.add(new MovieComparable("Force Awakens", 8.3, 2015));
          movies.add(new MovieComparable("Star Wars", 8.7, 1977));
          movies.add(new MovieComparable("Harry Potter", 8.9, 2004));

        // Sorting using Comparable
        Collections.sort(movies);

        // Display sorted list
        for (MovieComparable s :movies) {
            System.out.println(s.getName()+" "+s.getRate()+" "+s.getYear());
        }
    }
}
