package com.test.moses;

public class PatternF {

	public static void main(String[] args) {
	for(int i =1;i<=30;i++){
			
			if(i == 10 || i == 11 || i == 12 || i ==13  ) {
				System.out.println("*");
			}else if(i >=14 && i<=22 ) {
				System.out.print("*");
			}else if(i ==23) {
				System.out.println("*");
			}else if(i >= 24 && i<= 30) {
				System.out.println("*");
			}
		
			else {
				System.out.print("*");
			}
		
		}

	}

}
