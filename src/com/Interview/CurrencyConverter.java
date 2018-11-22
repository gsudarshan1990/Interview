package com.Interview;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double EURO_PER_DOLLAR=0.87;
		
		Scanner sc=new Scanner(System.in);
		
		double dollar=0;
		double euro=0;
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the amount of euros");
			euro=sc.nextDouble();
			dollar=euro*EURO_PER_DOLLAR;
			System.out.println("Dollar:"+dollar);
		}
		String euroString="";
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the amount of dollar");
			dollar=sc.nextDouble();
			euro=dollar/EURO_PER_DOLLAR;
			DecimalFormat df=new DecimalFormat("0.00");
				euroString=df.format(euro);
			
			System.out.println("Euro:"+euroString);
		}
	}

}
