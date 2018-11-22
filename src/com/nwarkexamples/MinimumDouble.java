package com.nwarkexamples;

import java.util.Scanner;

/*********************************************************************************
* (Find the smallest element) Write a method that finds the smallest element in  *
* an array of double values using the following header:                          *
* public static double min(double[] array)                                       *
* Write a test program that prompts the user to enter ten numbers, invokes this  *
* method to return the minimum value, and displays the minimum value.            *
*********************************************************************************/

public class MinimumDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number[]=new double[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 double values");
		for(int i=0;i<number.length;i++)
		{
			number[i]=sc.nextDouble();
		}
		
		System.out.println("Minium is:"+min(number));
	}

	public static double min(double[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					double temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		
		return array[0];
	}
}
