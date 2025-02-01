package com.wipro.java;

public class MyClass {
	int num = 5;
	 
    public void changeValue(int num) {
        this.num = num;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass(); // creates an object obj for class MyClass
		obj.changeValue(10); // call the method changeValue to update the num 10
        System.out.println(obj.num);//Prints the updated num value

	}

}
