package com.test.jyothi;

public class PatternJnested {

	public static void main(String[] args) {
		for (int i =0;i <=14;i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i=0;i<=1;i++)
		for (int j=0;j<=1;j++) {
				System.out.println(" "+"       "+"*");
				}  	
		for (int i=0;i<=5;i++)
		for (int j=0;j<=8;j++) 
		if(i==4 ){
				System.out.print("*");
				}
				System.out.println();
		for (int i=0;i<=1;i++)
		for (int j=0;j<=1;j++) {
				System.out.println("*"+"       "+"*");	    
				}
		for (int i =0;i <=7;i++) {
			System.out.print("*");
		}
	}

}
