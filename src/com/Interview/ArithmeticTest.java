package com.Interview;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

class Arthimetic
{
	public static int product(int a,int b)
	{
		return a*b;
	}
	
	public static int sum(int a, int b)
	{
		return a+b;
	}
}

public class ArithmeticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result result=JUnitCore.runClasses(ArithmeticTest.class);
		System.out.println(result.wasSuccessful());
		
		
	}

	@Test
	public void testproduct()
	{
		assertEquals(30,Arthimetic.product(5,6));
		assertEquals(-30,Arthimetic.product(5, -6));
		assertEquals(0,Arthimetic.product(0, 5));
	}
	
	@Test
	public void testsum()
	{
		assertEquals(11,Arthimetic.sum(5, 6));
		assertEquals(-1,Arthimetic.sum(5, -6));
		assertEquals(0,Arthimetic.sum(6, -6));
		assertEquals(-6,Arthimetic.sum(0, -6));
	}
}
