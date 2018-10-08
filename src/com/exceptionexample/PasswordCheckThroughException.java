package com.exceptionexample;

import java.util.Scanner;

public class PasswordCheckThroughException {

	public boolean passcheck()
	{
		System.out.println("Enter the password");
		Scanner sc=new Scanner(System.in);
		String pass1=sc.next();
		System.out.println("Enter the confirm password");
		String pass2=sc.next();
		
		try
		{
			if(pass1.equals(pass2))
			{
				System.out.println("You have logged into the system");
				return true;
			}
			else
			{
				throw new PasswordException();
			}
		}
		catch(PasswordException e)
		{
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PasswordCheckThroughException pwdcheck=new PasswordCheckThroughException();
		boolean accessGranted=false;
		
		for(int i=0;i<=3;i++)
		{
			if(pwdcheck.passcheck())
			{
				System.out.println("you have entered into the system");
				accessGranted=true;
				break;
			}
		}
		
		if(!accessGranted)
		{
			System.out.println("Security Warning");
		}
	}

}
