package com.test.moses;

public class PatternA {

	public static void main(String[] args) {
		 int count =20;
		 for(int i = 0; i<= 15;i++) {
			 for(int j=0; j<=40;j++) {
				 if(j== count-i || j== count +i) {
					 System.out.print("*");
				 }
				else if(i==8 && j>= count-i && j<= count+i ) {
					System.out.print("*"); 
				 }else {
					 System.out.print(" ");
				 }
			 }System.out.println();
		 }

	}

}
