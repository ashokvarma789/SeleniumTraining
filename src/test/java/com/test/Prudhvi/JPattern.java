package com.test.Prudhvi;

public class JPattern {

	public static void main(String[] args) {
		for (int i=0; i<=16; i++)
		{
			System.out.print("*");
		}
		
		System.out.println();
		
		for (int i=0; i<=9; i++)
		{
			for(int j=0; j<=16;j++)
			{
				if(j==8)
				{
					System.out.print("*");
				}
				else if (i>6 && j==0) 
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
		
		for (int i=0; i<=6; i++)
		{
			if(i==0) 
			{
				System.out.print(" ");
			}
			System.out.print("*");	
			
			
		}

	}

}
