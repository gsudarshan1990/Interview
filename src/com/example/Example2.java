package com.example;

import java.util.Random;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Random generator=new Random();
		int value1=generator.nextInt();
		int value2=generator.nextInt(10);
		double value3=generator.nextDouble();
		double value4=generator.nextDouble()*360.0;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
*/	

		/*Random generator=new Random();
		for(int i=0;i<10;i++)
		{
			int value=generator.nextInt(50);
			System.out.println(value);
		}*/
		
		double sum=0.0;
		
		Random generator=new Random();
		for(int i=0;i<10;i++)
		{
			double value=generator.nextDouble();
			sum+=value;
		}
		double average=sum/10.0;
		System.out.println(average);
	}

}
