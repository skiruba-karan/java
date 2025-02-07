package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(7, 8, 14, 12,9);
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());

		System.out.println(sortedNumbers);

		List<Integer> numbers1 = Arrays.asList(1, 2, 7, 5, 3);
		int min = numbers1.stream().min(Integer::compare).get();
		int max = numbers1.stream().max(Integer::compare).get();

		System.out.println(numbers1);
		System.out.println(min);
		System.out.println(max);

				
		
		}

}