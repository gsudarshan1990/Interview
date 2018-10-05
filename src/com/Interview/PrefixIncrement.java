package com.Interview;

public class PrefixIncrement {

	int x;
	
	public int increment()
	{
		return ++x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrefixIncrement a=new PrefixIncrement();
		System.out.println(a.increment());
	}

}
