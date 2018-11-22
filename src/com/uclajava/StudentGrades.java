package com.uclajava;

import java.util.Random;

/**
 * Write a java program with the class name "StudentGrade" that generates a 
 * random number between 50 and 100 for a student grade and determines the 
 * letter grade of the student.
 * 
 * The student grade is determined based on the following criteria:
 * 90-100 = A
 * 80-89 = B
 * 70-79 = C
 * 60-69 = D
 * Less than 60 = F
 * 
 */


public class StudentGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min=50,max=100;
		Random rand=new Random();
		int stduentscore=rand.nextInt((max - min) + 1) + min;
		
		if(stduentscore>=90 && stduentscore<=100)
		{
			System.out.println("Grade:A");
		}
		else
			if(stduentscore>=80 && stduentscore<=89)
			{
				System.out.println("Grade:B");
			}
		else
			if(stduentscore>=70 && stduentscore<=79)
			{
				System.out.println("Grade:C");
			}
			else
				if(stduentscore>=60 && stduentscore<=69)
				{
					System.out.println("Grade:D");
				}
				else
					if(  stduentscore<60)
					{
						System.out.println("Grade:F");
					}
	}

}
