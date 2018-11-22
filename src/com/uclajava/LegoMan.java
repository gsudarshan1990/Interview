package com.uclajava;

public class LegoMan {
	private String shirtColor="blue";
	private String armColor="white";
	private String pantColor="white";
	
	
	public LegoMan(String shirtColor, String armColor, String pantColor  )
	{
		this.shirtColor=shirtColor;
		this.armColor=armColor;
		this.pantColor=pantColor;
	}
	
	public LegoMan() {
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		return "shirtcolor:"+this.shirtColor+" armcolor:"+this.armColor+" pantcolor:"+this.pantColor;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LegoMan lm1=new LegoMan();
		LegoMan lm=new LegoMan("red","blue","red");
		
		System.out.println(lm1);
		System.out.println(lm);
	}

}
