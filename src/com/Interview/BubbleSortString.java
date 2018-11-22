package com.Interview;

public class BubbleSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strs[] = { 
                "this", "is", "a", "test", 
                "of", "a", "string", "sort"  
               }; 
		
		String temp="";
		for(int i=0;i<strs.length;i++)
		{
			for(int j=i+1;j<strs.length;j++)
			{
				if(strs[j].compareTo(strs[i])<0)
				{
					temp=strs[j];
					strs[j]=strs[i];
					strs[i]=temp;
				}
			}
		}
		
		for(int i=0;i<strs.length;i++)
		{
			System.out.println(strs[i]);
		}
	}

}
