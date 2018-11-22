package com.Interview;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ages[] = { 20, 22, 23, 28, 32};
		
		for(int i=0;i<ages.length;i++)
		{
			String msg=String.format("Person #%d age is %d",i,ages[i]);
			System.out.println(msg);
		}
	}

}
