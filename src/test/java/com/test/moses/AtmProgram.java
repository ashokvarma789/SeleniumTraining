package com.test.moses;

import java.util.Scanner;

public class AtmProgram {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int pin,withdraw;
		int availablebalance = 10000;
		
		int x = 9087;
		System.out.println("Please Enter pin number");
		pin = Sc.nextInt();
		
		if(pin== x)
		{
			System.out.println("Welcome to bank of boroda");
			System.out.println("Please enter amount you want to withdraw:");
			withdraw = Sc.nextInt();
			if (availablebalance>=withdraw) {
				System.out.println("Withdraw amount is Sucessfull available balance is:" +(availablebalance-withdraw));
			}
			else {
				System.out.println("insufficient fund");
				
			}
	
			
		}else {
			System.out.println("Entered pin number is incorrect");
		}
		

	}

}
