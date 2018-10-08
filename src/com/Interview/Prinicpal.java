package com.Interview;

public class Prinicpal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double principal;
		double rate;
		double interest;
		
		principal=17000;
		rate=0.7;
		interest=principal*rate;
		principal=principal+interest;
		System.out.println("The interested earned is $");
		System.out.println(interest);
		System.out.println("The value of principal after one year");
		System.out.println(principal);
	}

}
