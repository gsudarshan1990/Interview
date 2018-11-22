package com.nwarkexamples;
/*
(Conversion from kilograms to pounds) Write a program that displays the following
table (note that 1 kilogram is 2.2 pounds):
Kilograms     Pounds
1                2.2
3                6.6
...
197            433.4
199            437.8
*/

public class ConvertKilogramsToPound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double POUND_PER_KG=2.2;
		
		System.out.printf("kilograms        pounds\n");
		for(int i=1;i<200;i++)
		{
			System.out.printf("%-15d%6.1f\n",i,i*POUND_PER_KG );
		}
	}

}
