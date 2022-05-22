package com.test.ashok;

public class Hpattern {

	public static void main(String[] args) {
        
		for(int i=1; i<=6;i++) {
			
			for(int j=1;j<=9;j++) {
				if(j==1||j==9||(i==3&&(j%2==1))) {
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
