package com.wipro.java.junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
private final Calculator calculator = new Calculator();

	@Test
	public void testAdd() {
		int result = calculator.add(3,2);
		assertEquals(5,result);
	}

}
