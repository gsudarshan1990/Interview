package com.example;

public class ArrayLocation {

	public double coords[];
	
	public ArrayLocation(double[] coords)
	{
		this.coords=coords;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] coords= {5.0,0.0};
		ArrayLocation accra=new ArrayLocation(coords);
		System.out.println(accra.coords[0]);
		coords[0]=32.9;
		coords[1]=-117.2;
		System.out.println(accra.coords[0]);
				
	}

}
