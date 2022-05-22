package com.test.moses;

public class PatternU {

	public static void main(String[] args) {
		for(int i=0;i<=12;i++) {
			for(int j=0;j<=12;j++) {
				if(j== 0 || j== 12) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println(" ");
		}for (int i=1;i<=1;i++) {
			for(int j=0;j<=12;j++) {
				if(j== 0 || j== 12) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
		}

	}

	}

}
