package com.sirexercise;

public class TrianglePattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i,j,k;
		for(i=0;i<5;i++)
		{
			for(j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
