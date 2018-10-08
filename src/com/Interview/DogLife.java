package com.Interview;

import java.util.Scanner;

public class DogLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int years=sc.nextInt();
		int numberOfYearsMoreThanTwo=0;
		if(years==1)
		{
			int childyears=14;
			System.out.println(childyears);
		}
		else
			if(years==2)
			{
				int childyears=22;
				System.out.println(childyears);
			}
			else
				if(years>2)
				{
					numberOfYearsMoreThanTwo=years-2;
					int childyears=22+5*numberOfYearsMoreThanTwo;
					System.out.println(childyears);
				}
	}

}
