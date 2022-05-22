package com.test.Prudhvi;

import java.util.Scanner;

public class SwitchAssign1 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Give the String input key in CAPS (HOME,OFFICE,WORK,FAX): ");
		
		String key = sc.next();
		
		switch (key) {
		
		case "HOME" :
			System.out.println("Home Phone Number ");
			break;
			
		case "OFFICE" :
			System.out.println("Mobile Number");
			break;
			
		case "WORK" :
			System.out.println("Office Phone");
			break;
			
		case "FAX":
			System.out.println("Fax Number");
			break;
			
		default :
			System.out.println("Invalid input, Please provide the given input");
		}

	}

}
