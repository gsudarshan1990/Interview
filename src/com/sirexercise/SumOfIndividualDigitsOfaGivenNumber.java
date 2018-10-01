package com.sirexercise;

import java.util.Scanner;

public class SumOfIndividualDigitsOfaGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to calculate sum of its digits");
		int number=sc.nextInt();
		int sum=0,remainder=0;
		int actualnumber=number;
		while(number!=0)
		{
			remainder=number%10;
			sum=sum+remainder;
			number=number/10;
			
		}
		
		System.out.printf("The sum of its digits in number:%d is %d",actualnumber,sum);
	}

}
