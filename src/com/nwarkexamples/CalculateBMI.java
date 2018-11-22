package com.nwarkexamples;

import java.util.Scanner;

/*
(Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
*/

public class CalculateBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 final double POUND= 0.45359237;
		 final double INCH=0.0254;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the following details");
		 System.out.println("Enter the weight in pounds");
		 double weight=sc.nextDouble();
		 System.out.println("Enter the height in inches");
		 double height=sc.nextDouble();
		 
		 double bmi=(weight*POUND)/Math.pow(height*INCH, 2);
		 System.out.println("BMI is:"+bmi);
		 
		
	}

}
