package com.test.ashok;

public class Threepattern {

	public static void main(String[] args) {
        
		for(int row=1; row<=10;row++) {
			
			for(int column=1; column<=10;column++)
			{
               if((row==1 && (column%2 ==1) && column <8) || (row==5 && (column%2 ==1)  && column <8)
            		   ||(row==10 && (column%2 ==1)  && column <8)|| column==10 && row>1 && row<10 && row !=5) {
				System.out.print("*");
               } else {
            	   
            	   System.out.print(" ");
               }
			}   
			
			System.out.println();
		}
	}

}
