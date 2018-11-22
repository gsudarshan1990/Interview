package com.nwarkexamples;

import java.util.Scanner;

/*
(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.
*/


public class GratuityTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total amount");
		double amount=sc.nextDouble();
		System.out.println("Enter the gratuity rate");
		double rate=sc.nextDouble();
		
		double gratuitysum=(amount*rate)/100.0;
		amount=amount+gratuitysum;
		System.out.println("The total amount is :"+amount);		
	}

}
