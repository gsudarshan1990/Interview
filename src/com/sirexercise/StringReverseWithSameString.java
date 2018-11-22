package com.sirexercise;


/*
 * 
 * Program to reverse a String using the Same String
 */
import java.util.Scanner;

public class StringReverseWithSameString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String to reverse");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		//String str="Test";
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			str=str+str.charAt(i);
		
		}
		str=str.substring(length, str.length());
		System.out.println(str);
	}

}
