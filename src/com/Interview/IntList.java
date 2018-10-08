package com.Interview;

public class IntList {

	public int head;
	public IntList tail;
	
	public IntList(int h,IntList t)
	{
		head=h;
		tail=t;
	}
	
	public int size()
	{
		if(tail==null)
			return 1;
		else
			return 1+tail.size();
	}
	
	public int get(int i)
	{
		if(i==0)
		{	
			return head;
		}
		return tail.get(i-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
