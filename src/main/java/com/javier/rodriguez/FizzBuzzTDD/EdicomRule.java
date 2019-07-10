package com.javier.rodriguez.FizzBuzzTDD;

public class EdicomRule implements RuleInterface{

	public static final int EDICOM_FACTOR = 7;
	public boolean match(int value) {
		// TODO Auto-generated method stub
		return 0 == value % EDICOM_FACTOR;
	}

	public String getReplacement() {
		// TODO Auto-generated method stub
		return "Edicom";
	}

}
