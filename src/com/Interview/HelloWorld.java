package com.Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name="Instructor";
		System.out.println("Given name is:"+name);
		System.out.println("Enter your name");
		
		try {
			 name=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Hello  "+name+"!");
	}

}
