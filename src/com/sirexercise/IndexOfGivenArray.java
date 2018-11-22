package com.sirexercise;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {10, 90, 97, 56, 21, 14, 56};
		System.out.println("Given array is:");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+",");
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to calculate its index");
		int number=sc.nextInt();
		int count=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<array.length;i++)
		{
			if(number == array[i])
			{
				al.add(i);
			}
			
		}
	
		System.out.println(al);
	}
}
