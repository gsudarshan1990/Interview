package com.mit;

import java.util.Scanner;

/* Challenge Activity 3 - Area and Perimeter of a right triangle
This activity is similar to the video lesson. You will take input for lengths of 
sides a and b of of a right triangle, en.wikipedia.org/wiki/Right_triangle
then calculate the area and perimeter.
the area is easy:  0.5 x a x b
the permieter is: a + b + c where c is calculated by the pythagorean theorem
to be the square root of a squared + b squared
SAMPLE OUTPUT:
Enter Right Triangle Side A : 3
Enter Right Triangle Side B : 4
Area: 6.000000; Perimeter: 12.000000
*/

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values required");
		System.out.println("Enter Right Triangle Side A :");
		int sideA=sc.nextInt();
		System.out.println("Enter Right Triangle Side B :");
		int sideB=sc.nextInt();
		double area=0.5*sideA*sideB;
		
		double sideC=Math.sqrt(Math.pow(sideA, 2)+Math.pow(sideB, 2));
		
		double perimeter=sideA+sideB+sideC;
		
		System.out.printf("Aread:%3.6f; Perimeter:%3.6f", area,perimeter);
	}

}
