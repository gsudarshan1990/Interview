package com.Interview;

import java.util.Scanner;

public class ScanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the next input here");
		String firstword=sc.next();
		System.out.println(firstword);
		sc.nextLine();
		System.out.println("Enter the next line here");
		String line=sc.nextLine();
		System.out.println(line);
		
		System.out.println("Enter the integer value here");
		int value=sc.nextInt();
		System.out.println(value);
		
		System.out.println("Enter the boolean value here");
		boolean val=sc.hasNext();
		System.out.println(val);
		
		
	}

}
