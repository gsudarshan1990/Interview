package com.Interview;

public class DrawTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=Integer.parseInt(args[0]);
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
