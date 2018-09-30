package com.Interview;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String oneString="To rule them all";
		String twoString=new String("To rule them all");
		
		String threeString="";
		String fourString=new String();
		
		String fiveString=oneString+twoString;
		System.out.println(fiveString+"\n");
		
		char newchar=oneString.charAt(3);
		System.out.println("Newchar:"+newchar+"\n");
		
		
		boolean areequal=oneString.equals(twoString);
		System.out.println("Are equal:"+areequal+"\n");
		
		System.out.println(oneString.length());
	}

}
