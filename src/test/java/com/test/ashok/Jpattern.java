package com.test.ashok;

public class Jpattern {

	public static void main(String[] args) {
		for(int i=1; i<=6;i++) {
			
			for(int j=1;j<=12;j++) {
				if((i==1 && j%2==1)||((j==6 && i>1) && i<6) ||((i==6 && j%2==1) && j<6)) {
				System.out.print("*");
				}
				
				else {
					System.out.print(" ");
					
				}
			}
			
			System.out.println();
		}
	}

}
