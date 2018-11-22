package com.Interview;

class Student
{
	String name;
	int rollno;
	int marks;
	
	public Student(String name,int rollno,int marks)
	{
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	
	public String toString()
	{
		return String.format("Name:%s,rollno:%d,marks:%d",name,rollno,marks);
	}
}



public class ToStringExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student("sudarshan",25,540);
		Student s2=new Student("Shashank",26,543);
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
