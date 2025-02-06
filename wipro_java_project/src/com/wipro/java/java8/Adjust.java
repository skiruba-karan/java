package com.wipro.java.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
public class Adjust {
//	Function to check date and time according to our requirement
	public static void checkingAddjusters()
	{
		LocalDate date = LocalDate.now();
		System.out.println("The current date is "+date);
	
//		to get the first day of next month
		LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfMonth());
		
		System.out.println("First day of Next Month "+dayOfNextMonth);

//	get the next Saturday
		LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Next Saturday from now is "+nextSaturday);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
