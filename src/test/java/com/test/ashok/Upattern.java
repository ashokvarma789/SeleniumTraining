package com.test.ashok;

public class Upattern {

	public static void main(String[] args) {
         
		for(int row=1; row<=10; row++) {
			
			for(int column=1;column<=11;column++) {
				
				if((column==1 &&row<10)||(column==11&&row<10)||(row==10 &&(column%2==0))) {
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
