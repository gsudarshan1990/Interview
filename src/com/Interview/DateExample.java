package com.Interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 
 * Write a Date class in Java with four private instance variables; 
 * day, month, year and time zone, plus
 * (1) constructors, (2) a method to display a date, (3) a method to check whether a date (like "Feb 31, 1995") is valid or not, and (4) a method to calculate a person's age based on their birthday.
 * 
 */

public class DateExample {

	int date;
	int month;
	int year;
	int timezone;
	Date d=new Date();
	String timezone1;
	Calendar calendar=Calendar.getInstance();
	
	
	public DateExample()
	{		
		date=calendar.get(Calendar.DATE);
		month=calendar.get(Calendar.MONTH);
		year=calendar.get(Calendar.YEAR);

	}
	public void displaydate()
	{
		System.out.println("Date:"+date);
		System.out.println("Month:"+month);
		System.out.println("Year:"+year);
		System.out.println("Timezone:"+timezone);
		System.out.println(d.toString());
	}
	
	public void checkDate(String inputdate)
	{
		SimpleDateFormat smdfrmt=new SimpleDateFormat("MMMMM dd,YYYY");
		try
		{
			Date givenDate=smdfrmt.parse(inputdate);
			System.out.println("Given date is correct");
		}
		catch(ParseException e)
		{
			System.out.println("Given date is incorrect");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateExample dateexample=new DateExample();
		dateexample.displaydate();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check whether a date is valid or not");
		String inputdate=sc.nextLine();
		dateexample.checkDate(inputdate);
	}

}
