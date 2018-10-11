package com.example;

import java.util.Scanner;

public class SplitAndMax {

	public static int splitAndMax(String s)
	{
		String split[]=s.split("#");
		int[] number=new int[split.length];
		for(int i=0;i<split.length;i++)
		{
			number[i]=Integer.parseInt(split[i]);
		}
		
		int temp;
		for(int i=0;i<number.length;i++)
		{
			for(int j=i+1;j<number.length;j++)
			{
				if(number[i]<number[j])
				{
					temp=number[j];
					number[j]=number[i];
					number[i]=temp;
					
				}
			}
		}
		
		
		return number[0];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string whose format is integers separated with the # symbol");
		String s=sc.nextLine();
		int max=splitAndMax(s);
		System.out.println(max);
	}

}
