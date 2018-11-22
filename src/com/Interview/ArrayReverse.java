package com.Interview;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] a = {9.3, 1.1, 7.8, 8.9, 3.0}; 
		double[] b=new double[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[a.length-1-i];
		}
		
		for(double number:b)
		{
			System.out.println(number);
		}
	}

}
