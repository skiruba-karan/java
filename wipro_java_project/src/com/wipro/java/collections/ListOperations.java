package com.wipro.java.collections;

import java.util.List;
import java.util.ArrayList;

public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(0,1);
		l1.add(1,2);
		l1.add(2,3);
		System.out.println(l1);
		List<Integer>l2 = new ArrayList<Integer>();
		l2.add(5);
		l2.add(6);
		l2.add(7);
//		adding list l2 from 1 index
		l1.addAll(1,l2);
		System.out.println(l1);
//		Remove element from index 1
		l1.remove(1);
		System.out.println(l1);
//		set() 
		l1.set(0, 5);
		System.out.println(l1);
	}

}
