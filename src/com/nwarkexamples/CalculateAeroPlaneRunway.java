package com.nwarkexamples;

import java.util.Scanner;

/*
(Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:
												v^2
									length = ---
												 2a
Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2), and displays the minimum runway
length.
*/

public class CalculateAeroPlaneRunway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the following details");
		System.out.println("Enter the velocity at which the aeroplane takesoff");
		int v=sc.nextInt();
		System.out.println("Enter the acceleration ");
		int a=sc.nextInt();
		//length of runway
		
		int length=(int) (Math.pow(v, 2)/(2*a));
		System.out.println("Length of the runway is"+length);
		
	}

}
