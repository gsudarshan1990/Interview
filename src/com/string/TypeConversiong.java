package com.string;

public class TypeConversiong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="22";
		int myInt=Integer.parseInt(str);
		
		int number=23;
		String myString1=Integer.toString(number);
		
		int number1=24;
		String myString2=String.valueOf(number1);
		
		System.out.println(myInt);
		System.out.println(myString1);
		System.out.println(myString2);
		
		
	}

}
