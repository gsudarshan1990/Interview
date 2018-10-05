package com.sirexercise;

import java.util.Scanner;

public class SecondHighestNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of integers in the array");
		int number=sc.nextInt();
		int[] array1=new int[number];
		System.out.println("Enter the digits in the array");
		
		for(int i=0;i<array1.length;i++)
		{
			array1[i]=sc.nextInt();
		}
		
		int first=array1[0];
		int second=array1[1];
		
		if(first<second)
		{
			first=array1[1];
			second=array1[0];
		}
		
	//System.out.println(first);
	//System.out.println(second);
	
	for(int i=2;i<array1.length;i++)
	{
		if(array1[i]>second)
		{
			if(array1[i]>first)
			{
				second=first;
				first=array1[i];
			}
			else
			{
				second=array1[i];
			}
		}
		
		
	}
	System.out.println("The second highest number is :"+second);
	}

}
