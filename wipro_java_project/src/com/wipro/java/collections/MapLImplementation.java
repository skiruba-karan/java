package com.wipro.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapLImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<>();
//		Key - value Pairs
		map.put(1,"BMW");
		map.put(2, "Mercedes");
		map.put(3, "Rolls-Royce");
//		Accessing values by keys
		System.out.println("Key 1: "+map.get(1)); 
		System.out.println("Key 2: "+map.get(2));
//	   Checking if a key exists in the map
		if(map.containsKey(3)) {
			System.out.println("Key 3 exists with the value :"+map.get(3));
		}
		
//		Iterating over the map using for-each loop
		System.out.println("\nIterating through the map: ");
		for(Map.Entry<Integer,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		map.remove(2);
		
		System.out.println("\nMap after removal of key 2:");
		for(Map.Entry<Integer,String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		
	}

}
