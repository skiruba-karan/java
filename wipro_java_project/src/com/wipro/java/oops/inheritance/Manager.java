/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * Parent Class = Employee
 * Child Class = Manager
 * extends = Keyword
 */
public class Manager extends Employee {

	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		Employee manager= new Manager();
		manager.setEmployeeId(1324);
		manager.setName("Manager 1");
		manager.setAge(27);
		manager.setSalary(500000f);
		
		System.out.println(manager.getEmployeeId());
		System.out.println(manager.getName());
		System.out.println(manager.getAge());
		System.out.println(manager.getSalary());
	}

}
