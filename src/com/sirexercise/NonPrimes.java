package com.sirexercise;

public class NonPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=2;i<=100;i++)
		{
			checkPrime(i);
		}
	}
	
	public static void checkPrime(int number)
	{
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				System.out.print(number+",");
				break;
			}
		}
	}

}
