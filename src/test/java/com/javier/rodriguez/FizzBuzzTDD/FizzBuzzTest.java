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
			{15, true},
			{18, true}
			};
		}
	
	@DataProvider
	public static Object[][] dataNumberProviderForBuzz(){
		return new Object[][] {
			{5, true},
			{10, true},
			{15, true},
			{25, true}
			
		};
	}
	
	@DataProvider
	public static Object[][] dataNumberProviderForFizzBuzz(){
		return new Object[][] {
			{15, true},
			{30, true},
			{45, true},
			{60, true},
			{75, true},
			{90, true}
	
		};
	}
	
	@DataProvider
	public static Object[][] dataNumberProviderForFizzBuzzText(){
		return new Object[][] {
			{1,"1"},
			{2,"2"},
			{3, "Fizz"},
			{4, "4"},
			{5, "Buzz"},
			{6, "Fizz"},
			{15, "FizzBuzz"}
		};
	}
	
	@Test
	@UseDataProvider("dataNumberProviderForFizz")
	public void itShoudReturnFizzIfDivisibleByThree(final int input, final boolean expected)
	{
				
		//Act
		boolean result = FizzBuzz.isFizz(input);
		
		//Assertion
		assertEquals(expected, result);
	}
	
	
	@Test
	@UseDataProvider("dataNumberProviderForBuzz")
	public void itShouldReturnBuzzIfDivisibleByFive(final int input, final boolean expected) {
				
				//Act
				boolean result = FizzBuzz.isBuzz(input);
				
				//Assertion
				assertEquals(expected, result);
		
	}
	
	@Test
	@UseDataProvider("dataNumberProviderForFizzBuzz")
	public void itShouldReturnFizzBuzzIfDivisibleByThreeAndFive(final int input, final boolean expected) {
		
		
				//Act
				boolean result = FizzBuzz.isFizzBuzz(input);
				
				//Assertion
				assertEquals(expected, result);
		
	}
	
	@Test
	@UseDataProvider("dataNumberProviderForFizzBuzzText")
	public void itShouldGenerateTheCorrectReplacmentForEachNumber(final int input, final String expected) {
		
		
				//Act
				String result = FizzBuzz.getReplacement(input);
				
				//Assertion
				assertEquals(expected, result);
		
	}
	
	
	
}

