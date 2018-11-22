package com.nwarkexamples;

import java.util.Scanner;

/*
(Science: wind-chill temperature) How cold is it outside? The temperature alone
is not enough to provide the answer. Other factors including wind speed, relative
humidity, and sunshine play important roles in determining coldness outside.
In 2001, the National Weather Service (NWS) implemented the new wind-chill
temperature to measure the coldness using temperature and wind speed. The
formula is
		twc = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275tav^0.16
where ta is the outside temperature measured in degrees Fahrenheit and v is the
speed measured in miles per hour. twc is the wind-chill temperature. The formula
cannot be used for wind speeds below 2 mph or temperatures below -58 �F or
above 41�F.
Write a program that prompts the user to enter a temperature between -58 �F and
41�F and a wind speed greater than or equal to 2 and displays the wind-chill temperature.
Use Math.pow(a, b) to compute v0.16
*/

public class WindChillTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the following details");
		System.out.println("Enter the fahrenheit temperature");
		double ta=sc.nextDouble();
		System.out.println("Enter the windspeed");
		double v=sc.nextDouble();
		double twc=0.0;
		final double CONST1=35.74;
		final double CONST2=0.4275;
		if(-58<ta && ta<41)
		{
			if(v>2)
			{
				twc= CONST1+0.6215*ta-35.75*Math.pow(v, 0.16) + CONST2*ta*Math.pow(v, 0.16);
			}
			else
			{
				System.out.println("Your wind speed is wrong");
				
			}
		}
		else
		{
			System.out.println("Your temperature is wrong");
		}
		
		
		System.out.println("Windchill temperature is:"+twc);
	}

}
