package com.csueastbay;

public class Apatosaurus extends Dinosaur{

	private String height="A very large herbivorous";
	private String diet="herbivorous";
	private String speed="slow-moving";
	private int yearNamed=1877;
	private String area="North-America";

	
	public void Eat() 
	{
		System.out.println(diet);
	}
	
	public void Speed()
	{
		System.out.println(speed);
	}
	
	public void Area()
	{
		System.out.println(area);
	}
}
