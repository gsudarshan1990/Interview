package com.Interview;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum=0;
		double count=0;
		Scanner sc=new Scanner(System.in);
		int number=0;
		boolean condition;
		while(sc.hasNext())
		{
			number=sc.nextInt();
			sum=sum+number;
				
			count++;
		}
		double average=sum/count;
		System.out.println("Average"+average);
	}

}
