package com.test.Prudhvi;

public class HPattern {

	public static void main(String[] args) {
		
		for (int i=0; i <= 10 ; i++)
		{
			for(int j=0; j<=10; j++) 
			{
				if(j==0 || j==10) 
				{
					System.out.print("*");
				}
				else if (i==5)
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

	}

}
