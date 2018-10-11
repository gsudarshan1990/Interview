package com.example;

public class StudentPoly extends PersonPoly {

	public StudentPoly(String name)
	{
		super(name);
	}
	
	@Override
	public boolean isAsleep(int hr)
	{
		return 2 < hr && 8 > hr;
	}
}
