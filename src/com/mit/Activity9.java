package com.mit;

import java.util.Random;

/* Challenge Activity 2 - Roll the dice!
 * 
 * In this acticity, you will simulate the roll of 2 six-sided dice.
 * 
 * Complete the functions given to solve the problem of rolling 1 six-sided die, 
 * generating a random number between 1 and 6. 
 * Then call the function twice to roll the dice!
 * 
 * In addition, you should check for and detect "doubles" 
 * (when the same number comes up on each die)
 * 
 * SAMPLE RUNS(3 executions)
 *
 *  Dice Roll : 2,6; total==8 
 *  Dice Roll : 1,1; doubles total==2
 *  Dice Roll : 5,2; total==7
 */

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator1=new Random();
		Random generator2=new Random();
		int value1=generator1.nextInt(6);
		int value2=generator2.nextInt(6);
		
		if(value1==value2)
		{
			System.out.println(" Dice Roll : "+value1+","+value2+"; doubles total=="+(value1+value2)); 
		}
		else
		{
			System.out.println(" Dice Roll : "+value1+","+value2+"; total=="+(value1+value2)); 
		}
	}

}
