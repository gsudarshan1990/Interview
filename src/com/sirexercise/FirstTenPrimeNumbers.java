package com.sirexercise;

public class FirstTenPrimeNumbers {

	static int count=0;
	static boolean flag;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			int j=2;
			while(FirstTenPrimeNumbers.count<=10)
			{
				checkprime(j,FirstTenPrimeNumbers.count);
				j++;
			}
		System.out.println(FirstTenPrimeNumbers.count);
	}
	static void checkprime(int number,int countnumber)
	{
		FirstTenPrimeNumbers.flag=true;
		while(countnumber<=10)	
		{		
			
			for(int i=2;i<=number/2;i++)
			{
				
				if(number%i==0)
				{
					flag=false;	
					
				}
			}
					
			if(flag)
			{
				System.out.println("The number is a prime number:"+number);
				FirstTenPrimeNumbers.count++;
				break;
			}
			else
			{
				break;
			}
		}
		
		
		
	
	}

}
