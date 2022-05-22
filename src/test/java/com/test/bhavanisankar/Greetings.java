package com.test.bhavanisankar;

public class Greetings {

	public static void main(String[] args) {
		
		float t = 11f;
	
		if (t >= 6 && t < 12) {
			System.out.println("Good Morning.....!");
		}else if (t >= 12 && t < 16) {
			System.out.println("Good Afternoon.....!");
		}else if (t >= 16 && t < 20) {
			System.out.println("Good Evening.....!");
		}else if (t >= 20 && t < 22) {
			System.out.println("Good Night......!");
		}else {
			System.out.println("I am sleeping... So Please don't disturb....!");
		}
	}
}
