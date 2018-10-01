package com.sirexercise;

import java.util.HashMap;
import java.util.Scanner;

public class CountWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to calculate its word count");
		String line=sc.nextLine();
		String[] individualword=line.split(" ");
		
		HashMap<String,Integer> hmap=new HashMap<String,Integer>();
		
		for(String word:individualword)
		{
			if(hmap.containsKey(word))
			{
				int count=hmap.get(word);
				hmap.put(word, count+1);
			}
			else
			{
				hmap.put(word,1);
			}
		}
		System.out.println(hmap);
	}
	

}
