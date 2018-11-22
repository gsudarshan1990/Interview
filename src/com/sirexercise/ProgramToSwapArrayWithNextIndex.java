package com.sirexercise;

public class ProgramToSwapArrayWithNextIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {12, 23, 45, 65, 34, 12};
		int temp=0;
		for(int i=0;i<array.length;i=i+2)
		{
			temp=array[i];
			array[i]=array[i+1];
			array[i+1]=temp;
		}
		System.out.println("Array after the swap is as follows");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+",");
		}
	}

}
