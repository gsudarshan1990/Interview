package com.example;

public class BankAccount {

	public long accountNumber;
	public int balance;
	
	public BankAccount(long accountNumber)
	{
		this.accountNumber=accountNumber;
		this.balance=0;
	}
	
	public void deposit(int amount)
	{
		this.balance+=amount;
	}
	
	public boolean withdraw(int amount)
	{
		if(balance>=amount)
		{
			balance-=amount;
			return true;
		}
		else
		{
			System.out.println("Transaction is not feasible");
			return false;
		}
	}
	
	public void transfer(BankAccount transferaccount,int amount)
	{
		if(this.withdraw(amount))
		{
			transferaccount.deposit(amount);
		}
		else
		{
			System.out.println("This transaction is not feasible");
		}
	}
}
