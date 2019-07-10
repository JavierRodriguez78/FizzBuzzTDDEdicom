package com.javier.rodriguez.FizzBuzzTDD;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class FizzBuzzTest  extends TestCase
{
	
	@Test
	public void itShoudReturnFizzIfDivisibleByThree()
	{
		//Arragnge
		FizzBuzz fizzBuzz = new FizzBuzz();
		int value = 3;
		
		//Act
		boolean result = fizzBuzz.isFizz(value);
		
		//Assertion
		assertTrue(result);
	}
	
}

