/**
 * 
 */
package com.wipro.java.oops;
/**
 * 
 */
/**
 * POJO (Plain Old Java Object)
 */
public class Employee {
	private int employeeId; //employee ID
	private String name; // employee Name
	private int age; // employee Age
	private float salary; // Salary
	private boolean isTaxApplicable;
	
	public int getEmployeeId() {  // Getter is used to get the Employee ID from the private 
		return employeeId;
	}

	public void setEmployeeId(int employeeId) { //Setter allows to modify the private field of employeeId
		this.employeeId = employeeId;
	}

	public String getName() { //Getter is used to get the getName from the private 
		return name; 
	}

	public void setName(String name) { //Setter allows to modify the private field of name
		this.name = name;
	}

	public int getAge() { //Getter allows to get the Age from the private 
		return age;
	}

	public void setAge(int age) { //Setter allows to modify the private field of age
		this.age = age;
	}

	public float getSalary() { //Getter allows to get the Salary from the private field
		return salary; 
	}

	public void setSalary(float salary) { //Setter allows to modify the private field of Salary
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", age=" + age + ", salary=" + salary
				+ ", isTaxApplicable=" + isTaxApplicable + "]";
	}


}
