package com.test.sateesh;

public class Dpattern {

	public static void main(String[] args) {
		

		for (int i=0; i<=16; i++) {
			
			if (i==16) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
		}
		        System.out.println();
		        
		 for (int i=0; i<=8; i++) {
		 
		 for (int j=0; j<=16; j++) {	 
			 
			  if (j==0 || j==16) {
				 System.out.print("*");
			 }else {
				 System.out.print(" ");
			 }    
		 }
		        System.out.println();
		 
		 }
		  for (int i=0; i<=16; i++) {
				
				 if (i==16) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
		 }	
	
		
	}

}
