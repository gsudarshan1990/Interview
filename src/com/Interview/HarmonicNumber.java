package com.Interview;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number=Double.parseDouble(args[0]);
		double sum=0;
		double i;
		for(i=1;i<=number;i++)
		{
		
			sum+=1.0/i;
		}
		
		System.out.println(sum);
	}

}
