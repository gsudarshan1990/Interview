package com.mit;

import java.util.Scanner;

/* Challenge Activity 2 - Palindrome Detector.
 * 
 * Write a program which given a string input will detect whether that
 * string is a palindrome. see: https://en.wikipedia.org/wiki/Palindrome 
 * for details.
 * 
 * HINT: use the reversePhrase method of StringBuilder to assist you.
 * 
 * SAMPLE OUTPUT:
 * 
 *   Enter phrase : abba 
 *   That's a palindrome!
 * 
 *   Enter phrase : mike 
 *   That's not a palindrome!
 * 
 */

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter phrase");
		String input=sc.next();
		StringBuilder sb=new StringBuilder(input);
		StringBuilder reverse=sb.reverse();
		String reverse1=sb.toString();
		
		if(reverse1.equals(input))
		{
			System.out.println("That's a palindrome!");
		}
		else
		{
			System.out.println("That's not a palindrome!");
		}
	}

}
