package com.test.Prudhvi;

import java.util.Scanner;

public class PercentageGrader {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Student Percentage: ");
		
		double percentage = sc.nextDouble();
		
		if(percentage>= 70 && percentage<=100) {
			System.out.println("First Class With Distinction");
		}
		else if ( percentage>= 60 && percentage < 70) {
			System.out.println("First Class");
		}
		else if (percentage >=50 && percentage < 60) {
			System.out.println("Second Class");
		}
		else if (percentage>= 35 && percentage <50) {
			System.out.println("Third Class");
		}
		else if (percentage<35 && percentage>0) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Please provide the valid input in percentage to know the student grade");
		}
		
		
		
	}


}
