package com.Interview;

import java.util.Scanner;

//-----------------------------------------------------------------------------
//ArrayEx2.java
//Reads in the length of a word list, reads in the list of words, then prints 
//out the list in reverse order.  Stores the list in an array of Strings.
//-----------------------------------------------------------------------------


public class ArrayExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of words");
		int number=sc.nextInt();
		String[] words=new String[number];
		for(int i=0;i<number;i++)
		{
			words[i]=sc.next();
		}
		
		for(int i=number-1;i>=0;i--)
		{
			System.out.println(words[i]);
		}
	}

}
