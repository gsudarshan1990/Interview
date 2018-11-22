package com.nwarkexamples;

import java.util.Scanner;

/*********************************************************************************
* (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The     *
* bubblesort algorithm makes several passes through the array. On each pass,     *
* successive neighboring pairs are compared. If a pair is not in order, its      *
* values are swapped; otherwise, the values remain unchanged. The technique is   *
* called a bubble sort or sinking sort because the smaller values gradually      *
* “bubble” their way to the top and the larger values “sink” to the bottom.      *
* Write a test program that reads in ten double numbers, invokes the method,     *
* and displays the sorted numbers.                                               *
*********************************************************************************/

public class BubbleSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number[]=new double[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 double values");
		for(int i=0;i<number.length;i++)
		{
			number[i]=sc.nextDouble();
		}
		double sorted[]=bubbleSort(number);
		
		
		for(int i=0;i<sorted.length;i++)
		{
			System.out.println(sorted[i]);
		}
	}
	
	public static double[] bubbleSort(double[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<array[i])
				{
					double temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		
		return array;
	}

}

