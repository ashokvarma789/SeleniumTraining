package com.test.ashok;

public class Ninepattern {

	public static void main(String[] args) {
		 for(int row=1; row<=10;row++) {
				
		     for(int column=1; column<=14;column++)
		{      
		    	 if((column==1 && row < 5 && row>1)|| (column==14 && row>1 && row<10 ) 
		    			||(row==1 && (column%2==1) && column>1 && column<12)
		    	 || (row==5 && (column%2==1) && column>1 && column<12) 
		    	 || (row==10 && column>1 && (column%2==1) && column<12)) {
		    	 System.out.print("*");
		    	 }
		    	 else {
		    		 
		    		System.out.print(" "); 
		    	 }
		    	 }
		     System.out.println();
	 
		   }
		     
		     
	   }
	}


