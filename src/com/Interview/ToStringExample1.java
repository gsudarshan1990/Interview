package com.Interview;

class Person
{
	private int date;
	private int month;
	private int year;
	
	public Person(int date,int month,int year)
	{
		this.date=date;
		this.month=month;
		this.year=year;
	}
	
	public String toString()
	{
		return String.format("%d/%d/%d", date,month,year);
	}
}

public class ToStringExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person sudarshan=new Person(1,6,1990);
		Person raju=new Person(12,12,1958);
		System.out.println(sudarshan);
		System.out.println(raju);
	}

}
