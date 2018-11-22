package com.georgiatech;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] actualarray= {1,2,3,4,5,6,7,8,9,10};
		int[] subarray1=ArrayUtils.take(5, actualarray);
		int[] subarray2=ArrayUtils.drop(5, actualarray);
		int[] subarray3= {1,2,3,4,5};
		for(int i=0;i<subarray1.length;i++)
		{
			System.out.print(subarray1[i]+",");
		}
		System.out.println();
		for(int i=0;i<subarray2.length;i++)
		{
			System.out.print(subarray2[i]+",");
		}
		System.out.println();
		System.out.println(ArrayUtils.equals(subarray1,subarray3));
		System.out.println(ArrayUtils.equals(subarray2, subarray1));
		int[] subarray4=ArrayUtils.concat(subarray1,subarray2);
		
		for(int i=0;i<subarray4.length;i++)
		{
			System.out.println(subarray4[i]);
		}
		
		System.out.println("Array to String");
		String arraytoString=ArrayUtils.toString(actualarray);
		System.out.println(arraytoString);
	}

}
