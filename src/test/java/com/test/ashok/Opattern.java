package com.test.ashok;

public class Opattern {

	public static void main(String[] args) {
	       for(int row = 1; row<5;row++) {
	    	   
	    	   for(int col=1;col<=5;col++) {
	    		   if((col==1 || col==5) && (row<4 && row>1) || (row==4 || row==1) && col%2==0)
	    		   System.out.print("*");
	    		   else
	        	   System.out.print(" ");
	   
	    	   }
	    	   
			   System.out.println();

	    	   
	       }
	}

}
