package com.test.bhavanisankar;

public class StudentPercentage {

	public static void main(String[] args) {
		float p = 34.9f;
		
			if (p>=70 && p<=100) {
				System.out.println("Congrats... FirstClass With Distinction");	
			}else if (p>=60 && p<70) {
				System.out.println("Congrats... FirstClass");
			}else if (p>=45 && p<60) {
				System.out.println("SecondClass.. Need to Improve");
			}else if (p>=35 && p<45) {
				System.out.println("ThirdClass... Need to Improve");
			}else {
				System.out.println("You are failed.. Better luck next time");
			}
				
	}

}