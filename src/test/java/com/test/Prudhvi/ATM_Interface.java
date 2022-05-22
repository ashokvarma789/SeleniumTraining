package com.test.Prudhvi;

import java.util.Scanner;

public class ATM_Interface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin,Withdraw_Amount;
		int Available_Balance = 100000;
		int x = 9343;
		
		System.out.println("Please enter your Pin:");
		pin = sc.nextInt();
		
		if (pin == x) {
			System.out.println("Welcome");
			System.out.println("Please enter the amount to withdraw");
			Withdraw_Amount = sc.nextInt();
			if (Available_Balance > Withdraw_Amount ) {
				System.out.println("Transaction Successful ! Please collect your amount" + "Remaining Balance :" +(Available_Balance - Withdraw_Amount)+"/- rupees only");
			}
			else {
				System.out.println("Insufficient balance!!! please check your balance and try again");
			}	
		}
		else {
			System.out.println("Invalid PIN !!! please enter try again and enter the valid pin ");
		}

}
}
