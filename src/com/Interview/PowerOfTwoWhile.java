package com.Interview;

public class PowerOfTwoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=Integer.parseInt(args[0]);
		int powerOfTwo=1;
		int i=0;
		while(i<=n)
		{
			System.out.println(i+" "+powerOfTwo);
			powerOfTwo*=2;
			i++;
		}
	}

}
