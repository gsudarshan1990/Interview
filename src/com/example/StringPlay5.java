package com.example;

public class StringPlay5 {

	public String changeIfEqual(String a,String b,String c)
	{
		if(a.equals(b))
		{
			return c;
		}
		return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPlay5 s=new StringPlay5();
		String a=new String("Bob");
		String b=new String("Bob");
		String c=new String("Robert");
		b =s.changeIfEqual(a, b, c);
		System.out.println("a="+a+" b="+b+" c="+c);
		
	}

}
