package com.Interview;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharacterFromString {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to count characters");
		String value=sc.next();
		char[] ch=value.toCharArray();
		LinkedHashMap<Character,Integer> lhmap=new LinkedHashMap<Character,Integer>();
		for(char c:ch)
		{
			if(lhmap.containsKey(c))
			{
			
				int count=lhmap.get(c);
				lhmap.put(c,count+1);
			}
			else
			{
				lhmap.put(c, 1);
			}
		}
		
		
		System.out.println(lhmap);
	}

}
