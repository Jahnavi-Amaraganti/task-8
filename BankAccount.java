package com.elc;

public class BankAccount {
	private String accountHolder;
	private int accountNumber;
	private double balance;
	public void setAccountDetails(String holder , int accNum , double bal) {
		accountHolder=holder;
		accountNumber=accNum;
		balance=bal;
	}
	public String getAccountDetails()
	{
		return "Account holder:"+accountHolder +"\n AccountNumber:" +accountNumber +"\n Balance:"+balance;
	}
	}


