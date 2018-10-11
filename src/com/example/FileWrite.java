package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file=new File("E:\\sts examples\\InterviewJavaProjects\\output.txt");
		FileWriter writer=null;
		try {
			writer=new FileWriter(file);
			writer.write("This is file \n");
			writer.write("\n If you could see this line once you open output file it means that this data is written through the java program");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
	}

}
