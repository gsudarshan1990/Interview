package com.nwarkexamples;

import java.util.Scanner;

/*
(Reverse the numbers entered) Write a program that reads ten integers and displays
them in the reverse of the order in which they were read. 
*/

public class ReverseNumber {

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
		
		for(int i=0;i<a.length;i++)
		{
			reverse[a.length-1-i]=a[i];
		}
		
		System.out.println("Reverse is:");
		for(int i=0;i<reverse.length;i++)
		{
			System.out.println(reverse[i]);
		}
	}

}
