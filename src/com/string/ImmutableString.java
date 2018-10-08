package com.string;

public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="I like c++";
		String s2=s1;
		System.out.println(s1.hashCode());
		System.out.println(s1+"\n"+s2);
		s1="I like Java";
		System.out.println(s1.hashCode());
		System.out.println(s1+"\n"+s2);
		
	}

}
