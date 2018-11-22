package com.uclajava;

public class EncapsulationDemo {

	private int age;
	
	public int getAge()
	{
		return this.age;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulationDemo ed=new EncapsulationDemo();
		ed.setAge(32);
		System.out.println("Employee age is:"+ed.getAge());
	}

}
