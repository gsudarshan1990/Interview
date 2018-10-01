package com.sirexercise;

import java.util.Scanner;

public class CountSmallCapitalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String values=sc.nextLine();
		char ch;
		int smallletterscount=0;
		int capitalletterscount=0;
		int numberscount=0;
		int specialcharacterscount=0;
		for(int i=0;i<values.length();i++)
		{
			ch=values.charAt(i);
			
			if(ch>='a' && ch <='z')
			{
				smallletterscount++;
				
			}
			else
				if(ch>='A'&& ch<='Z')
				{
					capitalletterscount++;	
				}
				else if(ch>='0'&& ch<='9')
				{
					numberscount++;
				}
				else
				{
					specialcharacterscount++;
				}
		}
		
		System.out.printf("Small letters count %d \n",smallletterscount);
		System.out.printf("Capital letters count %d \n",capitalletterscount);
		System.out.printf("Numbers count %d \n",numberscount);
		System.out.printf("Special character count %d \n", specialcharacterscount);
	}

}
