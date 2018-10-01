package com.sirexercise;

import java.util.Scanner;

public class ReverseOfStringCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to find its reverse");
		String value=sc.next();
		char[] valuearray=value.toCharArray();
		String reverse="";
		for(int i=valuearray.length-1;i>=0;i--)
		{
			reverse=reverse+valuearray[i];
		}
		
		System.out.printf("The reverse of String %s is %s", value,reverse);
	}

}
