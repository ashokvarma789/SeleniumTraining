package com.test.bhavanisankar;

public class PhoneNumberUsingSwitch {

	public static void main(String[] args) {
	
		String type="FAX";
		switch (type) {
		
		case "HOM":
			System.out.println("home phone number");
			break;
		case "OFF":
			System.out.println("mobile phone number");
			break;
		case "WRK":
			System.out.println("office phone number");
			break;
		case "FAX":
			System.out.println("fax number");
			break;
		default:
			System.out.println("invalid input");
		}
	}

}
