package com.test.Prudhvi;

public class Pattern9 {

	public static void main(String[] args) {
		for(int i=0; i<=11; i++) 
		{
			if(i==0) 
			{
				System.out.print(" ");
			}
			else 
			{
				System.out.print("*");
			}
		}
		
		System.out.println();
		
		for(int i=0; i<=8;i++) 
		{
			for(int j=0;j<=12;j++)
			{
				if(j==12) 
				{	
					System.out.print("*");
				}
				else if(i<3 && j==0)
				{
					System.out.print("*");
				}
				else if (i==3 && j!=0 && j!=11)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}System.out.println();
		}

	}

}
