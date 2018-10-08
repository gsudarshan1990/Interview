package com.passbyvalue;

public class StringExample {

	public static void tryString(String s)
	{
		s="a different String";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="This is a String literal";
		tryString(str);
		System.out.println("Str="+str);
	}

}
