package com.test.sivamohand;

public class AccountType {

	public static void main(String[] args) {
        int i = 30;
		

		switch (i) {

		case 10 :
			System.out.println("Savings Account");
			break;

		case 11 :
			System.out.println("Remix Savings");
			break;

		case 20 :
			System.out.println("Current Account");
			break;

		case 21:
			System.out.println("Multi Currency Account");
			break;
			
		case 22:
			System.out.println("Foreign Currency Account");
			break;
			
		case 30:
			System.out.println("Fixed Deposit Account");
			break;

		default :
			System.out.println("Invalid input");
         }

	}

}
