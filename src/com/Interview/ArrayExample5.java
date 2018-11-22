package com.Interview;

public class ArrayExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {3, 2, 1};
		int[] b= {4, 5, 6, 7, 8};
		int[] list= {9, 8, 7, 6, 5, 4};
		
		//System.out.println(a);
		//System.out.println(b);
		
		printArray(a);
		printArray(b);
		swap(list,1,5);
		swap(list,2,3);
		printArray(list);
		
	}

	static void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	
	static void swap(int[] array,int initial,int last)
	{
		int temp=array[initial];
		array[initial]=array[last];
		array[last]=temp;
	}
}
