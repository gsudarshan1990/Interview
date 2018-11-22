package com.nwarkexamples;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
(Decimal to hex) Write a program that prompts the user to enter an integer between
0 and 15 and displays its corresponding hex number.
*/

public class DecimaltoHexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number between 0 and 15");
		int number;
		
		try
		{
			number=sc.nextInt();
			System.out.printf("%X",number);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter the integer");
		}
		
		
	}

}
