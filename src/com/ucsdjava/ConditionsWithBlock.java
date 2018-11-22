package com.ucsdjava;

public class ConditionsWithBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=5;
		
		if(x<10)
		{
			System.out.println("I shall increment x by 10");
			x=x+10;
		}
		
		if(x<10)
		{
			System.out.println("I shall increment x by 10");
			x=x+10;
		}
		System.out.println(x);
	}

}
