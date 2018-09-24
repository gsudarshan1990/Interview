package com.Interview;

public class StringLiteralExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="sudarshan";
		String s2="sudarshan";
		
		System.out.println("Identity has code of s1:"+System.identityHashCode(s1));
		System.out.println("Identity has code of s2:"+System.identityHashCode(s2));
		
		String s3=new String("sudarshan");
		String s4=new String("sudarshan");
		
		System.out.println("Identity hashcode of s3:"+System.identityHashCode(s3));
		System.out.println("Identity hashcode of s4:"+System.identityHashCode(s4));
	}

}
