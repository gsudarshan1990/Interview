package com.ucscjava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the options \n 1. Recursive 2.Non recurse");
		int option=sc.nextInt();
		System.out.println("Enter the number to which factorial needs to calculated");
		int number=sc.nextInt();
		int fact=1;
		
		switch(option)
		{
		case 1: fact=fact_Recur(number);
				break;
		case 2:fact=fact_NonRecur(number);
		break;
		}
				
		System.out.println(fact);
	}
	
	public static int fact_NonRecur(int number)
	{
		int fact=1;
		
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	

	public static int fact_Recur(int number)
	{
		if(number==0)
			return 1;
		else
			return number*fact_Recur(number-1);
	}
}
