package com.Interview;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ages=new int[5];
		int max_age=30;
		
		for(int i=0;i<ages.length;i++)
		{
			int random_age=((int)(Math.random()*100))%max_age;
			ages[i]=random_age;
		}
		
		String msg=String.format("All ages :%s", Arrays.toString(ages));
		System.out.println(msg);
	}

}
