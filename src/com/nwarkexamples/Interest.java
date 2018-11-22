package com.nwarkexamples;

import java.util.Scanner;

/*
(Financial application: calculate interest) If you know the balance and the annual
percentage interest rate, you can compute the interest on the next monthly payment
using the following formula:
interest = balance * (annualInterestRate/1200)
Write a program that reads the balance and the annual percentage interest rate and
displays the interest for the next month.
*/

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the following details");
		System.out.println("Enter the balance");
		double balance=sc.nextDouble();
		System.out.println("Enter the interest");
		double annualInterestRate=sc.nextDouble();
		
		double interest=balance*(annualInterestRate/1200);
		System.out.println("Monthly interest:"+interest);
	}

}
