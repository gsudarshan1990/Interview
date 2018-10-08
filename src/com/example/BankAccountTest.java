package com.example;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount first=new BankAccount(123456);
		BankAccount second=new BankAccount(234567);
		
		first.deposit(900);
		
		System.out.println(first.balance);
		System.out.println(second.balance);
		
		first.transfer(second, 100);
		System.out.println(first.balance);
		System.out.println(second.balance);
	}

}
