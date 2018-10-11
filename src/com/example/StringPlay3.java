package com.example;

public class StringPlay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="String are immutable";
		String s2=s1.concat("Really it's true");
		s1=s2.concat("But sometimes they change");
		System.out.println(s1);
	}

}
