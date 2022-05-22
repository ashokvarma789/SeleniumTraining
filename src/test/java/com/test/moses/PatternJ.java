package com.test.moses;

public class PatternJ {

	public static void main(String[] args) {
		for(int i=0;i<=12;i++){
			System.out.print("*");
		}System.out.println();
		for (int i=0;i<=3;i++) {
			for(int j=0;j<=10;j++) {
				if(j==6) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		for (int i=0;i<=1;i++) {
			for(int j=0;j<=10;j++) {
				if(j== 0 || j==6) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		for(int i=0;i<=6;i++) {
		if(i==0 || i==6) {
			System.out.print(" ");
			}else {
				System.out.print("*");
			}
			
		}

	}

}
