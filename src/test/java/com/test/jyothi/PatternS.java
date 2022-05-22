package com.test.jyothi;

public class PatternS {

	public static void main(String[] args) {
		for (int i =0; i <=25;i++) {
	    	  if (i>5 && i<=9) {
	    		  System.out.println("*");
	    		  
	      } else if (i ==0||i ==16 ||i ==25) {
	    	  System.out.print(" ");
	      } else if (i ==17) {
	    	  System.out.println(" ");
	    	  System.out.print("      *");
    	      System.out.println(" ");
	    	  System.out.print("      *");
    	      System.out.println(" ");
    	      System.out.print("      *");
	      } else if(i ==18){
	    	  System.out.println(" ");
	      }else {
	    	  System.out.print("*");
	}

}}}
