package com.test.Prudhvi;

public class Epattern {

	public static void main(String[] args) {
		for (int i=0;i<=12;i++)
		{
			System.out.print("*");
		}
			
		
		System.out.println();
		
		for (int i=0; i <= 8 ; i++)
		{
			for(int j=0; j<=12; j++) 
			{
				if(j==0 ) 
				{
					System.out.print("*");
				}
				else if (i==4)
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
		for (int i=0;i<=12;i++)
		{
			System.out.print("*");
		}
			
		}
	}

