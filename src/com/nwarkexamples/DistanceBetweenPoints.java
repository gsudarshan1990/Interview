package com.nwarkexamples;

import java.util.Scanner;

/*
(Geometry: distance of two points) Write a program that prompts the user to enter
two points (x1, y1) and (x2, y2) and displays their distance between them.
*/

public class DistanceBetweenPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the following details");
		int x1,y1,x2,y2;
		System.out.println("Enter the co-ordinates for P(x1,y1)");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.println("Enter the co-ordinates for Q(x2,y2)");
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		double distance=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		System.out.println("Distance between P and Q is"+distance);
	}

}
