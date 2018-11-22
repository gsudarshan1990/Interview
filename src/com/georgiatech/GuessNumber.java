package com.georgiatech;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand=new Random();
		int number=rand.nextInt(11);
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		
		int yournumber=sc.nextInt();
	
			
			if(number==yournumber)
			{
				System.out.println("Yay! You guessed it. It was "+number);
			}
			else
			{
				if(number>yournumber)
				{
					System.out.println("Higher");
				}
				else
				{
					System.out.println("Lower");
				}
			}
		
	
	}

}
