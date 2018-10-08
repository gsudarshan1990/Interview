package com.Interview;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		boolean flag=true;
		
		for(i=0;i<10;i++)
		{
			if(i%5==0)	
			{
				continue;
			}
			System.out.println(i);
			if(i==10)
			{
				break;
			
			}
		}
	}

}
