package com.test.ashok;

public class Dpattern {

	public static void main(String[] args) {

        for(int row=1; row<=6; row ++)
        {
        	for (int col=1;col<=7;col++) {
        		if(col==1||(col==7 && (row>1 && row<6))||(row==1 && (col%2==1) && (col<=5)) || (row==6 && (col%2==1) && (col<=5)))
        		System.out.print("*");
        		else
            	System.out.print(" ");
        		
        	}
        	
        	System.out.println();
        }

}
	
	
}