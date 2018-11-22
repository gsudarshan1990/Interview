package com.nwarkexamples;

public class RandomCapitalLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int value=(int)(Math.random()*26);
		int asciivalue=65+value;
		System.out.println((char)asciivalue);
	}

}
