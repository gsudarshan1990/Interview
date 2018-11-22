package com.Interview;

public class StaticExample {

	static int count;
	
	public StaticExample()
	{
		count++;
	}
	
	public int getCount()
	{
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticExample s1=new StaticExample();
		StaticExample t1=new StaticExample();
		
		System.out.println(s1.getCount());
		System.out.println(t1.getCount());
	}

}
