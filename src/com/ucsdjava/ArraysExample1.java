package com.ucsdjava;

import java.util.Arrays;

public class ArraysExample1 {

	public static void windowPosSum(int[] a,int n)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
				continue;
			for(int j=i;j<j+n;j++)
			{
				if(j==a.length)
					break;
				else
				{
					System.out.println(j);
					a[i]=a[i]+a[j];
				}
				n--;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] a = {1, 2, -3, 4, 5, 4};
		    int n = 3;
		    windowPosSum(a, n);
		    System.out.println(Arrays.toString(a));
	}

}
