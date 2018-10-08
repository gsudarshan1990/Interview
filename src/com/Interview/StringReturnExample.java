package com.Interview;

public class StringReturnExample {

	String mystring="This is my string";
	
	String stringTester(boolean doesReturnGreeting)
	{
		if(doesReturnGreeting)
		{
			return mystring;
		}
		else
		{
			String s=new Boolean(doesReturnGreeting).toString();
			return s;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringReturnExample example=new StringReturnExample();
		String s=example.stringTester(true);
		String s1=example.stringTester(false);
		System.out.println(s);
		System.out.println(s1);
	}

}
