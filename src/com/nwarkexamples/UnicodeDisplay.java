package com.nwarkexamples;

import java.util.Scanner;

/*
(Find the Unicode of a character) Write a program that receives a character and
displays its Unicode.
*/

public class UnicodeDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character to display its unicode");
		char c=sc.next().charAt(0);
		System.out.println("Unicode is :"+(int)c);
		
	}

}
