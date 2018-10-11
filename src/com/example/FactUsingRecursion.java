package com.example;

import java.util.Scanner;

public class FactUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number till which factorial can be calculated");
		int number=sc.nextInt();
		int factorial=fact(number);
		System.out.println(factorial);
	}
	
	public static int fact(int num)
	{
		if(num==0)
			return 1;
		else
			return num*fact(num-1);
	}

}
