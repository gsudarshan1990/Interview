package com.nwarkexamples;

import java.util.Scanner;

/************************************************************************************
* (Average an array) Write two overloaded methods that return the average of an     *
* array with the following headers:                                                 *
* public static int average(int[] array)                                            *
* public static double average(double[] array)                                      *
* Write a test program that prompts the user to enter ten double values, invokes    *
* this method, and displays the average value.                                      *
*************************************************************************************/

public class OverLoadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number[]=new double[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 double values");
		for(int i=0;i<number.length;i++)
		{
			number[i]=sc.nextDouble();
		}
		
		System.out.println("Average is:"+average(number));
	}
	
	public static int average(int[] array)
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		
		int average=sum/array.length;
		return average;
	}

	
	public static double average(double[] array)
	{
		double sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		
		double average=sum/array.length;
		return average;
	}
}
