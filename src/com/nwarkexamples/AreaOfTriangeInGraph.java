package com.nwarkexamples;

import java.util.Scanner;

/*
(Geometry: area of a triangle) Write a program that prompts the user to enter
three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
area=1/2|(x1(y2−y3)+x2(y3−y1)+x3(y1−y2))|
*/

public class AreaOfTriangeInGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the following details");
		System.out.println("Enter the detail for P point");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		System.out.println("Enter the detail for Q point");
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		System.out.println("Enter the detail for R point");
		double x3=sc.nextDouble();
		double y3=sc.nextDouble();
		double area=(1.0/2.0)*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
		double absoulutearea=Math.abs(area);
		System.out.println("Enter the area :"+absoulutearea);
				
		
				
	}

}
