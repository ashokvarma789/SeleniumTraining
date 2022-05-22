package com.test.ashok;

public class Fpattern {

	public static void main(String[] args) {
		
        for(int row=1; row<=6; row ++)
        {
        	for (int col=1;col<=6;col++) {
        		if((row==1 || row==3) && col%2==1 || col==1)
        		System.out.print("*");
        		else
        			System.out.print(" ");
        	}
        	
        	System.out.println();
        }

	}

}
