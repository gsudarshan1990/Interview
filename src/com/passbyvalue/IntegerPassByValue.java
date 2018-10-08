package com.passbyvalue;

public class IntegerPassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer obj1=new Integer(1);
		Integer obj2=new Integer(2);
		
		System.out.println("Values of obj1 is:"+obj1.intValue()+" and value of obj2: is"+obj2.intValue());
		modifywithnew(obj1,obj2);
		System.out.println("After the modify with new keyword");
		//x=1,y=2
		System.out.println("Values of obj1 is:"+obj1.intValue()+" and value of obj2: is"+obj2.intValue());
		
	}

	static void modifywithnew(Integer x,Integer y)
	{
		x=new Integer(10);
		y=new Integer(20);
	}
	
	
}
