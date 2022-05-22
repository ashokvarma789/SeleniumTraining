package com.test.ashok;

public class Assignment4 {
	
public static void main(String[] args) {
		
		int pin = 789;
		int availableBalance = 20000;
		int withDrawAmount =2500;
		
		if (pin == 789) {
			
			if(availableBalance < withDrawAmount)
			{
				System.out.println("Insufficient Funds Available Balance is " +availableBalance );
			}
			
			if(availableBalance > withDrawAmount)
			{
				System.out.println("Transaction Sucessfull Available Balance is " + (availableBalance - withDrawAmount));
			}
			
		} else {
			
			System.out.println("Entered Invalid Pin");
		}

	}

}



