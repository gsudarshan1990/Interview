package com.Interview;

import java.util.Scanner;

/*
 * Write a method called checkPrime() that takes an integer parameter and returns either true or false depending upon whether or not the number is a prime.
 *  The skeleton of the method is provided below, you just have to fill in the code. Here is the pseudo-code for checkPrime(int x):
 * 
 */

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number the to check whether number is prime or not");
		int number=sc.nextInt();
		boolean result=checkPrime(number);
		if(result)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}
	}

	public static boolean checkPrime(int number)
	{
		for(int i=2;i<=Math.sqrt(number);i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
}
