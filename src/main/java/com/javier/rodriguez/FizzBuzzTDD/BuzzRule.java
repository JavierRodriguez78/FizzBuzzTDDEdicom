package com.javier.rodriguez.FizzBuzzTDD;

public class BuzzRule  implements RuleInterface{

	private static final int BUZZ_FACTOR = 5;
	
	
	public boolean match(int value) {
		// TODO Auto-generated method stub
		return 0 == value%BUZZ_FACTOR;
	}

	public String getReplacement() {
		// TODO Auto-generated method stub
		return "Buzz";
	}

}
