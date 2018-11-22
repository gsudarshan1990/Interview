package com.ucsdjava;

public class MaximumOfArray {

	public static int max(int[] number)
	{
		int temp;
		for(int i=0;i<number.length;i++)
		{
			for(int j=1;j<number.length;j++)
			{
				if(number[i]<number[j])
				{
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}
		return number[0];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers=new int[] {9,2,15,2,22,10,6};
		System.out.println(max(numbers));
	}

}
