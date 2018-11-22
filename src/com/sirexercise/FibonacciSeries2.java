package com.sirexercise;

public class FibonacciSeries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=1;
		int c=0;
		int sum=a+b;
		System.out.print(a+",");
		System.out.print(b+",");
		while(sum<=50)
		{
			c=a+b;
			sum+=c;
			System.out.print(c+",");
			a=b;
			b=c;
		}
	}

}
