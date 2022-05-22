package com.test.ashok;

public class Sevenpattern {

	public static void main(String[] args) {
       
              for(int row=1; row<=10;row++) {
			
			     for(int column=1; column<=14;column++)
			{
			      if(row==1 && (column%2==1)|| row==2 && column==12 
			    	|| row==3 && column==11 || row==4 && column==10
			    	|| row==5 && column==9 || row==6 && column==8
			    	|| row==7 && column==7 || row==8 && column==6) {
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
