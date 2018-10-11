package com.nwarkexamples;

import java.util.Scanner;

/*
(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
*/

public class CelciusConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in Celcius");
		double celcius=sc.nextDouble();
		double farhrenheit=(9.0/5.0)*celcius+32;
		System.out.println("Celcius :"+celcius+"Farhrennheit:"+farhrenheit);
	}

}
