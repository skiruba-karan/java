package com.wipro.java.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class StudentList{
    public static void main(String[] args) {
        List<StudentComparable> students = new ArrayList<>();
        students.add(new StudentComparable(1, "Alice", 85));
        students.add(new StudentComparable(2, "Bob", 75));
        students.add(new StudentComparable(3, "Charlie", 90));

        // Sorting using Comparable
        Collections.sort(students);

        // Display sorted list
        for (StudentComparable s : students) {
            System.out.println(s);
        }
    }
}
