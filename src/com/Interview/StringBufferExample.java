package com.Interview;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="sudarshan";
		String s2="Govindarajan";
		
		System.out.println("Immutable String");
		
		String r=s1.concat(s2);
		System.out.println(r);
		System.out.println("Identity hash code of s1:"+System.identityHashCode(s1));
		System.out.println("Identity hash code of r:"+System.identityHashCode(r));
		
		System.out.println("Mutable Strings");
		
		StringBuffer x1=new StringBuffer("sudarshan");
		StringBuffer x2=new StringBuffer("Govindarajan");
		
		StringBuffer r1=x1.append(x2);
		System.out.println(r1);
		System.out.println("Identity hash code of x1:"+System.identityHashCode(x1));
		System.out.println("Identity hash code of r1:"+System.identityHashCode(r1));
		
				
	}

}
