package com.nwarkexamples;

/*
(Conversion from kilograms to pounds and pounds to kilograms) Write a program
that displays the following two tables side by side:
Kilograms Pounds    |    Pounds Kilograms
1            2.2    |    20          9.09
3            6.6    |    25         11.36
...          
197        433.4    |    510       231.82
199        437.8    |    515       234.09
*/

public class PoundsToKilogramViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double POUND_PER_KG=2.2;
		
		char c='|';
		System.out.print("Kilogram       Pounds       |        Pounds     kilograms\n");
	
		for(int i=1,j=20;i<200 &&  j<=515  ;i++,j=j+5)
		{
			System.out.printf("%-16d%5.1f%8c%13d%11.2f\n",i,i*POUND_PER_KG,c,j,j/POUND_PER_KG);
		}
	}

}
