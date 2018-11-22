package com.nwarkexamples;
/*
(Financial application: monetary units) Rewrite Listing 2.10, ComputeChange
.java, to fix the possible loss of accuracy when converting a double value to an
int value. Enter the input as an integer whose last two digits represent the cents.
For example, the input 1156 represents 11 dollars and 56 cents.
*/

import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the following details");
		System.out.println("Enter the monetary data");
		int number=sc.nextInt();
		int paisa=number%100;
		int rupee=number/100;
		System.out.println("Rupee:"+rupee+"\nPaisa:"+paisa);
	}

}
