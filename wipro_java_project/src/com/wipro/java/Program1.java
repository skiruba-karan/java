package com.wipro.java;

import java.util.LinkedList;
import java.util.Scanner;

// Generic Stack class using LinkedList
class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Push operation
    public void push(T item) {
        list.addFirst(item);
    }

    // Pop operation
    public T pop() {
        return isEmpty() ? null : list.removeFirst();
    }

    // Peek operation
    public T peek() {
        return isEmpty() ? null : list.getFirst();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }
}

// Non-editable part starts here
public class Program1 {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        
        // Read integers until a non-integer is entered
        while (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();
            integerStack.push(userInput);
        }
        scanner.next(); // Consume the non-integer input

        // Perform integer stack operations
        System.out.println("Peek: " + integerStack.peek());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Is Empty: " + integerStack.isEmpty());

        while (!integerStack.isEmpty()) {
            System.out.println("Pop: " + integerStack.pop());
        }
        System.out.println("Is Empty: " + integerStack.isEmpty());

        // String Stack
        Stack<String> stringStack = new Stack<>();
        scanner.nextLine(); // Consume leftover newline

        System.out.println("Enter strings to push onto the stack (enter an empty string to stop):");
        
        while (scanner.hasNextLine()) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break;
            }
            stringStack.push(userInput);
        }

        // Perform string stack operations
        System.out.println("Peek: " + stringStack.peek());

        scanner.close();
    }
}
