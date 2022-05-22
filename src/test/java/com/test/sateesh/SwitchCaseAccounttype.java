package com.test.sateesh;

public class SwitchCaseAccounttype {

	public static void main(String[] args) {
		
		int account = 21;
		
		switch (account) {
		
		case 10:
			System.out.println("savings account");
			break;
			
		case 11:
			System.out.println("remix savings");
			break;
			
		case 20:
			System.out.println("current account");
			break;
			
		case 21:
			System.out.println("multi currency account");
			break;
			
		case 22:
			System.out.println("foreign currency current account");
			break;
			
		case 30:
			System.out.println("fixed deposit account");
			break;
			
		default :
			System.out.println("invalid account");
		}
	}
		
}