package com.Interview;

public class TimeComputationOfProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long starttime;
		long endtime;
		double time;
		
		starttime=System.currentTimeMillis();
		
		double width,height,hypotenuse;
		width=42.0;
		height=17.0;
		hypotenuse=Math.sqrt(width*width+height*height);
		System.out.println(hypotenuse);
		
		System.out.println("sin(x)*sin(x)+cos(x)*cos(x)-1 is 0 lets check");
		
		System.out.println(Math.sin(1)*Math.sin(1)+Math.cos(1)*Math.cos(1)-1);
		
		System.out.println("Here is the random number");
		System.out.println(Math.random());
		endtime=System.currentTimeMillis();
		time=(endtime=starttime)/1000.0;
		System.out.println("The time taken is"+time+"in seconds");
	}

}
