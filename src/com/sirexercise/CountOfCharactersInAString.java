package com.sirexercise;

import java.util.HashMap;
import java.util.Scanner;

public class CountOfCharactersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to calculate number of its characters");
		String value=sc.next();
		char[] valuearray=value.toCharArray();
		
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		
		for(char c:valuearray)
		{
			if(hmap.containsKey(c))
			{
				int count=hmap.get(c);
				hmap.put(c, count+1);
			}
			else
			{
				hmap.put(c, 1);
			}
	
		}
		
		System.out.println(hmap);
	}
	

}
