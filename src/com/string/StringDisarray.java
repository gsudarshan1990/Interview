package com.string;

public class StringDisarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sample="This is java program hello word";
		//output is This program java world hello;
		
		String[] split=sample.split(" ");
		String temp;
		for(int i=0;i<split.length;i=i+2)
		{
			
			temp=split[i];
			split[i]=split[i+1];
			split[i+1]=temp;
		}
		
		String afterchange="";
		for(int i=0;i<split.length;i++)
		{
			afterchange+=split[i]+" ";
		}
		System.out.println(afterchange);
	}

}
