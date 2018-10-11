package com.example;

public class PersonPoly {

	private String name;
	
	public PersonPoly(String name)
	{
		this.name=name;
	}
	
	public boolean isAsleep(int hr)
	{
		return 22 < hr || 7 > hr;
	}
	
	public String toString()
	{
		return name;
	}
	
	public void status(int hr)
	{
		if(this.isAsleep(hr))
		{
			System.out.println("Now Offile:"+this);
		}
		else
		{
			System.out.println("Now online:"+this);
		}
	}
}
