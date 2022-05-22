package com.test.vamsi;

public class Excersice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type = "hom";
		

		switch (type) {

		case "HOME" :
			System.out.println("Home Phone Number as kishore  ");
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
