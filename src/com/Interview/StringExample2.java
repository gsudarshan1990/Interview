package com.Interview;

import java.util.Arrays;

public class StringExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char data[]= {'R', 'i', 'n', 'g', 'o'};
		String drummer=new String(data);
		String drummer2= "Rin"+"go";
		if(drummer==drummer2)
		{
			System.out.println("Both are");
		}
		System.out.println(drummer+" vs "+drummer2);
		String drummer3=drummer.replace('R', 'B');
		System.out.println(drummer3);
		boolean result=drummer3.startsWith("Bing");
		System.out.println("check 3rd string starts with \"Bing\":"+result);
		String substring=drummer.substring(1);
		System.out.println(substring);
		String title="Strawberry Fields Forever";
		String[] split=title.split(" ");
		String[] reverse=new String[split.length];
		
		for(int i=0;i<split.length;i++)
		{
			reverse[i]=split[split.length-1-i];
		}
		String reversestring="";
		for(int i=0;i<reverse.length;i++)
		{
			reversestring+=reverse[i]+" ";
		}
		System.out.println(reversestring);
	}

}
