package com.test.jyothi;

public class timeoftheday {

	public static void main(String[] args) {
		
		int a=8;
		  
		if(a <=12 && a >=6 && a < 24) {	
			     System.out.println("Good morning..");
			     
			}
		     else if (a >=12 && a <=15 && a < 24 ) {
                 System.out.println("Good Afternoon..");
            }
		     else if (a >=15 && a <=19 && a < 24) {
            	 System.out.println("Good Evening..");
            }
		     else if (a >=19 && a < 24) {
            	System.out.println("Good Night..");
            	
            	
            } else{
            	System.out.println("please enter the valid time in 24 hours format");
            }

}}
