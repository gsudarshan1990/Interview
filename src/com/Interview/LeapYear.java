package com.Interview;

public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length<1)
		{
			System.err.println("Please enter the year in command line");
			System.out.println("Eg:2000");
		}
		
		else
		{
			for(int i=0;i<args.length;i++)
			{
				try
				{
					int year=Integer.parseInt(args[i]);
					
					checkLeapYear(year);
					
				}
				catch(NumberFormatException e)
				{
					
					System.out.printf("%s is not valid",args[i]);
					System.out.println();
					System.err.println("Enter the number");
				}
			}
		}
		
		
	}

	
	public static void checkLeapYear(int year)
	{
		if(isLeapYear(year))
		{
			System.out.printf("%d is a leap year", year);
		}
		else
		{
			System.out.printf("%d is not a leap year",year);
		}
	}
	
	public static boolean isLeapYear(int year)
	{
	
		if((year%4==0) && (year%100!=0))
		{
			return true;
		}
		else
			if(year%400==0)
			{
				return true;
			}
			else
			{
				return false;
			}
	}
}
