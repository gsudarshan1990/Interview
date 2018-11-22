package com.nwarkexamples;

/*
(Conversion from miles to kilometers) Write a program that displays the following
table (note that 1 mile is 1.609 kilometers):
Miles           Kilometers
1               1.609
2               3.218
...
9               14.481
10              16.090
*/


public class MilesToKiloMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double MILES_TO_KM=1.609;
		
		System.out.print("Miles     kilometer\n");
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%-10d%5.3f\n",i,i*MILES_TO_KM );
		}
	}

}
