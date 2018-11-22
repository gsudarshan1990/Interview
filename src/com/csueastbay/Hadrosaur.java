package com.csueastbay;

public class Hadrosaur extends Dinosaur {

	private String height="A medium-sized herbivorous";
	private String diet="herbivorous";
	private String speed="fast-moving";
	private int yearNamed=1999;
	private String area="Europe";
	
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
