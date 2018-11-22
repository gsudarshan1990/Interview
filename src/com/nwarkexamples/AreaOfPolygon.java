package com.nwarkexamples;

import java.util.Scanner;

/*
(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
which all sides are of the same length and all angles have the same degree (i.e., the
polygon is both equilateral and equiangular). The formula for computing the area
of a regular polygon is

Area=s^2n/4tan(180/n)

Here, s is the length of a side. Write a program that prompts the user to enter the
number of sides and their length of a regular polygon and displays its area.
*/

public class AreaOfPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details required");
		System.out.println("Enter the number of sides of polygon");
		int n=sc.nextInt();
		System.out.println("Enter the length of the polygon");
		int length=sc.nextInt();
		double area=(Math.pow(length, 2)*n)/4*Math.tan(Math.toRadians(180/n));
		System.out.printf("Area is %5.2f",area);
		
	}

}
