package com.Interview;

public class SampleClass {

	int numberOfApples;
	double applePortions;
	boolean finishedProcessing;
	
	double divideAppleAmongPeople(int numberOfApples,int numberOfPeople)
	{
		finishedProcessing=false;
		if(numberOfPeople<=0)
				return 0;
		applePortions=numberOfApples/numberOfPeople;
		finishedProcessing=true;
		
		return applePortions;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		SampleClass sampleclass;
		
		sampleclass=new SampleClass();
		double PortionsPerPerson;
		
		PortionsPerPerson=sampleclass.divideAppleAmongPeople(6, 2);
		
		if(sampleclass.finishedProcessing==false)
			return;
		System.out.println("Number of Portions per person:"+PortionsPerPerson);
	}

}
