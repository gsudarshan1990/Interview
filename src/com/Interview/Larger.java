package com.Interview;

public class Larger {

	public static int larger(int x,int y)
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println(larger(a,b));
	}

}
