package com.uclajava;

import java.util.Scanner;

/**
 * Write a program (ArrayDemo.java) that prompts the user to enter 5 integer 
 * numbers. Once the user enters the 5 numbers, the program must determine and 
 * output the average, the largest, and smallest of 5 numbers.
 * 
 * @author rfelts
 */

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int[] number=new int[5];
		System.out.println("Enter the numbers in array");
		for(int i=0;i<number.length;i++)
		{
			number[i]=sc.nextInt();
		}
		
		double average=0;
		
		int sum=0;
		for(int i=0;i<number.length;i++)
		{
			sum=sum+number[i];
		}
		average=sum/number.length;
		System.out.println("Average:"+average);
		int temp=0;
		for(int i=0;i<number.length;i++)
		{
			for(int j=i+1;j<number.length;j++)
			{
				if(number[j]<number[i])
				{
					temp=number[j];
					number[j]=number[i];
					number[i]=temp;
				}
			}
		}
		
		System.out.println("Smallest values:"+number[0]);
		System.out.println("Largest values:"+number[4]);
	}

}
