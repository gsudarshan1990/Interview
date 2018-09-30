package com.Interview;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

class SameNumber
{
	public static boolean isSameNumber(int a,int b)
	{
		return a==b;
	}
}

public class SameNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result result=JUnitCore.runClasses(SameNumberTest.class);
	}

	@Test
	public void checksamenumbers()
	{
		assertTrue(SameNumber.isSameNumber(5, 5));
		assertTrue(SameNumber.isSameNumber(5,45));
	}
}
