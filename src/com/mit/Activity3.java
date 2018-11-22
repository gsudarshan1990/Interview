
package com.mit;

import java.util.Scanner;

/* Challenge Activity 1
 * 
 * This program should take two integer inputs:
 *  length and width of a rectangle. 
 *  using those inputs it should calculate and display the 
 *  the area and perimeter of the recrangle. 
 * 
 *  Area = Length x Width
 *  Perimeter 2 x Length x Width
 * 
 * SAMPLE RUN: 
 *  Enter Length: 7
 *  Enter Width: 5
 *  Perimeter : 24
 *  Area : 35
 */

public class Activity3 {

	public static void area(int l,int b)
	{
		int a=l*b;
		System.out.println("Area is:"+a);
	}
	
	public static void perimeter(int l,int b)
	{
		int p=2*(l+b);
		System.out.println("Perimeter:"+p);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		int length=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		int breadth=sc.nextInt();
		area(length,breadth);
		perimeter(length,breadth);
	}

}
