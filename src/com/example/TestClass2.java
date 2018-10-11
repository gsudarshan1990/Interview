package com.example;

public class TestClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s=new Student1();
		Person1 p=new Person1();
		Person1 q=new Person1();
		Faculty1 f=new Faculty1();
		Object o=new Faculty1();
		
		Person1[] P=new Person1[3];
		P[0]=new Person1();
		P[1]=new Student1();
		P[2]=new Faculty1();
	
		for(int i=0;i<P.length;i++)
		{
			System.out.println(P[i]);
		}
	}

}
