package com.javier.rodriguez.FizzBuzzTDD;

public class FizzBuzz {
	
	

	private static final int BUZZ_FACTOR = 5;
	private static final int FIZZ_FACTOR = 3;

	public static boolean isFizz(int value)
	{
		return 0 == value%FIZZ_FACTOR;
	}
	

	public static boolean isBuzz(int value)
	{
		return 0 == value%BUZZ_FACTOR;
	}
	
	public static boolean isFizzBuzz(int value)
	{
		return isFizz(value) && isBuzz(value);
	}
	
	
	public static String getReplacement(int value)
	{
		if(isFizzBuzz(value)) return "FizzBuzz";
		if(isFizz(value)) return "Fizz";
		if(isBuzz(value)) return "Buzz";
		return Integer.toString(value);
		
	}
}
