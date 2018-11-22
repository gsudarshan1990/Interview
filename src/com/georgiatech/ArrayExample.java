package com.georgiatech;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] scores=new double[5];
		System.out.println("After double[] scores=new double[5]");
		for(int i=0;i<5;++i)
		{
			System.out.printf("scores[%d]=%.2f%n",i,scores[i]);
		}
		
		scores[0]=89;
		scores[1]=100;
		scores[2]=95.6;
		scores[3]=84.5;
		scores[4]=91;
		scores[scores.length-1]=99.2;
		
		System.out.println("After element -element initializtion");
		for(int i=0;i<scores.length;++i)
		{
			System.out.printf("scores[%d]=%.2f%n",i,scores[i]);
		}
				
		for(int i=0;i<scores.length;i++)
		{
			scores[i]-=10;
		}
				
		System.out.println("Each element decreased by 10");
		
		for(int i=0;i<scores.length;i++)
		{
			System.out.printf("scores[%d]=%.2f%n", i,scores[i]);
		}
		
		for(double score:scores)
		{
			score-=10;
			System.out.println(score);
		}
		
		for(int i=0;i<scores.length;i++)
		{
			System.out.printf("scores[%d]=%.2f%n",i,scores[i]);
		}
	}
	

}
