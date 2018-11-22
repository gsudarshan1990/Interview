package com.ucsdjava;

public class RobotTom {
	
	private int my_age=25;
	private String my_name="Tom";
	
	public RobotTom(String name,int age)
	{
		my_age=age;
		my_name=name;
	}
	
	public void printMyData()
	{
		System.out.println("Hello "+my_name+" my age is: "+my_age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RobotTom tom=new RobotTom("Tom",10);
		tom.printMyData();
		System.out.println("Goodbye!");
		
	}

}
