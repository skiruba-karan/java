package com.wipro.java.collections.usecase2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class EmployeeManagementApplication {
	public static void main(String[] args) {
		TreeMap<Integer,Employee> treeMap = new TreeMap<>();
		treeMap.put(103, new Employee(103,"Alice","HR"));
		treeMap.put(101, new Employee(101,"Bob","Developer"));
		treeMap.put(102, new Employee(102,"Charlie","Finance"));
		treeMap.put(106, new Employee(106,"Tregger","Developer"));
		treeMap.put(104,new Employee(104,"Charles","Finance"));
		treeMap.put(105, new Employee(105,"James","HR"));
		
		
		System.out.println("Employees (Sorted by ID - TreeMap): ");
		for(Employee emp:treeMap.values()) {
			System.out.println(emp);
		}
		
		HashMap<Integer,Employee> employeeHashMap = new HashMap<>(treeMap);
		System.out.println("\nEmployees (Unordered - HashMap): ");
		for(Employee emp: employeeHashMap.values()) {
			System.out.println(emp);
		}
		
		HashSet<String> departmentSet = new HashSet<>();
		 for (Employee emp : treeMap.values()) {
	            departmentSet.add(emp.getDepartment()); // Using getter
	        }
	        System.out.println("\nDepartments (Unique - HashSet): " + departmentSet);
		
	}
	
}
