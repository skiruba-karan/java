package com.wipro.java.collections.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapStudents {
    public static void main(String[] args) {
        // HashMap with Integer as key (Roll Number) and List of Students as value
        HashMap<Integer, List<Student>> studentMap = new HashMap<>();
        
        // Adding 10 students, including duplicates
        addStudent(studentMap, new Student("Alice", 101));
        addStudent(studentMap, new Student("Bob", 102));
        addStudent(studentMap, new Student("Charlie", 103));
        addStudent(studentMap, new Student("Alice", 101)); // Duplicate
        addStudent(studentMap, new Student("Eve", 104));
        addStudent(studentMap, new Student("Frank", 105));
        addStudent(studentMap, new Student("Bob", 102)); // Duplicate
        addStudent(studentMap, new Student("Grace", 106));
        addStudent(studentMap, new Student("Alice", 101)); // Duplicate
        addStudent(studentMap, new Student("Hank", 107));
        
        // Display the HashMap contents
        for (Map.Entry<Integer, List<Student>> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey());
            for (Student student : entry.getValue()) {
                System.out.println("  " + student);
            }
        }
    }

    // Method to add students to the HashMap
    private static void addStudent(HashMap<Integer, List<Student>> map, Student student) {
        map.putIfAbsent(student.getRollNumber(), new ArrayList<>());
        map.get(student.getRollNumber()).add(student);
    }
}