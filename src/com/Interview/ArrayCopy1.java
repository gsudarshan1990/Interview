package com.Interview;

import java.util.Arrays;

public class ArrayCopy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] listA= {5, 10, 15, 20, 30, 35};
		int[] listB= {0, 0, 0, 0, 0, 0,0};
		listB=listA;
		System.out.println("Test1: "+listB[3]);
		listB[2]=-1;
		System.out.println("Test2: "+listA[2]);
		
		int[] copy=Arrays.copyOf(listA, listA.length);
		for(int i=0;i<copy.length;i++)
		{
			System.out.println(copy[i]);
		}
		
		int[] copy2=Arrays.copyOf(copy, copy.length);
				for(int n:copy2)
				{
					System.out.println(n);
				}
				
		System.out.println(Arrays.equals(listA, copy));
	}

}
