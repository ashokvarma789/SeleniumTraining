package com.test.bhavanisankar;

public class PatternU {

	public static void main(String[] args) {
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=10; j++) {
				if(j==0 || j==10) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}System.out.println();
		}
		for(int i=0; i<=10; i++) {
			if(i==0 || i==10) {
				System.out.print(" ");
			}else
				System.out.print("*");
		}
	}

}
