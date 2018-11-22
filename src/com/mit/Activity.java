package com.mit;

import java.util.Scanner;

public class Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstname=sc.next();
		System.out.println("Enter your last name");
		String lastname=sc.next();
		
		System.out.println("Hello, "+firstname+" "+lastname);
		System.out.println("Or should I say: "+lastname+", firstname");
;	}

}
