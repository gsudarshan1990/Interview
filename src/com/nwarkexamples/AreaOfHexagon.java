package com.nwarkexamples;

import java.util.Scanner;

/*
(Geometry: area of a hexagon) Write a program that prompts the user to enter the
side of a hexagon and displays its area.

A=3√3(a^2)/2

*/

public class AreaOfHexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the following details");
		System.out.println("Enter the side of the hexagon");
		int side=sc.nextInt();
		double area=((3*Math.sqrt(3))/2)*Math.pow(side, 2);
		System.out.println("Area of the hexagon is:"+area);
	}

}
