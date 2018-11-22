package com.nwarkexamples;

import java.util.Scanner;

/*
(Physics: acceleration) Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as shown in the following formula:
                                  v1 - v0
                             a = ---------
                                     t
Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
and displays the average acceleration.
*/

public class Acceleration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the initial velocity");
		int v0=sc.nextInt();
		System.out.println("Enter the final velocity");
		int v1=sc.nextInt();
		System.out.println("Enter the time taken to reach the final velocity");
		int time=sc.nextInt();
		
		double acceleration=(v1-v0)/time;
		System.out.println("Acceleration is:"+acceleration);
		
	}

}
