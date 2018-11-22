package com.csueastbay;

public class Stack {

	int top;
	int size=100;
	int empty=0;
	Person[] personarray=new Person[size];
	
	boolean isEmpty()
	{
		if(top == empty)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	boolean isFull()
	{
		if(top == size)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	void push(Person P)
	{
		if(!this.isFull())
		{
			personarray[++this.top]=P;
		}
	}
	
	Person pop()
	{
		if(this.isEmpty())
		{
			return null;
		}
		else
		{
			return personarray[this.top--];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1=new Person("Name 1",10);
		Person p2=new Person("Name 2",20);
		Person p3=new Person("Name 3",30);
		
		Stack s=new Stack();
		s.push(p1);
		s.push(p2);
		s.push(p3);
		
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
	}

}
