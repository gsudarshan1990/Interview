package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringPlay2 {

	public static String readIt(String filename) throws FileNotFoundException
	{
		File sourcefile=new File(filename);
		Scanner input=new Scanner(sourcefile);
		String allText="";
		while(input.hasNextLine())
		{
			String s1=input.nextLine();
			allText=allText.concat(s1);
		}
		input.close();
		System.out.println(allText);
		return allText;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringPlay2 s=new StringPlay2();

		try {
			readIt("E:\\sts examples\\InterviewJavaProjects\\haiku.txt.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
