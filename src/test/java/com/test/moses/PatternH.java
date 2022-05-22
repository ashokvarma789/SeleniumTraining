package com.test.moses;

public class PatternH {

	public static void main(String[] args) {
		for(int i=0;i<=8;i++) {
			if(i == 0 || i == 8) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}System.out.println();
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=8;j++) {
				if(j==0 || j==8) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<=8;i++) {
			System.out.print("*");
		}System.out.println();
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=8;j++) {
				if(j==0 || j==8) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}	

	}

}
