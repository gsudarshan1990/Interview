package com.ucsdjava;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			if(a[i].contains("horse"))
			{
				break;
			}
		}
	}

}
