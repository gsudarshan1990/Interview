package com.mit;

import java.util.Random;
import java.util.Scanner;

/*
 * DEBUG THIS! Exercise
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program will generate a random number between 1 and 5 then as you to
 * "guess" the number. It will tell you if you're right or not.
 *
 * Examples:    Pick a number between 1 and 5 : 4
 *              You guessed it!
 * 
 *              Pick a number between 1 and 5 : 4
 *              So close it was 2.
 */

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Pick a number between 1 and 5 :");
		int number=sc.nextInt();
		Random generator=new Random();
		int value=generator.nextInt(5);
		if(number==value)
		{
			System.out.println("You guessed it!");
		}
		else
		{
			System.out.println(" So close it was "+value);
		}
		
	}

}
