package com.test.moses;

public class PatternO {

	public static void main(String[] args) {
		for(int i =1;i<=87;i++) {
			if(i == 1 || i>=13 && i<=21 || i >=24 && i<=32 || i>=35 && i<=43 || i >=46 && i<=54 || i>= 57 && i<= 65 ||i>=68 && i<=76 || i==78  ) {
				System.out.print(" ");
			
			}else if(i==11 ){
				System.out.println(" ");
			}
			else if(i==22 || i == 33 || i==44 || i ==55 || i ==66 || i==77 ) {
				System.out.println("*");
			}
			else {
				System.out.print("*");
			}
		}

	}

}
