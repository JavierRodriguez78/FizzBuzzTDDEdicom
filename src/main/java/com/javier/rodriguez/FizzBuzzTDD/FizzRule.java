package com.javier.rodriguez.FizzBuzzTDD;

public class FizzRule implements RuleInterface{

	private static final int FIZZ_FACTOR = 3;
	
	public boolean match(int value) {
		// TODO Auto-generated method stub
		return 0== value%FIZZ_FACTOR;
	}

	public String getReplacement() {
		// TODO Auto-generated method stub
		return "Fizz";
	}

}
