package com.wipro.java.collections;

import java.util.Comparator;

public class AgeComparator implements Comparator<AnimalComparator> {
    @Override
    public int compare(AnimalComparator a1, AnimalComparator a2) {
        return Integer.compare(a1.getAge(), a2.getAge()); // Sorting by age in ascending order
    }
}
