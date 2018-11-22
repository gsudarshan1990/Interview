package com.mit;

/* Challenge Activity 1 - Circle Class
 * 
 * In this challenge activity, I've created the main routine which uses a circle
 * class. you must complete the implementation of the class by wirting the methods
 * 
 * PROGRAM OUTPUT:
 *  C1 ==> Radius : 9.000000; Area : 254.469005; Circumference : 56.548668
 *  C2 ==> Radius : 4.000000; Area : 50.265482; Circumference : 25.132741
 */


public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle C1=new Circle(9);
		Circle C2=new Circle();
		C2.setRadius(4);
		System.out.println("Radius:"+C1.getRadius()+"; Area: "+C1.area()+"; Circumferenece: "+C1.perimeter());
		System.out.println("Radius:"+C2.getRadius()+"; Area: "+C2.area()+"; Circumferenece: "+C2.perimeter());
	}

}

class Circle
{
	private double radius;
	
	public Circle()
	{
		
	}
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public double area()
	{
		double area=Math.PI*Math.pow(radius, 2);
		return area;
	}
	
	public double perimeter()
	{
		double perimeter=2*Math.PI*radius;
		return perimeter;
	}
}