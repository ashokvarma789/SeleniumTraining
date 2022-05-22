package com.test.Conditions;

public class IfElseIfLadder {

	public static void main(String[] args) {
		
		
		int a = 40;
		int b = 10;
		int c = 90;
		int d = 70;
		

		if(a>b && a>c && a>d) {
			
			System.out.println("A is Greater....!!!");
		}else if(b>c && b>d) {
			
			System.out.println("B is Greater....!!!");
		}else if(c > d) {
			
			System.out.println("C is Greater....!!!");
		}else {
			
			System.out.println("D is Greater....!!!");
		}
		
		
	}

}
