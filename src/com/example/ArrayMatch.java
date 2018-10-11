package com.example;

public class ArrayMatch {

	public static boolean match(int[] array1,int[] array2)
	{
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i]!=array2[i])
			{
				return false;
			}	
		}
		return true;
	}
	
	public static void doSomeThing(int[] arg)
	{
		int[] next=new int[arg.length];
		
		for(int i=0;i<next.length;i++)
		{
			next[i]=arg[i]+5;
		}
		arg=next;
	}
	
	public static void printarray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] al= {2,4,6,1,15};
		int[] myA= {2,4,6,1,5};
		System.out.println("Matching of arrays");
		System.out.println(match(al,myA));
		doSomeThing(al);
		printarray(al);
		
	}

}
