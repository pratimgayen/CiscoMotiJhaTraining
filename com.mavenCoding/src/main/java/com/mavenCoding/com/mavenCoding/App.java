package com.mavenCoding.com.mavenCoding;

/**
 * This is an App.java file where we are defining the geometric functions
 * before building this java file we are going to do the test cases using
 * JUnit in AppTest.java.
 * @author pgayen
 *
 */
public class App 
{

	//This is an addition function
	public static int addition(int numberOne, int numberTwo) {
		int result = 0;
		if (numberOne != 0 && numberTwo != 0)
			result = numberOne + numberTwo;
		return result;
	}

	//This is  a substraction function
	public static int substraction(int numberOne, int numberTwo) {
		int result = 0;
		if (numberOne >= numberTwo)
			result = numberOne - numberTwo;
		return result;
	}

	//This is a multiplication function
	public static int multiplication(int numberOne, int numberTwo) {
		int result = 0;
		if (numberOne != 0 && numberTwo != 0)
			result = numberOne * numberTwo;
		return result;
	}

	//This is a division function
	public static int division(int numberOne, int numberTwo){

		int result = 0;
		if (numberOne >= numberTwo && numberTwo != 0)
			result = numberOne / numberTwo;
		return result;
	}
}
