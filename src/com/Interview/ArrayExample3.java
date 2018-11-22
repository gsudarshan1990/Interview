package com.Interview;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list=new int[10];
		for(int i=0;i<list.length;i++)
		{
			list[i]=3*i;
		}
		
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i]);
		}
	}

}
