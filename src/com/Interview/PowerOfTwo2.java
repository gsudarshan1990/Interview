package com.Interview;

public class PowerOfTwo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=Integer.parseInt(args[0]);
		int powerOfTwo=1;
		
		for(int i=0;i<=n;i++)
		{
			System.out.println(i+"  "+powerOfTwo);
			powerOfTwo=2*powerOfTwo;
		}
	}

}
