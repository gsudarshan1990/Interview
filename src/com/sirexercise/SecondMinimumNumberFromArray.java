package com.sirexercise;

import java.util.Scanner;

public class SecondMinimumNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int number=sc.nextInt();
		int[] array1=new int[number];
		System.out.println("Enter the integers in the array");
		for(int i=0;i<array1.length;i++)
		{
			array1[i]=sc.nextInt();
		}
		int first=array1[0];
		int second=array1[1];
		
		if(first>second)
		{
			second=array1[0];
			first=array1[1];
		}
		
		for(int i=2;i<array1.length;i++)
		{
			if(second>array1[i])
			{
				second=first;
				first=array1[i];
				
			}
			else
			{
				second=array1[i];
			}
		}
		System.out.println("The Second minimum value is:"+second);
	}

}
