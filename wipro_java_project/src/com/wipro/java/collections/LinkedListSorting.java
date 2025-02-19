package com.wipro.java.collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSorting {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();

        // Adding Employees to the LinkedList
        employees.add(new Employee(101, "Alice", 75000));
        employees.add(new Employee(102, "Bob", 55000));
        employees.add(new Employee(103, "Charlie", 90000));
        employees.add(new Employee(104, "David", 65000));

        System.out.println("Before Sorting:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Sorting using Comparator
        Collections.sort(employees, new SalaryComparator());

        System.out.println("\nAfter Sorting (by Salary):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
