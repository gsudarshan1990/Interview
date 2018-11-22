package com.nwarkexamples;

import java.util.Scanner;

/*
(Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
For simplicity, assume a year has 365 days. Here is a sample run:
*/

public class NumberOfYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of days");
		int minutes=sc.nextInt();
		int year=365;
		int days=24;
		int minutesperhour=60;
		int totalNumberOfMinutesPerYear=year*days*minutesperhour;
		System.out.println("The total number of minutes per year:"+year*days*minutesperhour);
		
		double totalNumberOfYears=minutes/totalNumberOfMinutesPerYear;
		System.out.println("Total number of years:"+totalNumberOfYears);
		
	}

}
