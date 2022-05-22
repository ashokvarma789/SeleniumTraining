package com.test.Prudhvi;

import java.util.Scanner;

public class AccountType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the code(10,11,20,21,22,30): ");
		short code = sc.nextShort();
		
		
		switch (code) {
		
		case 10 :
			System.out.println("Savings Acoount");
			break;
			
		case 11 :
			System.out.println("Remix Savings");
			break;
			
		case 20:
			System.out.println("Current Account");
			break;
			
		case 21:
			System.out.println("Multi Currency Account");
			break;
			
		case 22:
			System.out.println("Foriegn Currency Current Account");
			break;
			
		case 30:
			System.out.println("Fixed Deposit Account");
			break;
			
		default :
			System.out.println("Please provide the Valid input of the given above");
				
			
		} 

	}

}
