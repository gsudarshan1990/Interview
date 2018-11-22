package com.nwarkexamples;

import java.util.Scanner;

/*
(Geometry: area of a pentagon) Write a program that prompts the user to enter
the length from the center of a pentagon to a vertex and computes the area of the
pentagon, as shown in the following figure.
where r is the length from the center of a pentagon to a vertex. Round up two digits
after the decimal point.
*/

public class AreaOfPentagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc=new Scanner(System.in);
		System.out.println("Please provide the appropriate values");
		System.out.println("Please provide the radious of the pentagon");
		int radius=sc.nextInt();
		double area=(5*Math.pow(radius, 2)*(Math.sin(Math.toRadians(360/5))))/2.0;
		System.out.printf("Area is %5.2f",area);
		
	}

}
