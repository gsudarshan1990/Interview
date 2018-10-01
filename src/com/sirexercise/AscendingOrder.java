package com.sirexercise;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of integers in the array");
		int number=sc.nextInt();
		sc.nextLine();
		int[] array=new int[number];
		System.out.println("Enter the integers");
		int temp;
		for(int i=0;i<number;i++)
		{
			array[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
		
		System.out.println("Ascending order is");
		System.out.print("{");
		for(int i=0;i<array.length;i++)
		{
	
			System.out.print(array[i]+",");
			
		}
		System.out.print("}");
	}

}
