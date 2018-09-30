package com.Interview;

public class SoundDistrance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double lightening_time=7.2, distance_in_feet=1100;
		double dist=lightening_time*distance_in_feet;
		System.out.println("The lightening is:"+dist+"feet");
		
		double echo=7.2;
		double dist_echo=(echo*distance_in_feet)/2.0;
		System.out.println("The echo distance:"+dist_echo+"feet");
	}

}
