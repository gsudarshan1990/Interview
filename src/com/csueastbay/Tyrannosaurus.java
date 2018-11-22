package com.csueastbay;

public class Tyrannosaurus extends Dinosaur {

	private String height="A large herbivorous";
	private String diet="carnivorous";
	private String speed="fast-moving";
	private int yearNamed=1905;
	private String area="Western North-America";
	
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
