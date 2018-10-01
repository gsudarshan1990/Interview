package com.sirexercise;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check whether the number is a prime number or not");
		int number=sc.nextInt();
		
		boolean flag=true;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				flag=false;
			}
		}
		
		if(flag)
		{
			System.out.printf("%d is a prime number",number);
		}
		else
		{
			System.out.printf("%d is not a prime number", number);
		}

	}

}
