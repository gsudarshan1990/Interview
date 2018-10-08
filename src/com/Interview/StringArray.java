package com.Interview;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] wordarray=new String[4];
		wordarray[0]="java";
		for(int i=0;i<wordarray.length;i++)
			System.out.println(wordarray[i]);
		
		
		int[] numberarray=new int[10];
		
		for(int i=1;i<=10;i++)
		{
			int arrayindex=i-1;
			int arrayvalue=i;
			numberarray[arrayindex]=arrayvalue;
		}
		
		for(int i=0;i<numberarray.length;i++)
		{
			int number=numberarray[i];
			String value="The number at "+i+" index "+number;
			System.out.println(value);
			
			if(number%2==0)
			{
				System.out.println("The number is even");
			}
			else
			{
				System.out.println("The number is odd");
			}
			
			int wordindex=number%2;
			
			System.out.println(wordarray[wordindex]);
		}
	}

}
