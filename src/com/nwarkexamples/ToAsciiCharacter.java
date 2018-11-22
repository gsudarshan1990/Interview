package com.nwarkexamples;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
(Find the character of an ASCII code) Write a program that receives an ASCII code
(an integer between 0 and 127) and displays its character.
*/

public class ToAsciiCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer value between 0 and 12765");
		int asciiinteger;
		try
		{
			asciiinteger=sc.nextInt();
			if(0<asciiinteger && asciiinteger<127)
			{
				System.out.println((char)asciiinteger);
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter the integer");
		}
		
	
	}

}
