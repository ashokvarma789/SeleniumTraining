package com.test.Loops;

public class PatternC {

	public static void main(String[] args) {
		

	
		for(int i=0; i<=40; i++) {
			
			
			if(i>15 && i<=25) {
				
				System.out.println("*");
			}else if(i ==0 || i== 26) {
				
				System.out.print(" ");
			}
			
			else {
				
				System.out.print("*");
			}
		}

		
	}

}
