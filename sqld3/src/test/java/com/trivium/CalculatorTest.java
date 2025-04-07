package com.trivium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * This is the unit test code for the calculator.
 */
class CalculatorTest {

//	@Test 
//	void testAdd() {
//		Calculator calculator = new Calculator();
//		int result = calculator.add(2, 3);
//		assertEquals(5, result); // will fail
//	}

//	@Test 
//	void testSubtract() {
//		Calculator calculator = new Calculator();
//		int result = calculator.subtract(5, 3);
//		assertEquals(2, result);
//	}
//	
//	@Test
//	void testMultiply() {
//		Calculator calculator = new Calculator();
//		int result = calculator.multiply(20, 2);
//		assertEquals(40, result);
//	}
//	
	@Test
	void testDivide() {
		Calculator calculator = new Calculator();
		int result = calculator.divide(25, 5);
		assertEquals(5, result);
	}
}
