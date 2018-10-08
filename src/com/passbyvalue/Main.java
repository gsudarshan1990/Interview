package com.passbyvalue;

class Apple
{
	public String color="red";
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apple apple=new Apple();
		System.out.println(apple.color);
		changecolor(apple);
		System.out.println(apple.color);
	}

	static void changecolor(Apple a)
	{
		a.color="green";
	}
}
