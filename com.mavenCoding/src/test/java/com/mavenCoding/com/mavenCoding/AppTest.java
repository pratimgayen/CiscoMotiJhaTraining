package com.mavenCoding.com.mavenCoding;



import junit.framework.TestCase;

/**
 * This is a JUnit Test cases
 * In App.java we have defined all the geometric functions
 * Now with JUnit Framework we are testing the test cases for each funtions
 * @author pgayen
 *
 */
public class AppTest extends TestCase {
	
	//This is  a correct test case for addition
	public void testAddition() {
		int resultExpected = 12;
		int resultActual = App.addition(5, 7);
		assertEquals(resultExpected, resultActual);
	}
	
	//This is  a fail test case for addition
	public void testFailAddition() {
		int resultExpected = 9;
		int resultActual = App.addition(5, 7);
		assertEquals(resultExpected, resultActual);
	}

	//This is  a correct test case for substraction
	public void testSubstraction() {
		int resultExpected = 0;
		int resultActual = App.substraction(7, 7);
		assertEquals(resultExpected, resultActual);
	}

	//This is  a fail test case for substraction
	public void testFailSubstraction() {
		int resultExpected = 2;
		int resultActual = App.substraction(7, 7);
		assertEquals(resultExpected, resultActual);
	}

	//This is  a correct test case for multiplication
	public void testMultiplication() {
		int resultExpected = 25;
		int resultActual = App.multiplication(5, 5);
		assertEquals(resultExpected, resultActual);
	}

	//This is  a fail test case for multiplication
	public void testFailMultiplication() {
		int resultExpected = 2;
		int resultActual = App.multiplication(5, 5);
		assertEquals(resultExpected, resultActual);
	}

	//This is  a correct test case for division
	public void testDivision() {
		int resultExpected = 5;
		int resultActual = App.division(25, 5);
		assertEquals(resultExpected, resultActual);
	}

	//This is  a fail test case for division
	public void testFailDivision() {
		int resultExpected = 2;
		int resultActual = App.division(25, 5);
		assertEquals(resultExpected, resultActual);
	}
}
