package com.test.Prudhvi;

public class PatternO {

	public static void main(String[] args) {
		
		for(int i =0 ; i <= 16; i++) 
		{
			if(i==0 || i==16) 
			{
				System.out.print(" ");
			}
			else 
			{
				System.out.print("*");
			}
				
		
		}
		System.out.println();
		
		//now printing no of rows by i and columns by j
		
		for (int i =0; i<=9; i++) 
		{
			for (int j=0;j<=16;j++) 
			{
				if(j==0 || j==16) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i =0 ; i <= 16; i++) 
		{
			if(i==0 || i==16) 
			{
				System.out.print(" ");
			}
			else 
			{
				System.out.print("*");
			}
				
		
		}
		

	}
}
