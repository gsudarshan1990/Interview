package com.example;

import java.util.Scanner;

public class CalcArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radiu");
		double radius=sc.nextDouble();
		double area=3.459*radius*radius;
		System.out.println("Area:"+area);
	}

}
