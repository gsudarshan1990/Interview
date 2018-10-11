package com.example;

public class TestGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score=85;
		char grade;
		
		if(score>90)
			grade='A';
		if(score>80)
			grade='B';
		if(score>70)
			grade='C';
		if(score>60)
			grade='D';
		else
			grade='F';
		
		System.out.println("Your test score is:"+score+"\n your grade is:"+grade);
	}

}
