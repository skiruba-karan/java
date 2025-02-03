/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 *  Parent Class = Employee
 * Child Class = ProjectLead
 * extends = Keyword
 */
public class ProjectLead extends Employee {

	/**
	 * 
	 */
	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
//		Child object is instantiated from child constructor
//		Parent class consumes the properties and behaviors of child class
		
		Employee employee = new ProjectLead();
		employee.setEmployeeId(1234);
		employee.setName("ProjectLead 1");
		employee.setSalary(550000f);
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
	}

}
