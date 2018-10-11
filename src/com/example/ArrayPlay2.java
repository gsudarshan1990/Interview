package com.example;

public class ArrayPlay2 {

	public static boolean greatherThanN(int[] theArray,int index,int num)
	{
		if(theArray[index]>num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] myA= {2,4,10,1};
		System.out.println("Running test:greaterthanN([2,4,10,1],6,2)");
		System.out.println(greatherThanN(myA,6,2));
	}

}
