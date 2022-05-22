package com.test.Conditions;

public class PatternT {

	public static void main(String[] args) {
		
          
		for(int i=0; i<=15; i++) {
			
			System.out.print("*");
		}
		
		System.out.println();
		
		for(int i=0; i<=8; i++) {
			
			for(int j=0; j<=15; j++) {
				
				if(j==7) {
					
					System.out.print("*");
				}else {
					
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
			
		}
		
	    
			for(int i=0; i<=15; i++) {
				
				System.out.print("*");
			}
	}

}
