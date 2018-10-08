package com.Interview;

public class CommandLineArgumentsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		int index=0;
		while(index<args.length)
		{
			sum=sum+Integer.parseInt(args[index]);
			index++;
		}
		
		System.out.println(sum);
	}

}
