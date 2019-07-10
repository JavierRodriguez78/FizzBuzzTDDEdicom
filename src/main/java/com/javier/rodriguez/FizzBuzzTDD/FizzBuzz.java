package com.javier.rodriguez.FizzBuzzTDD;

public class FizzBuzz {

	public boolean isFizz(int value)
	{
		return 0 == value%3;
	}
	

	public boolean isBuzz(int value)
	{
		return 0 == value%5;
	}
	
	public boolean isFizzBuzz(int value)
	{
		return this.isFizz(value) && this.isBuzz(value);
	}
	
}
