package com.csueastbay;

public class Person {

	private String name;
	private int age;
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String toString()
	{
		return getName()+" "+getAge();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p=new Person(args[0],Integer.parseInt(args[1]));
		
		System.out.println(p);
	}

}
