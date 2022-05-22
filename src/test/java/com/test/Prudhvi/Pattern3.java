package com.test.Prudhvi;

public class Pattern3 
{
	public static void main(String[] args) {
	for (int i=0;i<=12;i++)
	{
	if(i==12) 
	{
		System.out.print(" ");
	}
	else 
	{
		System.out.print("*");
	}
		
	}
	System.out.println();
	
	for (int i=0; i <= 8 ; i++)
	{
		for(int j=0; j<=12; j++) 
		{
			if( j==12 && i !=4) 
			{
				System.out.print("*");
			}
			else if (i==4 && j !=12)
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
	if(i==12) 
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
