package com.test.moses;

import java.util.Scanner;

public class StudentPercentage {

	public static void main(String[] args) {
		double x;
		Scanner Sc= new Scanner(System.in);
		x = Sc.nextDouble();
		
		if(x>=70 && x<= 100)
		{
			System.out.println("Studant passed with First class Distinction");
		}
		else if(x>=60 && x< 70)
		{
			System.out.println("Studant passed with First class");
		}
		else if(x>=50 && x< 60)
		{
			System.out.println("Studant passed with Second class");
		}
		else if(x>=35 && x<= 50)
		{
			System.out.println("Studant passed with Third class");
		}
		else if(x>=0 && x<35) {
			System.out.println("Studant is failed");
		}
		else {
			System.out.println("Please enter value b/w 0 to 100");
		}

	}

}
