package com.mit;

import java.util.Scanner;

/* Challenge Activity 1 - Area of a triangle
 * 
 * The area of a triangle is (base * height) /2
 * 
 * Write a program to accept the base and height as integer values,
 * then calculate the area of the triangle, as a double..
 * 
 * Use either an explicit or implicit cast to obtain an accurate answer.
 * Remember to format the area output to 1 decimal place.
 * 
 * SAMPLE OUTPUT:
 * 
 *   Enter triangle base : 5
 *   Enter triangle height : 3
 *   Triangle area : 7.5
 */


public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values required for Processing");
		System.out.println("Enter the base length of the triange");
		int base=sc.nextInt();
		System.out.println("Enter the height length of the triange");
		int height=sc.nextInt();
		
		double area=(base*height)/2.0;
		
		System.out.printf("Area is %2.1f",area);
	}

}
