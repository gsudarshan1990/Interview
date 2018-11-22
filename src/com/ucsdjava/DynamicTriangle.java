package com.ucsdjava;

import java.util.Scanner;

public class DynamicTriangle {

	public static void DrawTriangle(int N)
	{
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of starst");
		int number=sc.nextInt();
		DrawTriangle(number);
	}

}
