package com.Interview;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {29, 64, 73, 34, 20};
		int i,j,minvalue,minindex,temp=0;
		
		for(i=0;i<array.length;i++)
		{
			minvalue=array[i];
			minindex=i;
			for(j=i;j<array.length;j++)
			{
				if(array[j]<minvalue)
				{
					minvalue=array[j];
					minindex=j;
				}
			}
			
			if(minvalue<array[i])
			{
				temp=array[i];
				array[i]=array[minindex];
				array[minindex]=temp;
				
			}
		}
		
		for(i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
