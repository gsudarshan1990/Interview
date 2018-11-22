package com.nwarkexamples;

/*
(Generate vehicle plate numbers) Assume a vehicle plate number consists of three
uppercase letters followed by four digits. Write a program to generate a plate
number.
*/

public class RandomLetterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char upperletter1=(char)(65+(int)(Math.random()*26));
		char upperletter2=(char)(65+(int)(Math.random()*26));
		char upperletter3=(char)(65+(int)(Math.random()*26));		
		int number=1000+(int)(Math.random()*(10000-1000));
		char[] uppercharacters= {upperletter1,upperletter2,upperletter3};
		String platenumberletter=new String(uppercharacters);
		String platenumber=platenumberletter+String.valueOf(number);
		System.out.println(platenumber);
	}

}
