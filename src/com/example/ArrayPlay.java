package com.example;

public class ArrayPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1= {1,2,3};
		int[] array2=array1;
		array2[1]=5;
		array2=new int[4];
		System.out.println(array1);
		System.out.println(array2);
		
	}

}
