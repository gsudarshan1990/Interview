package com.Interview;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] mylist= {1.9, 2.9, 3.4, 3.5};
		
		for(double number:mylist)
		{
			System.out.println(number);
		}
		
		double max=mylist[0];
		for(int i=1;i<mylist.length;i++)
		{
			if(mylist[i]>max)
			{
				max=mylist[i];
			}
		}
		System.out.println(max);
		
		double[] reverse=new double[mylist.length];
		for(int i=0,j=reverse.length-1;i<mylist.length;i++,j--)
		{
			reverse[j]=mylist[i];
		}
		
		for(double numberreverse:reverse)
		{
			System.out.println(numberreverse);
			
		}
	}

}
