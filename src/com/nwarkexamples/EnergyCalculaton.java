package com.nwarkexamples;

import java.util.Scanner;

/*
(Science: calculating energy) Write a program that calculates the energy needed
to heat water from an initial temperature to a final temperature. Your program
should prompt the user to enter the amount of water in kilograms and the initial
and final temperatures of the water. The formula to compute the energy is
Q = M * (finalTemperature – initialTemperature) * 4184
where M is the weight of water in kilograms, temperatures are in degrees Celsius,
and energy Q is measured in joules.
*/

public class EnergyCalculaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the following details");
		System.out.println("Enter the amount of water required to be heated in kilograms");
		int M=sc.nextInt();
		System.out.println("Enter the initial temperature");
		int initialTemp=sc.nextInt();
		System.out.println("Enter the final temperature");
		int finalTemp=sc.nextInt();
		final int JOULES=4184;
		double Q=M*(finalTemp-initialTemp)*JOULES;
		System.out.println("Energy required to heat "+M+"Kilograms of water is:"+Q+" joules");
	}

}
