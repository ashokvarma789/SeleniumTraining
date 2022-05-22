package com.test.vamsi;

public class Ex10PatternO {

	public static void main(String[] args) {
		for (int i =0; i <=19;i++) {
	    	  if (i>5 && i<=10) {
	    		  System.out.println("*");
	    	      System.out.print("*     ");
	    	      System.out.print(" ");
	      } else if (i ==0||i ==12 ||i ==19) {
	    	  System.out.print(" ");
	      } else if (i ==11) {
	    	  System.out.println("*");
	      } else {
	    	  System.out.print("*");
	      }
	    	  
	      }
		

	}

}
