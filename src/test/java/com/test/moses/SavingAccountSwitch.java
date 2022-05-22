package com.test.moses;

import java.util.Scanner;

public class SavingAccountSwitch {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Please Select below value to choose account type:");
		System.out.println("10 for Saving Account");
		System.out.println("11 for Remix Saving Account");
		System.out.println("20 for Current Account");
		System.out.println("21 for Multi Current Account");
		System.out.println("22 for Foregin currency Current Account");
		System.out.println("30 for Fixed Deposite");
		
        int type;
        type = Sc.nextInt();
        switch (type) {
        
        case 10:
        	System.out.println("Saving Account");
        	break;
        	
        case 11:
        	System.out.println("Remix Saving Account");
        	break;
        	
        case 20:
        	System.out.println("Current Account");
        	break;
        	
        case 21:
        	System.out.println("Multi Current Account");
        	break;
        	
        case 22:
        	System.out.println("Foregin currency Current Account");
        	break;
        	
        case 30:
        	System.out.println("Fixed Deposite");
        	break;
        	
    	default:
			System.out.println("Invalid Data Entered");
        	
        	
        	
        	
        }
	}

}
