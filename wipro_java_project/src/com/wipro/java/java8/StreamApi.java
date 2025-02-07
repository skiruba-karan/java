package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("BMW","Mercedes","Rolls-Royce");
		List<String> stream = list.stream(). //Object to Stream
				filter(name->name.startsWith("R")). //Filters the name starting with R
				collect(Collectors.toList()); // It is then collected as List
		System.out.println(stream);
		
		List<String> stream1 = list.stream(). //Object to Stream
				map(String::toUpperCase).// Changes to UpperCase
				collect(Collectors.toList()); // It is then collected as List
		System.out.println(stream1);
				
		
		}

}
