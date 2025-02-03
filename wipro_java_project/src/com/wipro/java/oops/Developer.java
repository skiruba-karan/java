/**
 * 
 */
package com.wipro.java.oops;

/**
 *  Parent Class = Employee
 * Child Class = Developer
 * extends = Keyword
 */
public class Developer extends Employee {

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		Employee developer = new Developer();
		developer.setEmployeeId(1243);
		developer.setName("Developer 1");
		developer.setAge(23);
		developer.setSalary(350000f);
		
		System.out.println(developer.getEmployeeId());
		System.out.println(developer.getName());
		System.out.println(developer.getAge());
		System.out.println(developer.getSalary());
	}

}
