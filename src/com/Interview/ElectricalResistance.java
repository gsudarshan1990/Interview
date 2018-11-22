package com.Interview;

import java.util.Scanner;

/*
 * Three coated copper wires.
The electricalv resistance R of a cylindrical wire with length l (in meter) and diameter d (in meter) can be computed from the area A of its diameter (m2) and the und the resistivity Ρ of the material (rho, meter times Ohm). The formula:

R = Ρ( l / A )
Compute the electrical resistance of a wire with length 1m and a diameter of 1mm for copper (Ρ = 1,78*10-8) and for silicon (Ρ = 2300)

Ohm's law states the current (I) is proportional to the potential difference (U). As a formula: U = R * I.

What is the resistance of the wire if 25 Ampere current pass through it?
 * 
 * 
 * 
 */

public class ElectricalResistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length=1000;
		int amperecurrent=25;
		System.out.println("Area of the Cylindrical wire");
		double area=2*Math.PI*0.5*1000+2*Math.PI*Math.pow(0.5,2);
		System.out.println(area);
		
		System.out.println("Enter the option to calculate resistance 1.copper 2.silicon");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		switch(number)
		{
		case 1: copper(area,length,amperecurrent);
				break;
		case 2:silicon(area,length,amperecurrent);
				break;
		default: System.out.println("you have selected wrong option");
		}
	}

	public static void  copper(double area,int length,int amperecurrent)
	{
		final double P_COPPER=1.78*Math.pow(10, -8);
		double resistance=P_COPPER*(length/area);
		double totalresistance=resistance*amperecurrent;
		System.out.println("TotalResistance:"+totalresistance);
	}
	public static void  silicon(double area,int length,int amperecurrent)
	{
		final double P_COPPER=2300;
		double resistance=P_COPPER*(length/area);
		double totalresistance=resistance*amperecurrent;
		System.out.println("TotalResistance:"+totalresistance);
	}
}
