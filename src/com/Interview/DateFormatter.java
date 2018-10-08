package com.Interview;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hours");
		int hour=sc.nextInt();
		System.out.println("Ente the minutes");
		int minute=sc.nextInt();
		System.out.println("Enter 1 for morning and 2 for evening");
		int time=sc.nextInt();
		Date date=null;
		String actualTime=null;
		String afterChangeTime=null;
		DateFormat initialformat=new SimpleDateFormat("hh:mm aa");
		
		if(time==1)
		{
			actualTime=String.valueOf(hour)+":"+String.valueOf(minute)+" AM";
		}
		else if(time==2)
		{
			actualTime=String.valueOf(hour)+":"+String.valueOf(minute)+" PM";
		}
		
	
		try {
			date=initialformat.parse(actualTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DateFormat displayformat=new SimpleDateFormat("HH:mm");
		afterChangeTime=displayformat.format(date);
		System.out.println(afterChangeTime);
		
	}

}
