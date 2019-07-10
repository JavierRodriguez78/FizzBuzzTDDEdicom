package com.javier.rodriguez.FizzBuzzTDD;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
/**
 * Unit test for simple App.
 */
public class FizzBuzzTest 
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

