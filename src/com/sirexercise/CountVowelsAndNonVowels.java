package com.sirexercise;

import java.util.Scanner;

public class CountVowelsAndNonVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to find number of vowels and non vowels");
		String values=sc.next();
		//String value="Hello";
		int vowels=0,nonvowels=0;
		char c;
		for(int i=0;i<values.length();i++)
		{
			c=values.charAt(i);
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )
			{
				vowels++;
			}
			else
			{
				nonvowels++;
			}
		}
		
		System.out.printf("%d number of vowels and %d number of non vowels ",vowels,nonvowels);
	}

}
