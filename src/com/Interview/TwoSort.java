package com.Interview;

public class TwoSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp=0;
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if(b<a)
		{
			temp=b;
			b=a;
			a=temp;
		}
		
		System.out.println(a);
		System.out.println(b);
	}

}
