package com.Interview;

public class RandomInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=Integer.parseInt(args[0]);
		
		double d=Math.random();
		
		int value=(int)(d*n);
		System.out.println(value);
	}

}
