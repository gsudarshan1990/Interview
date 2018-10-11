package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file=new File("E:\\sts examples\\InterviewJavaProjects\\sourcefile.txt");
		Scanner sc=null;
		try {
			 sc=new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			System.out.println(line);
		}
		
		sc.close();
	}

}
