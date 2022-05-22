package com.test.Prudhvi;

import java.util.Scanner;

public class GreetingMessage {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the current time in 0 to 24 hrs");
		
		short CurrentTime = 0;
		CurrentTime= sc.nextShort();
		
		if (CurrentTime>=0 && CurrentTime<=11) {
			System.out.println("Good Morning");
		}
		else if (CurrentTime>11 && CurrentTime<=15) {
			System.out.println("Good AFternoon");
		}
		else if ( CurrentTime>15 && CurrentTime <= 19) {
			System.out.println("Good Evening");
		}
		else if (CurrentTime>19 && CurrentTime<=24) {
			System.out.println("Good Night");
		}
		else {
			System.out.println("Please enter the valid input between 0 to 24 hrs");
		}	
	}
}
