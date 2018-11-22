package com.Interview;

import java.util.Date;

public class DateClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Todays date is:");
		System.out.print(new Date());
		System.out.println();
		Date date=new Date();
		int day=date.getDay();
		System.out.println(day);
		int Date=date.getDate();
		System.out.println(Date);
		int year=date.getYear();
		System.out.println(year);
	}

}
