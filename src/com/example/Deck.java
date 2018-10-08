package com.example;

public class Deck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] rank= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		String[] suit= {"Clubs","Diamonds","Hearts","Spades"};
		
		int p=(int)(Math.random()*13);//0 and 13
		int q=(int)(Math.random()*4);//0 and 4;
		
		System.out.println(rank[p]+" of "+suit[q]);
		
		String[] deck=new String[52];
		for(int i=0;i<13;i++)
		{
			for(int j=0;j<4;j++)
			{
				
				deck[4*i+j]=rank[i]+" of "+suit[j];
			}
		}
		
		for(int i=0;i<52;i++)
		{
			System.out.println(i+"  "+deck[i]);
			
		}
		
		System.out.println();
		String[][] deck_2=new String[4][13];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<13;j++)
			{
				deck_2[i][j]=rank[j]+" of "+suit[i];
			}
		}
	
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<13;j++)
			{
				System.out.println(deck_2[i][j]);
			}
		}
	}

}
