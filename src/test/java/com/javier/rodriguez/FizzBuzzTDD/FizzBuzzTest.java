package com.javier.rodriguez.FizzBuzzTDD;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/**
 * Unit test for simple App.
 */

@RunWith(DataProviderRunner.class)
public class FizzBuzzTest 
{
	@DataProvider
	public static Object[][] dataNumberProviderForFizz(){
		
		return new Object[][] {
			{3, true},
			{6, true},
			{15, false},
			{18, true}
			};
		}
	
	@DataProvider
	public static Object[][] dataNumberProviderForBuzz(){
		return new Object[][] {
			{5, true},
			{10, true},
			{15, false},
			{25, true}
			
		};
	}
	
	@Test
	@UseDataProvider("dataNumberProviderForFizz")
	public void itShoudReturnFizzIfDivisibleByThree(final int input, final boolean expected)
	{
		//Arragnge
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		
		//Act
		boolean result = fizzBuzz.isFizz(input);
		
		//Assertion
		assertEquals(expected, result);
	}
	
	
	@Test
	@UseDataProvider("dataNumberProviderForBuzz")
	public void itShouldReturnBuzzIfDivisibleByFive(final int input, final boolean expected) {
		
		//Arragnge
				FizzBuzz fizzBuzz = new FizzBuzz();
				int value = input;
				
				//Act
				boolean result = fizzBuzz.isBuzz(value);
				
				//Assertion
				assertEquals(expected, result);
		
	}
}

