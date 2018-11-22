package com.sirexercise;


/*
 * 
 * Program to count number of characters in each word of the given String
 */
import java.util.Scanner;

public class CountCharactersInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line="This is java programming";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character to calculate its occurences in each word");
		char ch=sc.next().charAt(0);
		String[] split=line.split(" ");
		int[] count=new int[split.length];
		String toCheck="";
		for(int i=0;i<split.length;i++)
		{
			toCheck=split[i];
			for(int j=0;j<toCheck.length();j++)
			{
				if(ch == toCheck.charAt(j))
				{
					count[i]++;
				}
			}
			System.out.println("The String:"+split[i]+" character :"+ch+"-"+count[i]);
		}
	}

}
