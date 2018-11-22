package com.Interview;

public class EqualArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a=new int[6];
		int[] b=new int[a.length];
		
		b=a;
		for(int i=0;i<b.length;i++)
		{
			b[i]=i;
		}
		System.out.println("Printing A array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Printing B Array");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
