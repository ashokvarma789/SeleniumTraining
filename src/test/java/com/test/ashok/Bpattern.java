package com.test.ashok;

public class Bpattern {

	public static void main(String[] args) {
          
		for(int row=1;row<=10;row++) {
			
			for(int column=1;column<=13;column++) {
				
				if(column==1 && row>1||(column==13 && row<10 && row >2 && row!=6)||
			     (row==10 && (column<10) &&  (column%2==1))
				||(row==2 && (column<12)&& (column%2==1)) ||(row==10 && (column<12)&& (column%2==1))
				||(row==6 && ((column%2==1) && column<12))) {
					System.out.print("*");
				} else {
					System.out.print(" ");	
				}
			}
			
			System.out.println();
		}
		
		
	}

}
