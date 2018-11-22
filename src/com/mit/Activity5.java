package com.mit;

import java.util.Scanner;

/*Challenge Activity 2 - degrees of a triangle
 * 
 * The sum of the 3 angles of any triangle should total 180 degrees.
 * Any more or any less then the figure cannot be a triangle.
 * 
 * Write a program to accept 3 integer angles as input and checks 
 * whether it is a valid triangle by checking the sum against 180 degrees
 * 
 * SAMPLE OUTPUT:
 * 
 *   Enter degrees for angle 1 : 50
 *   Enter degrees for angle 2 : 40
 *   Enter degrees for angle 3 : 90
 *   180 degrees. That's a GOOD triangle!
 * 
 *   Enter degrees for angle 1 : 51
 *   Enter degrees for angle 2 : 40
 *   Enter degrees for angle 3 : 90
 *   181 degrees. That's a BAD triangle!
 */

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Triangle has three angles");
		System.out.println("Enter the first angle");
		int firstAngle=sc.nextInt();
		System.out.println("Enter the second angle");
		int secondAngle=sc.nextInt();
		System.out.println("Enter the Third angle");
		int thirdAngle=sc.nextInt();
		
		int sumOfTheAngles=firstAngle+secondAngle+thirdAngle;
		if(sumOfTheAngles==180)
		{
			System.out.println(sumOfTheAngles+"degress. That's a Good triangle!");
		}
		else
		{
			System.out.println(sumOfTheAngles+"degrees. That's a BAD triangle!");
		}
	}

}
