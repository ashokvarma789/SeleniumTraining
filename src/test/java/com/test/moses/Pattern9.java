package com.test.moses;

public class Pattern9 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=8;j++) {
				if(j==0 || j==8 || i==0 || i ==5 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=8;j++) {
				if( j==8 || i ==5 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}


	}

}
