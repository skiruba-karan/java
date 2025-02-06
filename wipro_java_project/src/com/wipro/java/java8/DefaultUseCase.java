package com.wipro.java.java8;

//Interface 1
interface InterfaceOne {
 // Default method in InterfaceOne
 default void display() {
     System.out.println("Display method from InterfaceOne");
 }
}

//Interface 2
interface InterfaceTwo {
 // Default method in InterfaceTwo
 default void display() {
     System.out.println("Display method from InterfaceTwo");
 }
}

//Class implementing both interfaces
class DefaultUseCase implements InterfaceOne, InterfaceTwo {
 // Overriding the default display method to resolve the conflict
 @Override
 public void display() {
     // Calling the display method from InterfaceOne
     InterfaceOne.super.display();
     
     // Calling the display method from InterfaceTwo
     InterfaceTwo.super.display();
     
     
//     System.out.println("Display method from DefaultUseCase (Overridden)");
 }

 public static void main(String[] args) {
     DefaultUseCase useCase = new DefaultUseCase();
     useCase.display();  // Calls the overridden method in DefaultUseCase
 }
}
