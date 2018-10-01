package com.Interview;

public class FirstTenPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=3;
		for(int i=2;i<=11;)
		{
			for(int j=2;j<number/2;j++)
			{
				if(number%i==0)
				{
					break;
				}
				else
				{
					System.out.printf("%d is a prime number",number);
				}
			}
			number++;
		}
		

		
	}

}
