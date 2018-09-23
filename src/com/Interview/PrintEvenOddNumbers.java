package com.Interview;

import java.util.Scanner;

public class PrintEvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintEvenOddNumbers p=new PrintEvenOddNumbers();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number till which even and odd numbers shoult be print");
		int number=sc.nextInt();
		System.out.println("=============Even Numbers===========");
		p.evenNumbers(number);
		System.out.println("==============Odd Numbers===========");
		p.oddNumbers(number);
	}
	
	public void evenNumbers(int n)
	{
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}
	
	public void oddNumbers(int n)
	{
		for(int i=0;i<=n;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
				
		}
	}

}
