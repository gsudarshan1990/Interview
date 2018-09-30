package com.Interview;

public class StudentGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=5;
		String letter="";
		int grade=0;
		while(count>0)
		{
				 grade=(int)(Math.random()*50)+50;
				
				if(grade>90)
				{
					letter="A";
				}
				
				else
					if(grade>80 && grade<90)
					{
						letter="B";
					}
				
				else
					if(grade>70 && grade<80)
					{
						letter="C";
					}
					else
						
						if(grade>60 && grade < 70)
						{
							letter="D";
						}
						else
						{
							letter="E";
						}
				
				System.out.println("Student Marks:"+grade+"grade:"+letter);
				count--;
		}
		
		
		
	}

}
