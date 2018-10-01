package com.sirexercise;

import java.util.Scanner;

public class CountOFAGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the count of number of integers");
		int number=sc.nextInt();
		int i=0;
		int actualnumber=number;
		while(number!=0)
		{	
			number=number/10;
			i++;
		}
		System.out.printf("Total number of digits in %d is %d",actualnumber,i);
			
	}
}
