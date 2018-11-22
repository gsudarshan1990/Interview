package com.Interview;

import java.util.Scanner;

public class SelectionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int[] ages= {24, 36, 14, 35, 22, 37, 42, 25};
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
		
		for(i=0;i<ages.length;i++)
		{
			System.out.println(ages[i]);
		}
	}

}
