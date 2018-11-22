package com.Interview;

/*
 * 
 * Logical Operator Example
 */

public class Product {

	double price;
	int quantity;
	
	public boolean inStock()
	{
		if(quantity>0)
		{
			return true;
		}
		return false;
	}
	
	public boolean isCheap()
	{
		if(price<=100)
		{
			return true;
		}
		return false;
	}
	
	
	public String toString()
	{
		return "Price: "+price+" Quantity: "+quantity;
	}
	
	public boolean compare(Product other)
	{
		if(this.price==other.price)
		{
			if(this.quantity==other.quantity)
			{
				return true;
			}
		}
		else
		{
			return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product laptop_A=new Product();
		laptop_A.price=1000.0;
		laptop_A.quantity=10;
		
		Product laptop_B=new Product();
		laptop_B.price=1000.0;
		laptop_B.quantity=10;
		
		if(laptop_A.inStock()) 
		{
			System.out.println("It's in Stock");
		}
		
		if(laptop_A.isCheap())
		{
			System.out.println("Buy it now");
		}
		System.out.println(laptop_A);
		
		if(laptop_A==laptop_B)
		{
			System.out.println("Both laptops are same");
		}
		
		if(laptop_A.compare(laptop_B))
		{
			System.out.println("Both laptops are same");
		}
		else
		{
			System.out.println("Both laptops are not same");
		}
			
	}

}
