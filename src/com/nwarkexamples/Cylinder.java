package com.nwarkexamples;

import java.util.Scanner;

/*
(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * pi
volume = area * length
*/

public class Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius and length of the cylinder");
		System.out.println("Enter the radius");
		double radius=sc.nextDouble();
		System.out.println("Enter the length");
		double length=sc.nextDouble();
		
		double area=radius*radius*Math.PI;
		double volume=area*length;
		
		
		System.out.println("Area:"+area+" volume:"+volume);
	}

}
