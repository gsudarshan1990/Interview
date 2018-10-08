package com.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw=new FileWriter("text.txt");
		fw.write("Test 1\n");
		fw.write("Test 2\n");
		fw.write("Test 3\n");
		fw.close();
		
		FileReader fr=new FileReader("E:\\sts examples\\InterviewJavaProjects\\text.txt");
		int c;
		while((c=fr.read())!=-1)
		{	
			
			System.out.println((char)c);
		}
		fr.close();
	}

}
