package com.test.moses;

public class Pattern3 {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=10;j++) {
				if(j==10 || i==0 || i ==10 || i==5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}

	}

}
