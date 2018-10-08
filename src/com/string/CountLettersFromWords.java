package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CountLettersFromWords {
	
	static int count=0;
	static int j=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of words to calculate highest repititive letters");
		int number=sc.nextInt();
		char[] wordchar;
		String[] str=new String[number];
		char alphabetvalue='\0';
		int j=0;
		for(int i=0;i<number;i++)
		{
			str[i]=sc.next();
		}

		//Print all values
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		for(String word:str)
		{
			wordchar=word.toCharArray();
			for(char c:wordchar)
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
		}
		
			System.out.println(hmap);	
			Collection<Integer> integervalues=hmap.values();
			List<Integer> integervaluelist=new ArrayList<Integer>(integervalues);
			Collections.sort(integervaluelist);

			Set<Entry<Character,Integer>> entryvalue=hmap.entrySet();
			
			for(Entry<Character,Integer> value:entryvalue)
			{
				if(value.getValue()==integervaluelist.get(integervaluelist.size()-1))
				{
					System.out.println(value.getKey());
					count++;
				}
			}
			
			System.out.println();
			char[] alphabetorder=new char[count];
			if(count==1)
			{
				System.exit(1);
			}
			else
			{
				for(Entry<Character,Integer> value:entryvalue)
				{
					for(int i=0;i<count;i++)
					{	
						if(value.getValue()==integervaluelist.get(integervaluelist.size()-i-1))
						{
							//System.out.println(value.getKey());
								alphabetorder[j++]=value.getKey().charValue();
						}
						break;
					}
						
				}
				
				System.out.println();
				Arrays.sort(alphabetorder);
				System.out.println(alphabetorder[0]);
			}
	}

}
