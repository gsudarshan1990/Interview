package com.nwarkexamples;

/*
(Conversion from miles to kilometers) Write a program that displays the following
two tables side by side:
Miles         Kilometers   |   Kilometers     Miles
1             1.609        |   20             12.430
2             3.218        |   25             15.538
...
9             14.481       |   60             37.290
10            16.090       |   65             40.398
*/

public class MilesToKiloMeterViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double KM_PER_MILE=1.609;
		
		System.out.print("Miles         Kilometers     |    kilometers      Miles\n");
		char c='|';
		for(int i=1,j=20;i<=10 && j<=65;i++,j=j+5)
		{
			System.out.printf("%-15d%6.3f%9c%6d%20.3f\n", i,i*KM_PER_MILE,c,j,j/KM_PER_MILE);
		}
		
	}

}
