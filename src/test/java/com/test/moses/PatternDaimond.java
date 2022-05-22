package com.test.moses;

public class PatternDaimond {

	public static void main(String[] args) {
		 int count =20;
			
		 int vari = 40;
		 for(int i = 0; i<= 20;i++) {
			 for(int j=0; j<=40;j++) {
				 if(j== count-i || j== count +i) {
					 System.out.print("*");
				 }
				else {
					 System.out.print(" ");
				 }
			 }System.out.println();
			 }for(int k = 0; k<= 20;k++) {
				 for(int l=0; l<=4;l++) {
					 if(l== k || l == vari -k) {
						 System.out.print("*");
					 }
					else {
						 System.out.print(" ");
					 }
				 }System.out.println();
			 }

	}

}
