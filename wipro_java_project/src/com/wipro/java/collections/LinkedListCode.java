package com.wipro.java.collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		List<Integer> l1 = new LinkedList<Integer>();
		for(int i = 1; i<=n;i++) {
			l1.add(i);			
		}
		System.out.println(l1);
//		Remove element from index 3
		l1.remove(3);
		System.out.println(l1);
		System.out.println();
		for(int i = 0;i<l1.size();i++) {
			System.out.println(l1.get(i)+" ");
		}

	}

}
