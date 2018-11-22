package com.nwarkexamples;

import java.util.Scanner;

/*
(Hex to binary) Write a program that prompts the user to enter a hex digit and
displays its corresponding binary number.
*/

public class HexaToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hexadecimal value");
		String hexa_Decimal=sc.next();
		
		int decimalnumber=Integer.parseInt(hexa_Decimal, 16);
		System.out.println(Integer.toBinaryString(decimalnumber));
	}

}
