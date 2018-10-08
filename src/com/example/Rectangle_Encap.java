package com.example;

public class Rectangle_Encap {

	private int width,length;
	
	public void setWidth(int width)
	{
		this.width=width;
	}
	
	public void setLength(int length)
	{
		this.length=length;
	}
	
	public int calculateArea()
	{
		return width*length;
	}
	
	public int calculatePerimeter()
	{
		return 2*(length+width);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle_Encap r=new Rectangle_Encap();
		r.setLength(10);
		r.setWidth(5);
		System.out.println("Area:"+r.calculateArea());
		System.out.println("Perimeter:"+r.calculatePerimeter());
	}

}
