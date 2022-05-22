package com.test.sivamohand;

public class SwitchCase {

	public static void main(String[] args) {
         
		String value = "WORK";
		

		switch (value) {

		case "HOME" :
			System.out.println("Home Phone Number");
			break;

		case "OFF" :
			System.out.println("Mobile Phone");
			break;

		case "WORK" :
			System.out.println("Office Phone");
			break;

		case "FAX":
			System.out.println("Fax Number");
			break;

		default :
			System.out.println("Invalid input");
         }
     }
}