package com.example;

public class StringPlay {

	public static boolean hasLetter(String word,char letter)
	{
		
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==letter)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(StringPlay.hasLetter("Sleep", 'e'));
				
		String encoded=new String("abc");
		String another=new String("abc");
		System.out.println(encoded==another);
		String third=another;
		another+="d";
		System.out.println(another);
		StringBuilder encoded1=new StringBuilder("abc");
		StringBuilder exteded=encoded1.append("d");
		System.out.println(exteded);
	}

}
