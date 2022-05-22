package com.test.vamsi;

public class Excersice4Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin = 898;
		int availableBalance = 1000;
		int withDrawAmount =1500;

		if (pin == 898) {

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
