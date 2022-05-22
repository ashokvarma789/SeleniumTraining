package com.test.jyothi;

public class TypeOfAccount {

	public static void main(String[] args) {
		
         int account = 21;
         switch (account) {
         
       case 10 :
         System.out.println("Savings account");
         break;
       case 11 :
    	 System.out.println("Remix savings");
    	 break;
       case 20 :
           System.out.println("Current account");
           break;
       case 21 :
      	 System.out.println("Multi Current Account");
      	 break;
       case 22 :
           System.out.println("Forein Currency Current account");
           break;
       case 30 :
      	 System.out.println("Fixed Deposit Account");
      	 break;
         
      	 default :
      		 System.out.println("Please check the Account Number");
         }
         
         
        		 
	}

}
