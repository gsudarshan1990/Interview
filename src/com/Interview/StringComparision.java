package com.Interview;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Test";
		String s2=new String("Test");
		
		if(s1==s2)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("Not Same");
		}
		
		System.out.println("Using Comparator :"+s1.compareTo(s2));
	}

}
