package com.mit;

import java.util.Scanner;

/*
 * DEBUG THIS! Exercise
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program will accept an integer as input and display 
 * whether the number is ODD or EVEN.
 * By defintion, an even number has no remainder when divided by 2.
 *
 * Examples:    Enter an integer : 15
 *              15 is ODD
 * 
 *              Enter an integer : -24
 *              -24 is EVEN
 */

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer:");
		int input=sc.nextInt();
		
		String result= input%2==0?"Even":"ODD";
		System.out.printf("%d is %s", input,result);
	}

}
