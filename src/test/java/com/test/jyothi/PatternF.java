package com.test.jyothi;

public class PatternF {

	public static void main(String[] args) {
      for (int i =0;i<=22;i++) {
    	  if (i>7 &&i<=12) {
    		  System.out.println("*");
    	  }else if (i ==0) {
    		  System.out.println(" ");
    	  }else if (i>18 && i<=22) {
    		  System.out.println("*");
    	  }else {
    		  System.out.print("*");
    	  }
      }
	}

}
