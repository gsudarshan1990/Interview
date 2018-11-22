package com.csueastbay;

public class Dinosaur {
	
	private String name;
	private String height;
	private double weight;
	private String speed;
	private String diet;

	
	public String getName()
	{
		return name;
	}
	
	public String getHeight()
	{
		return height;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public String getSpeed()
	{
		return speed;
	}
	
	public String getDiet()
	{
		return diet;
	}
	
	public void Eat() 
	{
		System.out.println("Eats");
	}
	
	public void Speed()
	{
		System.out.println("Moves");
	}
	
	public void Area()
	{
		System.out.println("location");
	}
}
