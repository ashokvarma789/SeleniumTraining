package com.test.sivamohand;

public class AtmTransaction {

	public static void main(String[] args) {
		int pin=5253;
		int AvailableBalance=20000;
		int WithdrawlAmount=18000;
		
		if (WithdrawlAmount<=AvailableBalance)
		{
		System.out.println("Your transaction is Successful");
		System.out.println("Balance in your account is " + (AvailableBalance-WithdrawlAmount));
		}
		else if (WithdrawlAmount>AvailableBalance)
		{
			System.out.println("Transaction Declined");
			System.out.println("Insufficient Funds in your account");
			}
		else
		{
			System.out.println("Pin is Invalid");
		}
		}
	}		
	

