package com.mit;

import java.util.Scanner;

/*
 * DEBUG THIS! Exercise - Circles!
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program will calculate the Area and Circumfrence of a circle 
 * using user-defined functions 
 
 *
 * Examples:    Enter Circle Radius : 1.0
 *              Circumference : 6.283185; Area : 3.141593
 * 
 */

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the following values");
		System.out.println(" Enter Circle Radius :");
		double radius=sc.nextDouble();
		double circumference=2*Math.PI*radius;
		double area=Math.PI*Math.pow(radius, 2);
		System.out.printf("Circumference:%f; Area:%f",circumference,area);
		
	}
	

}
