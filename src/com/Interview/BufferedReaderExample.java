package com.Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader keyboard;
		
		keyboard=new BufferedReader(new  InputStreamReader(System.in));
		
		System.out.println("Please enter the name of a company");
		System.out.flush();
		String inputline=keyboard.readLine();
		System.out.println(inputline);
		
		if(inputline.length()<2)
		{
			System.err.println("Error");
		}
		else
		{
			inputline=inputline.substring(0,1)+inputline.substring(2);
			System.out.println(inputline);
		}
		
		StringBuilder out=new StringBuilder(inputline);
		out.delete(1, 3);
		System.out.println(out.toString());
		
		
		
	}

}
