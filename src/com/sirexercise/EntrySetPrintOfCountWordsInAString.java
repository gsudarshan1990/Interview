package com.sirexercise;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class EntrySetPrintOfCountWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to calculate its word count");
		String value=sc.nextLine();
		String[] valuearray=value.split(" ");
		
		HashMap<String,Integer> hmap=new HashMap<String,Integer>();
		
		for(String word:valuearray)
		{
			if(hmap.containsKey(word))
			{
				int count=hmap.get(word);
				hmap.put(word, count+1);
			}
			else
			{
				hmap.put(word, 1);
			}
		}
		
		System.out.println(hmap);
	
		
		Set<Entry<String,Integer>> entryset=hmap.entrySet();
		
		for(Entry<String,Integer> entryvalue:entryset)
		{
			System.out.println("The string is --"+entryvalue.getKey()+" : and count is\t"+entryvalue.getValue());
		}
	}

}
