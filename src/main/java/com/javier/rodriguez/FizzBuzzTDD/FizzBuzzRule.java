package com.javier.rodriguez.FizzBuzzTDD;

public class FizzBuzzRule implements  RuleInterface{


	private static final int BUZZ_FACTOR = 5;
	private static final int FIZZ_FACTOR = 3;

	public boolean match(int value) {
		// TODO Auto-generated method stub
		return  ((0==value % FIZZ_FACTOR) && (0==value%BUZZ_FACTOR));
 	}

	public String getReplacement() {
		// TODO Auto-generated method stub
		return "FizzBuzz";
	}

}
