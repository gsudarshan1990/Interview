package com.nwarkexamples;

import java.util.Scanner;

/*
(Convert pounds into kilograms) Write a program that converts pounds into kilograms.
The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilograms.
*/

public class KiloGramConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double POUND_PER_KG=0.454;
		Scanner sc=new Scanner(System.in);
		System.out.println("This program converts pound to kilo gram");
		System.out.println("Enter the number of pounds to be converts");
		double pounds=sc.nextDouble();
		double kg=pounds*POUND_PER_KG;
		System.out.println("pound:"+pounds+" kg:"+kg);		
		
	}

}
