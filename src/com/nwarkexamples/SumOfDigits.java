package com.nwarkexamples;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
(Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
*/

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Integer number between 0 and 1000");
		int remainder;
		int sum=0;
		int number;
		try
		{
			number=sc.nextInt();
			if(number>0 && number<1000)
			{
				while(number!=0)
				{
					remainder=number%10;
					sum=sum+remainder;
					number=number/10;
				}
			}
			else
			{
				System.out.println("Enter the number between 0 and 1000");
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("The enter number is not integer");
		}
		
		System.out.println("The  sum is:"+sum);
	}

}
