package com.nwarkexamples;

/*
(Check substring) Write a program that prompts the user to enter two strings and
reports whether the second string is a substring of the first string.
*/

import java.util.Scanner;

public class StringContainsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Strings to check second string is present in first String");
		String s1=sc.nextLine();
		String s2=sc.next();
		boolean contains=s1.contains(s2);
		
		if(contains)
		{
			System.out.println("S2: \""+s2+"\" is present in S1:"+s1);	
		}
		else
		{
			System.out.println("S2: \""+s2+"\" is not present in S1:"+s1);
		}
	}

}
