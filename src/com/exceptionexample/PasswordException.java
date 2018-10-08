package com.exceptionexample;

public class PasswordException extends Throwable{
	
	PasswordException()
	{
		System.out.println("You actual password and confirm password is wrong");
	}

}
