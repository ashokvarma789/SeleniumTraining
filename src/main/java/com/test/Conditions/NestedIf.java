package com.test.Conditions;

public class NestedIf {

	public static void main(String[] args) {
	
		int age = 20;
		int weight = 60;
		
		
			if(age >=18) {
						
				if(weight >=70) {
					
					System.out.println("You are Eligible to Donate Blood...!!!");
					
				}else {
					
					System.out.println("You are not Eligible to Donate Blood as your Weight limit is Not Satisfied...!!!");
				}
			}else {
				
				System.out.println("You are not Eligible to Donate Blood as your Age limit is Not Satisfied...!!!");
			}
		
		

	}

}
