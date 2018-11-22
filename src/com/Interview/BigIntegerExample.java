package com.Interview;

import java.math.BigInteger;

public class BigIntegerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value=Integer.MAX_VALUE;
		System.out.println(value);
		BigInteger biginteger=BigInteger.valueOf(2000000000);
		System.out.println(biginteger.multiply(BigInteger.valueOf(2)));
		BigInteger value1=new BigInteger("987654321987654321000000000");
		BigInteger value2=new BigInteger("987654321987654321000000000");
		System.out.println(value1.multiply(value2));
		
	}

}
