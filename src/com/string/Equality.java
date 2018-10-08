package com.string;

public class Equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String welcome1=new String("Welcome to UCSC!");
		String welcome2=new String("Welcome to UCSC!");
		
		if(welcome1==welcome2)
		{
			System.out.println("Stirngs are same");
		}
		
		if(welcome1.equals(welcome2))
		{
			System.out.println("Same value");
		}
			
		String str1="Welcome!";
		String str2="Welcome!";
		
		if(str1==str2)
		{
			System.out.println("Same!");
		}
			
				
	}

}
