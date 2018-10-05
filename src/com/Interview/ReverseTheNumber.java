package com.Interview;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Please choose one option from the below three options for number reverse");
		System.out.println("1.Convetional number revese");
		System.out.println("2.Number Reverse through String");
		System.out.println("3.Number Reverse through String Builder");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		System.out.println("Please enter the number to reverse");
		int number=sc.nextInt();
		switch(option)
		{
		case 1:conventionReverse(number);
				break;
		case 2:numberStringReverse(number);
				break;
		case 3:numberReverseStringBuilder(number);
				break;
		default:System.out.println("You have entered the wrong option");
				System.exit(1);
					
		}
	
				
			
	}
	
	static void conventionReverse(int number)
	{
		int remainder=0;
		int reverseNumber=0;
		while(number!=0)
		{
			remainder=number%10;
			reverseNumber=reverseNumber*10+remainder;
			number=number/10;
		}
		
		System.out.printf("The reverse number is %d",reverseNumber);
	}

	static void numberStringReverse(int number)
	{
		String numberstring=String.valueOf(number);
		String numberreverse="";
		for(int i=numberstring.length()-1;i>=0;i--)
		{
				numberreverse=numberreverse+numberstring.charAt(i);
		}
		
		int reversenumber=Integer.parseInt(numberreverse);
		System.out.printf("The reverse of a number is %d",reversenumber);
	}
	
	static void numberReverseStringBuilder(int number)
	{
		String numberstring=String.valueOf(number);
		StringBuilder sb=new StringBuilder(numberstring);
		StringBuilder reverse=sb.reverse();
		String reversenumber=sb.toString();
		int reversenumbervalue=Integer.parseInt(reversenumber);
		System.out.printf("The reverse number values is %d",reversenumbervalue);
	}
}
