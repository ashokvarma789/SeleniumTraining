package com.test.Conditions;

public class PatternP {

	public static void main(String[] args) {
		
for(int i=0; i<=16; i++) {
			
			if(i==16) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
			
			
		}
		
		System.out.println();
		
		
		for(int i=0; i<= 6; i++) {
			
			for(int j=0; j<=16; j++) {
				
				if(j==0 || j== 16) {
					
					System.out.print("*");
				}else {
					
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
			
		}
		
		

		for(int i=0; i<=16; i++) {
			
			if( i==16) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
			
			
		}
		
		System.out.println();
		
			for(int i=0; i<=5; i++) {
			
			
			System.out.println("*");
		}
		
	}

}
