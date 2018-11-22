package com.nwarkexamples;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String value=sc.next();
		
		System.out.println("Length of the string:"+value.length());
		System.out.println("The first character of String is:"+value.charAt(0));
	}

}
