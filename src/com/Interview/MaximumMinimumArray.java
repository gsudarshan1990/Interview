package com.Interview;

//Program to find the maximum and minimum in array

public class MaximumMinimumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums=new int[10];
		nums[0] = 99; 
	    nums[1] = -10; 
	    nums[2] = 100123; 
	    nums[3] = 18; 
	    nums[4] = -978; 
	    nums[5] = 5623; 
	    nums[6] = 463; 
	    nums[7] = -9; 
	    nums[8] = 287; 
	    nums[9] = 49; 
	    
	    int max=nums[0],min=nums[0];
	    
	    for(int i=1;i<nums.length;i++)
	    {
	    	if(max<nums[i])
	    	{
	    		max=nums[i];
	    	}
	    	if(min>nums[i])
	    	{
	    		min=nums[i];
	    	}
	    }
	    System.out.println("Maxium:"+max);
	    System.out.println("Minium:"+min);
	}

}
