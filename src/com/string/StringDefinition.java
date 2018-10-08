package com.string;

public class StringDefinition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Welcome to Java";
		String s2=new String("Welcome to Java");
		
		String s3="1234";
		String s4=new String(s3);
		
		char[] letters= {'H','e','l','l','o',' ','N','Y','U'};
		String s5=new String(letters);
		
		System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5);
		
	}

}
