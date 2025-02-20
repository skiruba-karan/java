package com.wipro.java.collections.linkedlist;

public class LinkedList {
	 private Node head;

	    // Insert a new node at the end
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	    }

	    // Delete a node by value
	    public void delete(int data) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        if (head.data == data) {
	            head = head.next;
	            return;
	        }
	        Node temp = head;
	        while (temp.next != null && temp.next.data != data) {
	            temp = temp.next;
	        }
	        if (temp.next == null) {
	            System.out.println("Element not found.");
	        } else {
	            temp.next = temp.next.next;
	        }
	    }

	    // Display the linked list
	    public void display() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("NULL");
	    }

}
