package com.georgiatech;

public class ArrayUtils {

	public static int[] take(int n, int[] xs)
	{
		int[] newArray=new int[n];
		for(int i=0;i<n;i++)
		{
			newArray[i]=xs[i];
		}
		return newArray;
	}
	
	public static int[] drop(int n,int[] xs)
	{
		int[] newArray=new int[n];
		for(int i=0;i<n;i++)
		{
			newArray[i]=xs[xs.length-i-1];
		}
		return newArray;
	}
	
	public static boolean equals(int[] xs,int[] ys)
	{
		boolean valueresult=false,lengthresult=false,result=false;
		if(xs.length==ys.length)
		{
			lengthresult=true;
		}
		if(lengthresult)
		{
		for(int i=0;i<xs.length;i++)
		{
			if(xs[i]==ys[i])
			{
				valueresult=true;
				continue;
			}
			valueresult=false;
		}
			
		}
		if(lengthresult==true && valueresult==true)
			result=true;
		return result;
	}
	
	public static int[] concat(int[] xs,int[] ys)
	{
		int[] valueArray=new int[xs.length];
		String[] StringArray=new String[xs.length];
		for(int i=0;i<xs.length;i++)
		{
			StringArray[i]=String.valueOf(ys[i])+String.valueOf(xs[i]);
		}
		for(int i=0;i<StringArray.length;i++)
		{
			valueArray[i]=Integer.parseInt(StringArray[i]);
		}
		return valueArray;
	}
	
	public static String toString(int[] xs)
	{
		String result="";
		for(int i=0;i<xs.length;i++)
			result=result+String.format("xs[%d]=%d%n",i,xs[i]);
		
		return result;
	}
}
