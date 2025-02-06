package com.wipro.java.collections;

import java.util.Comparator;

public class NameComparator implements Comparator<AnimalComparator> {
    @Override
    public int compare(AnimalComparator a1, AnimalComparator a2) {
        return a1.getName().compareTo(a2.getName()); // Sorting alphabetically by name
    }
}
