package com.sirexercise;

public class TrianglePatterNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*54321
		 *4321 
		 *321
		 *21 
		 *1 
		 */
		int i,j;
		for(i=5;i>=0;i--)
		{
			for(j=i;j>0;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
