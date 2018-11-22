package com.Interview;

import java.util.Scanner;

/*
 * Write a Java program that (1) takes 2 strings from the keyboard, and (2) counts the number of occurrences of the 2nd string in the 1st string.
 */

public class NumberOfOccurencesOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String firstline=sc.nextLine();
		System.out.println("Enter the second string");
		String secondString=sc.next();
		String[] split=firstline.split(" ");
		int count=0;
		for(int i=0;i<split.length;i++)
		{
			if(split[i].equals(secondString))
			{
				count++;
			}
		}
		
		System.out.println(count);
	 }

}
