package com.wipro.java.collections.linkedlist;

public class UserLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        System.out.println("Linked List:");
        list.display();
        
        System.out.println("Deleting 20...");
        list.delete(20);
        list.display();
    }
}
