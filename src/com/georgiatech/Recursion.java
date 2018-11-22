package com.georgiatech;

public class Recursion {

	public void neverEnd()
	{
		System.out.println("This function never ends");
		neverEnd();
	}
	
	
	public int sumOfNumbers(int x)
	{
		if(x==1)
			return 1;
		else
			return x+sumOfNumbers(x-1);
	}
	
	public int productOFNumbers(int n)
	{
		if(n==1)
			return 1;
		else
			return n*productOFNumbers(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Recursion r=new Recursion();
		//r.neverEnd();
		System.out.println("The sum of 10 numbers:"+r.sumOfNumbers(10));
		System.out.println("The product of first 5 numbers is:"+r.productOFNumbers(5));
		
	}

}
