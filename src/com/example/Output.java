package com.example;

import java.text.DecimalFormat;

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double value=2.0/3.0;
		System.out.println("value:"+value);
		DecimalFormat twodigits=new DecimalFormat("0.00");
		System.out.println("value:"+twodigits.format(value));
		String formattedvalue=twodigits.format(value);
		System.out.println("value:"+formattedvalue);
	}

}
