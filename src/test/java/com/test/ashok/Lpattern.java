package com.test.ashok;

public class Lpattern {

	public static void main(String[] args) {
       
		  for(int row=1;row<=8;row++)
		  {
			  for(int col=1;col<=8;col++)
			  {
				 if(col==1 || (row==8 && col%2==1))
				  System.out.print("*");
				 else
					 System.out.print(" ");
			  }
			  
			  System.out.println();

		  }
	}

}
