package com.test.ashok;

public class Epattern {

	public static void main(String[] args) {
		
		for (int row=1; row<=10; row++)
		{
			for (int column=1; column<=11; column++) {
				
				if(column==1 && row>1 && row<10 || (row==1 && (column%2==1) && column>2) || (row==5 && (column%2==1))
						|| (row==10 && (column%2==1) && column>2)) {
			
			System.out.print("*");
			
			}
			
			else
			{
				System.out.print(" ");

			}
			
		}
			System.out.println();

}

}

}