package com.sirexercise;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ProgramToCountDuplicatesInIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of integers in the array");
		//Sample Array {5,6,6,8,2,2,2,3,3}
		int number=sc.nextInt();
		int[] array=new int[number];
		System.out.println("Enter the numbers for the array");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		
		for(int value:array)
		{
			if(hmap.containsKey(value))
			{
				int count=hmap.get(value);
				hmap.put(value, count+1);
			}
			else
			{
				hmap.put(value, 1);
			}
		}
		
		Set<Entry<Integer,Integer>> entryvalue=hmap.entrySet();
		
		for(Entry<Integer,Integer> integerentry:entryvalue)
		{
			System.out.println("The integer is:"+integerentry.getKey()+" duplicate count is:"+integerentry.getValue());
		}
	}
	
	

}
