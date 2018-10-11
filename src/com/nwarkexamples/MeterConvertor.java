package com.nwarkexamples;

import java.util.Scanner;

/*
(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
*/

public class MeterConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double onemeter=0.305;
		Scanner sc=new Scanner(System.in);
		System.out.println("This program is to convert feets to meters");
		System.out.println("Enter the feet");
		double feet=sc.nextDouble();
		double meter=onemeter*feet;
		System.out.println("Feet:"+feet+" meter:"+meter);
		
	}

}
