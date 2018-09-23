package com.Interview;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hello Welcome to Java class";
		String[] x=s1.split(" ");
		System.out.println(s1.length());
		System.out.println(x.length);
		String[] x1=s1.split("o");
		System.out.println(s1.length());
		System.out.println(x1.length);
	}

}
