package com.nwarkexamples;

import java.util.Random;

/***********************************************************************************
* (Count single digits) Write a program that generates 100 random integers between * 
* 0 and 9 and displays the count for each number. (Hint: Use an array of ten       *
* integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.) *
************************************************************************************/



public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value;
		Random generator=new Random();
		int[] count=new int[10];
		for(int i=0;i<100;i++)
		{
			value=generator.nextInt(10);
			switch(value)
			{
			case 0: count[0]++;
					break;
			case 1: count[1]++;
			break;		
			case 2:count[2]++;
			break;
			case 3:count[3]++;
			break;
			case 4:count[4]++;
			break;
			case 5:count[5]++;
			break;
			case 6:count[6]++;
			break;
			case 7:count[7]++;
			break;
			case 8:count[8]++;
			break;
			case 9:count[9]++;
			break;
			}
		}
		
		for(int i=0;i<10;i++)
		{
			System.out.println("number:"+i+"count:"+count[i]);
		}
	}

}
