package com.test.moses;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		String type;
		System.out.println("Choose given data to contact by 'Home','off','WRK' or 'FAX' :");
		type = Sc.nextLine();
		switch(type){
		
		case "Home":
			System.out.println("Home phone Number");
			break;
			
		case "off":
			System.out.println("Mobile Phone");
			break;
			
		case "WRK":
			System.out.println("Office Phone");
			break;
			
		case "FAX":
			System.out.println("FAX Number");
			break;
			
			default:
				System.out.println("Invalid Data Entered");
		
			
		}

	}

}
