package com.test.jyothi;

public class PatternD {

	public static void main(String[] args) {
		for (int i =1; i <=19;i++) {
	        if (i>5 && i<=10) {
	    		  System.out.println("*");
	    	      System.out.print("*     ");
	    	      System.out.print(" ");	    	      
	      } else if (i ==6 || i ==19) {
	    	  System.out.print(" ");
	      } else if (i ==12) {
	    	  System.out.println(" ");
	      } else {
	    	  System.out.print("*");
	}
		
}}}
