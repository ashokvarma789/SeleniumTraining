package com.test.bhavanisankar;

public class AtmProgram {

	public static void main(String[] args) {

		int pin = 6969;
		int availablebalance = 1000;
		int withdrawelamount = 1001;
		int totalbalance = availablebalance-withdrawelamount;
			if (pin==6969) {
			if (withdrawelamount<=availablebalance) {
				
				System.out.println("Transaction is Successful");
				System.out.print("Available Balance is..");
				System.out.print(availablebalance);
			}else{
				System.out.println("Transaction is Declined");
				System.out.println("You have Insufficient Balance in your Account");
				System.out.println("Thankyou...!");
				}
			}else {
				System.out.println("Entered Pin is Invalid");
			}
		}
}