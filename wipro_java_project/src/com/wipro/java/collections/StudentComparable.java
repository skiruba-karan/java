package com.wipro.java.collections;

public class StudentComparable implements Comparable<StudentComparable> {
    private int id;
    private String name;
    private int marks;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public StudentComparable(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Corrected compareTo method
    @Override
    public int compareTo(StudentComparable other) {
        return this.marks - other.marks; // Ascending order
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

