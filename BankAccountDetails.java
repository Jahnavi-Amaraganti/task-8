package com.elc;

public class BankAccountDetails {
	public static void main (String[] args) {
	BankAccount bank=new BankAccount();
	bank.setAccountDetails("Rahul", 123456,5000.0);
	String res=bank.getAccountDetails();
	System.out.println(res);
	}

}
