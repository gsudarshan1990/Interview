package com.Interview;

import java.util.Scanner;

public class SumOFEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOFEvenNumbers s=new SumOFEvenNumbers();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number till which sum is calcluated");
		int number=sc.nextInt();
		System.out.print("Sum of even number:");
		s.sumOfEvenNumbers(number);
		System.out.println();
		System.out.print("Sum of Odd Numbers:");
		s.sumOfOddNumbers(number);
		
	}

	public void sumOfEvenNumbers(int n)
	{
		int count=0;
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				count=count+i;
			}
		}
		System.out.print(count);
	}
	
	public void sumOfOddNumbers(int n)
	{
		int count=0;
		for(int i=0;i<=n;i++)
		{
			if(i%2==1)
			{
				count=count+i;
			}
		}
		
		System.out.print(count);
	}
}
