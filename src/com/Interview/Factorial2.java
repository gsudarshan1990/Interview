package com.Interview;

public class Factorial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int NUM_FACTS=100;
		for(int i=0;i<NUM_FACTS;i++)
		{
			System.out.println(i+"! is"+factorial(i));
		}
		
	}
	
	public static int factorial(int value)
	{
		
		int result=1;
		for(int i=2;i<=value;i++)
		{
			result=result*i;
		}
	
		return result;
	}

}
