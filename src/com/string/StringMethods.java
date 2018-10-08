package com.string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Welcome to UCSC!";
		int length=str1.length();
		System.out.println(length);
		
		char c=str1.charAt(3);
		System.out.println(c);
		System.out.println(str1.toLowerCase());
		System.out.println(str1.indexOf('c'));
		
		String str2=String.valueOf(4);
		System.out.println(str2);
		String str3=String.valueOf(5.67);
		System.out.println(str3);
		boolean flag=true;
		String str4=String.valueOf(true);
		System.out.println(str4);
		String str5=str1.substring(3);
		System.out.println(str5);
		String str6=str1.substring(2,8);
		System.out.println(str6);
		String str8=str1+str2;
		String str9=str1.concat(str2);
		
		System.out.println(str8);
		System.out.println(str9);
		
		String str10="Hello";
		str10+="World";
		String str11=str1+4.76;
		System.out.println(str10);
		System.out.println(str11);
	}

}
