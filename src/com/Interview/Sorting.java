package com.Interview;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int[] ages= {24, 36, 14, 35, 22, 37, 42, 25};
		System.out.println("Enter one of following two options\n");
		System.out.println("1. Bubble Sort 2.Selection Sort");
		int number=sc.nextInt();
		int[] sortedarray=new int[ages.length];
		int[] selectionsortedarray=new int[ages.length];
		switch(number)
		{
		case 1: sortedarray=bubblesort(ages);
		for(int i=0;i<sortedarray.length;i++)
		{
			System.out.println(sortedarray[i]);
		}
				break;
		case 2: selectionsortedarray=selectionsort(ages);
		for(int i=0;i<selectionsortedarray.length;i++)
		{
			System.out.println(selectionsortedarray[i]);
		}
			break;
		}
	
		
		
		
	}

	public static int[] bubblesort(int[] ages)
	{
		int i,j,temp=0;

		for( i=0;i<ages.length;i++)
		{
			for(j=i+1;j<ages.length;j++)
			{
				if(ages[j]<ages[i])
				{
					temp=ages[j];
					ages[j]=ages[i];
					ages[i]=temp;
				}
			}
		}
		return ages;
	}
	
	public static int[] selectionsort(int[] ages)
	{
		int i,j,minvalue,minindex,temp;
		for(i=0;i<ages.length;i++)
		{
			minvalue=ages[i];
			minindex=i;
			for(j=i;j<ages.length;j++)
			{
				if(ages[j]<minvalue)
				{
					minvalue=ages[j];
					minindex=j;
				}
			}
			if(minvalue<ages[i])
			{
				temp=ages[i];
				ages[i]=ages[minindex];
				ages[minindex]=temp;
			}
		}
		
		return ages;
	}
}
