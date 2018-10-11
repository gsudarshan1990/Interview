package com.example;

import java.util.Scanner;

public class Recursion {

	public static int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number till which factorial needs to be calculated");
		int number=sc.nextInt();
		/*int result=1;
		for(int i=1;i<=number;i++)
		{
			result=result*i;
		}
		System.out.println(result);*/
		
		int factorial=fact(number);
		System.out.println(factorial);
	}

}
