package com.javier.rodriguez.FizzBuzzTDD;

public class FizzBuzz {
	
	

	private static final int BUZZ_FACTOR = 5;
	private static final int FIZZ_FACTOR = 3;

	public boolean isFizz(int value)
	{
		return 0 == value%FIZZ_FACTOR;
	}
	

	public boolean isBuzz(int value)
	{
		return 0 == value%BUZZ_FACTOR;
	}
	
	public boolean isFizzBuzz(int value)
	{
		return this.isFizz(value) && this.isBuzz(value);
	}
	
}
