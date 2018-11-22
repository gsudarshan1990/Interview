package com.nwarkexamples;

import java.util.Scanner;

/*********************************************************************************
* (Reverse an array) The reverse method in Section 7.7 reverses an array by      *
* copying it to a new array. Rewrite the method that reverses the array passed   *
* in the argument and returns this array. Write a test program that prompts the  *
* user to enter ten numbers, invokes the method to reverse the numbers, and      *
* displays the numbers.                                                          *
*********************************************************************************/

public class ReverseArrayWithFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[10];
		int reverse[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 integers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int[] reversearray=reverse(a);
		for(int i=0;i<10;i++)
		{
			System.out.println(reversearray[i]);
		}
	}
	
	public static int[] reverse(int[] array)
	{
		int reverse[]=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			reverse[i]=array[array.length-1-i];
		}
		return reverse;
	}

}
