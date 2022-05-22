package com.test.ashok;

public class DiamondPattern {

	public static void main(String[] args) {
       
		for(int i=0;i<=5;i++) {
			
			//spaces
			
			for(int j=1;j<=5-i;j++) {
				
				System.out.print(" ");
			}
			
			//rows
			for(int k=1; k<=2*i-1;k++) {
				
				if(k==1 || k==2*i-1) {
				
				System.out.print("*");
				}
				else {
					
					System.out.print(" ");
				}
			}
			
			System.out.println();

		}
		
		for(int i=4; i>=1; i--) {
			
			//spaces
			
			for(int j=1; j<=5-i; j++) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=i*2-1;k++) {
				
				if(k==1 || k== i*2-1) {
				
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
