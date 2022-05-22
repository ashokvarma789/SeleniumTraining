package com.test.jyothi;

public class ATM {

	public static void main(String[] args) {
            int a = 2345;
            int b = 1000;
            int c = 900;
            
              if (a ==2345) {  
            	  
            	  if (b >=c) {
            		  System.out.println ("Your Transaction is successful..Available bal =" + (b-c));
            	  }else {
            		  System.out.println ("Transaction declined..! insufficient funds in your account");	  
            	  }
            	  
              }else {
            	  System.out.println("Entered PIN is Invalid");
              }
	}

}
