package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePlay {

	public static int readInt(String fileName) throws FileNotFoundException
	{
		File sourceFile=new File(fileName);
		Scanner sc=new Scanner(sourceFile);
		int allInt=0;
		while(sc.hasNextInt())
		{
			int number=sc.nextInt();
			allInt+=number;
		}
		
		System.out.println(allInt);
		return allInt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			readInt("E:\\sts examples\\InterviewJavaProjects\\Ints.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
