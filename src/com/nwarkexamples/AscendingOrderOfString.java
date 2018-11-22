package com.nwarkexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
(Order three cities) Write a program that prompts the user to enter three cities and
displays them in ascending order.
*/

public class AscendingOrderOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three Cities");
		System.out.println("Enter first City");
		String city1=sc.next();
		System.out.println("Enter Second City");
		String city2=sc.next();
		System.out.println("Enter third City");
		String city3=sc.next();
		
		ArrayList<String> city=new ArrayList<String>();
		city.add(city1);
		city.add(city2);
		city.add(city3);
		
		Collections.sort(city);
		
		System.out.println("Cities in Order is");
		for(String cityname:city)
		{
			System.out.println(cityname);
		}
	}

}
